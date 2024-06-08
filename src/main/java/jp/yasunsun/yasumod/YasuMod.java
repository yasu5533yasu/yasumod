package jp.yasunsun.yasumod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = YasuMod.MOD_ID, name = YasuMod.MOD_NAME, version = YasuMod.MOD_VERSION, acceptedMinecraftVersions = YasuMod.MOD_ACCEPTED_MC_VERSIONS, useMetadata = true)
public class YasuMod {
    public static final String MOD_ID = "yasumod";
    public static final String MOD_NAME = "YasuMod";
    public static final String MOD_VERSION = "1.0.0";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12.2]";

    @Instance("yasumod")
    public static YasuMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
