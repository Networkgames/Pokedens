package de.denis.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(2);

        ArrayList<String> Pokedens = new ArrayList<>();
        Pokedens.add("Dedix");
        Pokedens.add("Merlox");
        Pokedens.add("Karlode");

        double min = 0;
        double max = 3;

        System.out.println("Ein wildes " + Pokedens.get((int) (Math.random()*(max-min)+min)) + " erscheint!");
    }
}
