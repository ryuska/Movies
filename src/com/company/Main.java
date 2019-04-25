package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        int num;


        String movieName = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a movie name: ");
        movieName = input.nextLine();

        while (!movieName.equalsIgnoreCase ("q")){
            movies.add(movieName);
            System.out.println(movies);
            System.out.println("Please enter a movie name: ");
            movieName = input.nextLine();
            Collections.sort(movies);

        }

        if (movieName.equalsIgnoreCase ("q")){
            System.out.println(movies);

        }
        else {
            movies.add(movieName);
            System.out.println(movies);

        }
        Random rnd =new Random();
        int randomIndex = rnd.nextInt(movies.size());
        System.out.println("Here is movie suggesting for tonight: ");
        System.out.println(movies.get(randomIndex));
    }
}
