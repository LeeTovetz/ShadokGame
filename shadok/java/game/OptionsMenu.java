package shadok.java.game;

import java.util.Scanner;

public class OptionsMenu {


    static Scanner scanner = new Scanner(System.in);
    static int command;

    public static void showOptionsMenu() {

        do {
            System.out.println("Make your choice and press Enter\n" +
                    "1: Show current settings\n" +
                    "2: Change settings\n" +
                    "3: Exit");
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("\n Current settings:\n" +
                            "rows: " + Main.rows +
                            "\ncolumns: " + Main.columns +
                            "\nenemies: " + Main.amountOfEnemies +
                            "\ntransistors: " + Main.transistorsNeeded +
                            "\nmoves: " + Main.moves +
                            "\nflowers: " + Main.getAmountOfFlowers);
                    break;
                case 2:
                    String value;

                    System.out.println("Enter a new value for rows, leave blank to keep current value [" + Main.rows + "] : ");

                    scanner.nextLine();

                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.rows = Integer.parseInt(value);
                    }

                    System.out.println("Enter a new value for columns, leave blank to keep current value [" + Main.columns + "] : ");
                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.columns = Integer.parseInt(value);
                    }
                    System.out.println("Enter a new value for enemies, leave blank to keep current value [" + Main.amountOfEnemies + "] : ");
                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.amountOfEnemies = Integer.parseInt(value);
                    }
                    System.out.println("Enter a new value for transistors, leave blank to keep current value [" + Main.transistorsNeeded + "] : ");
                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.transistorsNeeded = Integer.parseInt(value);
                    }
                    System.out.println("Enter a new value for moves, leave blank to keep current value [" + Main.moves + "] : ");
                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.moves = Integer.parseInt(value);
                    }
                    System.out.println("Enter a new value for flowers, leave blank to keep current value [" + Main.getAmountOfFlowers + "] : ");
                    value = scanner.nextLine();
                    if (!value.isBlank()) {
                        Main.getAmountOfFlowers = Integer.parseInt(value);
                    }

                    if (isValuesNotPlayable()) {
                        System.out.println("Values you entered are not playable, please verify and try again!");
                    }

                    break;


                case 3:
                    break;
                default:
                    System.out.println("Command not recognized, please try again!");
                    break;
            }
        }
        while (command != 3);

    }

    private static Boolean isValuesNotPlayable() {

        int fieldSize = Main.rows * Main.columns;

        int allGameObjects = Main.amountOfEnemies + Main.getAmountOfFlowers + 1;

        boolean isValuesNotPlayable = ((allGameObjects / fieldSize) > 0.75);

        return isValuesNotPlayable;

    }
}