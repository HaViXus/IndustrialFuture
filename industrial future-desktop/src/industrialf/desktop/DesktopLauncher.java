package industrialf.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics.DisplayMode;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


import industrialf.IndustrialFutureGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.vSyncEnabled = true; // Setting to false disables vertical sync
		config.foregroundFPS = 0; // Setting to 0 disables foreground fps throttling
		config.backgroundFPS = 60; // Setting to 0 disables background fps throttling
		config.width = 1080; //640
		config.height = 720; //480
	//config.allowSoftwareMode = true;
	//	config.width = 1920; //640
	//	config.height = 1080; //480
	//	config.height = 1080;
	//	config.width = 1920;
	//	config.fullscreen = true;
		//config.samples = 0;
			
	
		
		new LwjglApplication(new IndustrialFutureGame(), config);
		
	}
}
