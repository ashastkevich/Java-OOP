package org.example.seminar3.task1;

import java.util.ArrayList;

public interface Game {
    void start(Integer sizeWord, Integer attempts);
    Answer inputValue(String value, int attempt);
    GameStatus getGameStatus();
    int getAttempts();
    ArrayList<String> getHistory();
}
