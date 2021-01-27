package me.cyberdie22.mcdeobf;

public class Main {

    private static final String MINECRAFT_VERSION_REGEX = "^\\d+w\\d+[a-z]$|^\\d+\\.\\d+\\.\\d+$";

    private static String minecraftVersion = "LATEST";
    private static String mappings = "YarnBuiltin";
    private static String decompiler = "FernflowerBuiltin";

    private static String returnType = "MappedJars";

    public static void main(String[] args) {
        getMinecraftVersion();
        getMinecraftMappings();
        getJavaDecompiler();
        downloadMinecraftJars();
        downloadMinecraftLibs();
        downloadMappings();
        downloadDecompiler();
        mergeClientServerJars();
        mapJarToIntermediary();
        mapJarToNamed();
    }

    public static void getMinecraftVersion() {
        System.out.println("What version of Minecraft do you want? (LATEST for latest version, LATEST_SNAPSHOT for latest snapshot version)");
        minecraftVersion = System.console().readLine();
        if (!minecraftVersion.matches(MINECRAFT_VERSION_REGEX)) {
            System.out.println(minecraftVersion + " does not match a valid minecraft version");
            getMinecraftVersion();
        }
    }

    public static void getMinecraftMappings() {
        System.out.println("What mappings do you want to use? (Mojang (Strict License), MCP (Strict License), Spigot (Strict License, currently unavailable), Yarn (MIT License)");
        mappings = System.console().readLine();
        if (!(mappings.equals("Mojang") || mappings.equals("MCP") || mappings.equals("Spigot") || mappings.equals("Yarn"))) {
            System.out.println(mappings + " is not a valid mapping");
            getMinecraftMappings();
        }
    }

    public static void getJavaDecompiler() {
        System.out.println("What Java decompiler do you want to use? (FernflowerBuiltin, FernflowerDownload, CFRYarn (Requires Yarn mappings), CFRDownload");
        decompiler = System.console().readLine();
        if (!(decompiler.equals("FernflowerBuiltin") || decompiler.equals("FernflowerDownload") || decompiler.equals("CFRYarn") || decompiler.equals("CFRDownload"))) {
            System.out.println(decompiler + "is not a valid decompiler");
            getJavaDecompiler();
        }
    }

    public static void downloadMappings() {
        System.out.println("Using builtin Yarn mappings");
    }

    public static void downloadDecompiler() {
        System.out.println("Using builtin Fernflower decompiler");
    }

    public static void downloadMinecraftJars() {

    }

    public static void downloadMinecraftLibs() {

    }

    public static void mergeClientServerJars() {

    }

    public static void mapJarToIntermediary() {
        if (!mappings.equals("Yarn")) return;
    }

    public static void mapJarToNamed() {

    }

}
