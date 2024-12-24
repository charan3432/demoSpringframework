package com.charan.demo;

import com.charan.demo.game.GameRunner;
import com.charan.demo.game.GamingConsole;
import com.charan.demo.game.MarioGame;
import com.charan.demo.game.PacMan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguaration {

    @Bean
    public GamingConsole gamePacman()
    {
        var game = new PacMan();
        return game;
    }

    @Bean
    @Primary
    public GameRunner gameRunnerPac(GamingConsole gamePacman)
    {
        var gameRunner = new GameRunner(gamePacman);
        return gameRunner;
    }


    //        var gameMario = new MarioGame();
//        var gameSuper = new SuperContraGame();
//        var gamePac = new PacMan();
//        var gameRunner = new GameRunner(gamePac);
//        gameRunner.run();

}
