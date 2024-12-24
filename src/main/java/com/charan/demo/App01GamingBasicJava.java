package com.charan.demo;

import com.charan.demo.game.GameRunner;
import com.charan.demo.game.MarioGame;
import com.charan.demo.game.PacMan;
import com.charan.demo.game.SuperContraGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args)
    {

        var gameMario = new MarioGame();
        var gameSuper = new SuperContraGame();
        var gamePac = new PacMan();
        var gameRunner = new GameRunner(gamePac);
        gameRunner.run();

    }
}
