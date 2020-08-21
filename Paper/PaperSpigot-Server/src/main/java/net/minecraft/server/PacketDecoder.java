package net.minecraft.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import net.scandicraft.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class PacketDecoder extends ByteToMessageDecoder {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Marker PACKET_RECEIVED = MarkerManager.getMarker("PACKET_RECEIVED", NetworkManager.b);
    private final EnumProtocolDirection protocolDirection;

    public PacketDecoder(EnumProtocolDirection enumprotocoldirection) {
        this.protocolDirection = enumprotocoldirection;
    }

    protected void decode(ChannelHandlerContext channelhandlercontext, ByteBuf bytebuf, List<Object> list) throws Exception {
        if (bytebuf.readableBytes() != 0) {
            PacketDataSerializer packetdataserializer = new PacketDataSerializer(bytebuf);
            int packetId = packetdataserializer.e();
            Packet packet = channelhandlercontext.channel().attr(NetworkManager.c).get().a(this.protocolDirection, packetId);

            if (Config.ENV == Config.ENVIRONNEMENT.PROD) {
                //fake packet id in prod
                packetId += new Random().nextInt(50);
            }

            if (packet == null) {
                throw new IOException("Bad packet id " + packetId);
            } else {
                packet.a(packetdataserializer);
                if (packetdataserializer.readableBytes() > 0) {
                    throw new IOException("Packet " + channelhandlercontext.channel().attr(NetworkManager.c).get().a() + "/" + packetId + " (" + packet.getClass().getSimpleName() + ") was larger than I expected, found " + packetdataserializer.readableBytes() + " bytes extra whilst reading packet " + packetId);
                } else {
                    list.add(packet);
                    if (PacketDecoder.LOGGER.isDebugEnabled()) {
                        PacketDecoder.LOGGER.debug(PacketDecoder.PACKET_RECEIVED, " IN: [{}:{}] {}", channelhandlercontext.channel().attr(NetworkManager.c).get(), packetId, packet.getClass().getName());
                    }
                }
            }
        }
    }
}
