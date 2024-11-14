package com.spring_test.learn_spring_framework;

import com.spring_test.learn_spring_framework.game.GameRunner;
import com.spring_test.learn_spring_framework.game.MarioGame;
import com.spring_test.learn_spring_framework.game.PacmanGame;
import com.spring_test.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		
		//var : automatically define the type the variable
//		var game = new SuperContraGame();
//		var game = new MarioGame();
		var game = new PacmanGame(); //1: Oabject Creation
		var gameRunner = new GameRunner(game); 
			//2: Object Creation +  Wiring of Dependency
			//Game is a Dependency of GameRunner
		gameRunner.run();
		

	}

}
