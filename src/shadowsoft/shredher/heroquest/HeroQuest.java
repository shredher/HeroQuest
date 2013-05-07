package shadowsoft.shredher.heroquest;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class HeroQuest {
	public void start() {
		try {
			Display.setDisplayMode(new DisplayMode(1600,1200));
			Display.create();
		}
                catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// init OpenGL here
		
		while (!Display.isCloseRequested()) {
			
			// render OpenGL here
			
			Display.update();
		}
		
		Display.destroy();
	}
	
	public static void main(String[] argv) {
		HeroQuest displayExample = new HeroQuest();
		displayExample.start();
	}
}
