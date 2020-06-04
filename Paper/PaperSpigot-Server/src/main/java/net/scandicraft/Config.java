package net.scandicraft;

public class Config {
    public static final ENVIRONNEMENT ENV = ENVIRONNEMENT.DEV;

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
