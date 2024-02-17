package com.project.learnspringframework;

import com.project.learnspringframework.game.GameRunner;
import com.project.learnspringframework.game.MarioGame;
import com.project.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

    }
}
