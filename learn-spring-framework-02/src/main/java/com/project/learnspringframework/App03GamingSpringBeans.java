package com.project.learnspringframework;

import com.project.learnspringframework.game.GameConsole;
import com.project.learnspringframework.game.GameRunner;
import com.project.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class);
        }
    }
}
