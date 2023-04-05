package org.example.seminar3.task1;


import java.util.Scanner;

/*
3) Разработка игры “быки - коровы” (игрок против компьютера)
a)	Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus)
b)	Абстрактный класс AbstractGame (который предзаполняет слово компьютера - generateWord(),
    на основе generateCharList() - который является абстрактным методом)
c)	Статусная модель с помощью перечислений(GameStatus)
d)	Класс ответа Answer
e)	Классы реализующие AbstractGame(предполагается игра на числах,англ буквах, русских буквах)
f)	* реализовать restart().
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("1 - Numbers");
        System.out.println("2 - Word in english");
        System.out.println("3 - Слово на русском");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your game: ");
        int num = scanner.nextInt();
        Game game = null;
        switch (num){
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EnGame();
                break;
            case 3:
                game = new RuGame();
                break;
        }
        game.start(4,3);
        int countAttempts = 1;
        while (game.getGameStatus().equals(GameStatus.START)){
            System.out.println("Your move: ");
            String answer = scanner.next();
            Answer answerGame = game.inputValue(answer, countAttempts);
            System.out.println("Cows = " + answerGame.getCows() + " Bulls = " + answerGame.getBulls());
            countAttempts++;
        }
        if (game.getGameStatus().equals(GameStatus.WIN)) System.out.println("You win!");
        if (game.getGameStatus().equals(GameStatus.LOSE)) System.out.println("You lose!");
    }
}
