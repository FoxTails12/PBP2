package me.FoxTails12.PBP;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class pbp extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static pbp plugin;
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " has been Disabled!");
	}
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " has been enabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(commandLabel.equalsIgnoreCase("write")) {
			//WHAT DO I DO HERE
			
			FileConfiguration customConfig = null;
			File customConfigFile = null;
			customConfigFile = new File(getDataFolder(), "customConfig.yml");
			customConfig = YamlConfiguration.loadConfiguration(customConfigFile);
			InputStream defConfigStream = this.getResource("customConfig.yml");
			getConfig().set(args[0], args[1]);
		}
		return false;
	}
}
