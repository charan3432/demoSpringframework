package com.charan.demo;

import com.charan.demo.game.GameRunner;
import com.charan.demo.game.GamingConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpringBean {
    public static void main(String[] args)
    {
        try(var context = new AnnotationConfigApplicationContext(GameConfiguaration.class)) {
//            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        };





//        var gameMario = new MarioGame();
//        var gameSuper = new SuperContraGame();
//        var gamePac = new PacMan();
//        var gameRunner = new GameRunner(gamePac);
//        gameRunner.run();

    }
}
