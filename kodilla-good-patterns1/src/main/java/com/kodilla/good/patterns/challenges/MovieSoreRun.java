package com.kodilla.good.patterns.challenges;

public class MovieSoreRun {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .map(e -> e + " ! ")
                .forEach(System.out::print);
    }
}
