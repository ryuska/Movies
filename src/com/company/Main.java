package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        String movieName = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a movie name: ");
        movieName = input.nextLine();

        while (!movieName.equalsIgnoreCase ("q")){
            movies.add(movieName);
            System.out.println(movies);
            System.out.println("Please enter a movie name: ");
            movieName = input.nextLine();
        }

        if (movieName.equalsIgnoreCase ("q")){
            System.out.println(movies);

        }
        else {
            movies.add(movieName);
            System.out.println(movies);
        }
    }
}
