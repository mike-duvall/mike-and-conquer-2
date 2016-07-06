package com.mikeduvall.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cookbook.samples.SpriteBatchSample;
import com.mikeduvall.MikeAndConquerGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		new LwjglApplication(new MikeAndConquerGame(), config);
		new LwjglApplication(new SpriteBatchSample(),  config);
	}
}
