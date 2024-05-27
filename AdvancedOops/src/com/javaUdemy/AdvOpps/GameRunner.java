package com.javaUdemy.AdvOpps;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		game.left();
//		game.up();
//		game.down();
//		game.right();
//
//		GamingInterface chess = new ChessGame();
//
//		chess.left();
//		chess.right();
//		chess.up();
//		chess.down();

		GamingInterface[] games = { new MarioGame(), new ChessGame() };

		for (GamingInterface game : games) {
			game.down();
			game.left();
			game.right();
			game.up();
		}

	}

}
