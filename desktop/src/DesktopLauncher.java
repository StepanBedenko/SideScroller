import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Game myGame = new PlaneDodgerGame();
		LwjglApplication launcher = new LwjglApplication(myGame, "Plane Dodger", 800, 600);
	}
}
