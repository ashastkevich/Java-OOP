package org.example.seminar3.task1;

public interface Game {
    void start(Integer sizeWord, Integer attempts);
    Answer inputValue(String value, int attempt);
    GameStatus getGameStatus();
    int getAttempts();
}
