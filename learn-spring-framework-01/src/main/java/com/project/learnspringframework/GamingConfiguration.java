package com.project.learnspringframework;

import com.project.learnspringframework.game.GameConsole;
import com.project.learnspringframework.game.GameRunner;
import com.project.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }
}
