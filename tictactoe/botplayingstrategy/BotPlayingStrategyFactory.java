package tictactoe.botplayingstrategy;

import tictactoe.models.BotDifficultyLevel;

// Factory Method.
public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        // have if else and implement on your own
        return new EasyBotPlayingStrategy();
    }
}
