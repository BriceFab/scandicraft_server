package net.scandicraft;

import org.bukkit.ChatColor;

public class Config {
    public static final ENVIRONNEMENT ENV = ENVIRONNEMENT.DEV;
//    public static final Integer HANDSHAKE = -20062020;  //real = 47
    public static final Integer HANDSHAKE = 47;  //real = 47
    public static final String OUTDATED_MESSAGE = ChatColor.RED + "Télécharge le launcher sur https://scandicraft-mc.fr/";  //si pas le bon handshake

    public enum ENVIRONNEMENT {
        DEV("dev"),
        TEST("test"),
        PROD("prod");

        private final String name;

        ENVIRONNEMENT(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
