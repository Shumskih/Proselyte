package main.java.net.proselyte.Practice.NoughtsAndCrosses.NoughtsAndCrosses;

import java.util.Scanner;
import java.util.Arrays;

class GameLogic {

    Field field = new Field();

    String computerCellsArr[] = {"0", "0", "0", "0", "0"}; // Ходы компьютера
    String playerCellsArr[] = {"0", "0", "0", "0", "0"}; // Ходы игрока

    String winner = null;
    boolean gameOver = false; // При присваивании true игра заканчивается

    void welcomeToTheGame() {

        System.out.println("Крестики-Нолики");
        System.out.println("===============");
        System.out.println();
        System.out.println("Добро пожаловать в игру!");
        System.out.println("------------------------");
        System.out.println();
    }

    void player() { // Ход игрока
        Scanner in = new Scanner(System.in);

        System.out.print("=> Твой ход: ");
        String playerInput = in.next();
        System.out.println("=> Ты ввёл: " + playerInput);

        int i;
        for (i = 0; i < field.cells.length; i++) {
            while (field.cells[i].equals(playerInput)) { // Если номер ячейки есть в массиве, выводится сообщение
                System.out.print("Ячейка под номером " + field.cells[i] + " занята. Введи номер свободной ячейки: ");
                playerInput = in.next();
            }

            if ((!field.cells[i].equals(playerInput) & field.cells[i].equals("0"))) { // Если номера ячейки нет в массиве и номер ячейки равен "0", присваивается введённое пользователем значение
                System.out.println("cells массив:");
                field.cells[i] = playerInput;
                System.out.println(Arrays.toString(field.cells));
                System.out.println();
                break;
            }

        }

        for (i = 0; i < playerCellsArr.length; i++) {
            if ((!playerCellsArr[i].equals(playerInput) & playerCellsArr[i].equals("0"))) { // Запись ходов игрока
                System.out.println("Твои ходы:");
                playerCellsArr[i] = playerInput;
                System.out.println(Arrays.toString(playerCellsArr));
                System.out.println();
                break;
            }
        }

        isFullBusyCellsArr(); // Проверяем, заполнено ли поле
        isWinner();
        if (!gameOver) {      // Если переменной gameOver не присвоено значение true, ходит компьютер
            computer();
        }
    }


    void computer() { // Ход компьютера

        int compInput = (int) (Math.random() * 10);
        String computerChoice = Integer.toString(compInput);
        System.out.println();
        System.out.println("Computer: " + computerChoice);

        int i;
        for (i = 0; i < field.cells.length; i++) {
            while (field.cells[i].equals(computerChoice) | compInput == 0) {

                compInput = (int) (Math.random() * 10);

                if (field.cells[i].equals("1") | field.cells[i].equals("2") | field.cells[i].equals("3")
                        | field.cells[i].equals("4") | field.cells[i].equals("5") | field.cells[i].equals("6")
                        | field.cells[i].equals("7") | field.cells[i].equals("8") | field.cells[i].equals("9")) {

                    System.out.println("Номер не канает. Меняем:");
                    compInput = (int) (Math.random() * 10);
                    computerChoice = Integer.toString(compInput);
                    System.out.println("Computer: " + computerChoice);
                }
            }



            if ((!field.cells[i].equals(computerChoice) & field.cells[i].equals("0"))) {
                System.out.println("cells массив:");
                field.cells[i] = computerChoice;
                System.out.println(Arrays.toString(field.cells));
                System.out.println();
                break;
            }
        }

        for (i = 0; i < computerCellsArr.length; i++) {
            if ((!computerCellsArr[i].equals(computerChoice) & computerCellsArr[i].equals("0"))) {
                computerCellsArr[i] = computerChoice;
                System.out.println("computerCellsArr массив:");
                System.out.println(Arrays.toString(computerCellsArr));
                System.out.println();
                break;
            }
        }
    }

    void isFullBusyCellsArr() { // Проверяет, все ли числа отличны от 0. Если все, присваивает gameOver значение true

        if (!field.cells[0].equals("0") & !field.cells[1].equals("0") & !field.cells[2].equals("0")
                & !field.cells[3].equals("0") & !field.cells[4].equals("0") & !field.cells[5].equals("0")
                & !field.cells[6].equals("0") & !field.cells[7].equals("0") & !field.cells[8].equals("0")) {

            gameOver = true;
            gameOver();

        }
    }

    void gameOver() { // Выводит сообщение об окончании игры

        if (gameOver) {
            System.out.println("=============");
            System.out.println("=============");
            System.out.println("Game over!!!!");
            System.out.println("=============");
            System.out.println("=============");
        }
    }

    void isWinner() {

        if (playerCellsArr.equals("1") & playerCellsArr.equals("2") & playerCellsArr.equals("3")) {

            winner = "player";
            gameOver = true;
            System.out.println("Плэйер винз!");
        }
    }

    void start() {

        welcomeToTheGame();

        while(!gameOver)
            player();
    }

    /*void test() {
        Field field = new Field();
        System.out.print(Arrays.deepToString(field.winningCombinations));
    }*/
}
