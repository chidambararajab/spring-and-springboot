package com.project.learnspringframework.game;

public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
