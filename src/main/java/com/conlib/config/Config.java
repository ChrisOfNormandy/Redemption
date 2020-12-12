package com.conlib.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CONFIG;

	static {
		
		BUILDER.push("Chance Rates");
		Chance.init(BUILDER);
		BUILDER.pop();

		BUILDER.push("Elements");
		Element.init(BUILDER);
		BUILDER.pop();
		
		BUILDER.push("Enable/Disable Options");
		Enable.init(BUILDER);
		BUILDER.pop();	
		
		BUILDER.push("Dimensions");
		Dimension.init(BUILDER);
		BUILDER.pop();

		CONFIG = BUILDER.build();
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE)
				.build();
		file.load();
		config.setConfig(file);
	}
}