package com.project.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GameConsole game) {
        this.game = game;
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
