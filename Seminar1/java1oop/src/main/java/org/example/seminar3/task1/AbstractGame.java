package org.example.seminar3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game{
    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;
    ArrayList<String> history = new ArrayList<>();
    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        this.word = generateWord();
        this.gameStatus = GameStatus.START;
       // ArrayList<String> history = new ArrayList<>();
    }

    @Override
    public Answer inputValue(String value, int attempt) {
        int bulls = 0;
        int cows = 0;
        history.add(value);
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) bulls++;
            Character character = value.charAt(i);
            if (word.contains(character.toString())) cows++;
        }
        if (bulls == value.length()) gameStatus = GameStatus.WIN;
        if (attempt == this.attempts) gameStatus = GameStatus.LOSE;
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public int getAttempts() {
        return attempts;
    }

    private String generateWord(){
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWord;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    abstract List<String> generateCharList();
}
