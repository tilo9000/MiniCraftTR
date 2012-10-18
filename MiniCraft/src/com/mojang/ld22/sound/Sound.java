package com.mojang.ld22.sound;

import java.applet.Applet;
import java.applet.AudioClip;

import de.fuennef.minicraft.ResourceManager;

public class Sound {
	public static final Sound playerHurt = new Sound(ResourceManager.SND_PLAYERHURT);
	public static final Sound playerDeath = new Sound(ResourceManager.SND_PLAYERDEAD);
	public static final Sound monsterHurt = new Sound(ResourceManager.SND_MONSTERHURT);
	public static final Sound test = new Sound(ResourceManager.SND_TEST);
	public static final Sound pickup = new Sound(ResourceManager.SND_PICKUP);
	public static final Sound bossdeath = new Sound(ResourceManager.SND_BOSSDEATH);
	public static final Sound craft = new Sound(ResourceManager.SND_CRAFT);

	private AudioClip clip;

	private Sound(String name) {
		try {
			clip = Applet.newAudioClip(ResourceManager.getResURL(name));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void play() {
		try {
			new Thread() {
				public void run() {
					clip.play();
				}
			}.start();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}