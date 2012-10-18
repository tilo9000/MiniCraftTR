package de.fuennef.minicraft;

import java.io.InputStream;
import java.net.URL;

public class ResourceManager {
	
	public static final String RES_FOLDER = "/res/";
	public static final String RES_ICONS = "icons.png";
	public static final String SND_PLAYERHURT = "playerhurt.wav";
	public static final String SND_PLAYERDEAD = "death.wav";
	public static final String SND_MONSTERHURT = "monsterhurt.wav";
	public static final String SND_TEST = "test.wav";
	public static final String SND_PICKUP = "pickup.wav";
	public static final String SND_BOSSDEATH = "bossdeath.wav";
	public static final String SND_CRAFT = "craft.wav";
	
	
	/**
	 * Return complete file path to resource for file
	 * 
	 * @param file
	 * @return
	 */
	public static String getResFileName(String file){
		
		return RES_FOLDER + file;
		
	}

	public static InputStream getResInputStream(String file){
		return ResourceManager.class.getResourceAsStream(getResFileName(file));
	}
	
	public static URL getResURL(String file){ 
		return ResourceManager.class.getResource(getResFileName(file));
	}
}
