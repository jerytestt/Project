package me.kevin.project.game;

public class Game {

    private boolean over;

    public Game() {

        over = false;

        run();

    }

    private final void run() {

        while (!over) {

            System.out.println("Playing the game");

            checkIfOver(2);

        }

    }

    private final boolean checkIfOver(final int number) {

        if (number > 0) {
            over = true;
        }

    }

}
