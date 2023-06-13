package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    //var game = new MarioGame();
    //var game = new SuperContraGame();
    //var game = new PacmanGame(); //1: Object Creation
//    var gameRunner = new GameRunner(game);
    //2: Object Creation + Wiring of Dependencies (i.e. the game class is injected into the GameRunner class)
    // 'game' is a dependency of the GameRunner class

//    gameRunner.run();
}
