package dev.jimmys;

import dev.jimmys.display.Display;

public class Launcher {
	public static void main(String [] args) {
		Game game = new Game("Jimmys", 400, 400);
		game.start();
	}

}
