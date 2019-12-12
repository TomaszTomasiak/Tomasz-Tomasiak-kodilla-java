package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentalRequest rentalRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new InformationService(), new RentalService(), new RentalRepository());
        rentalProcessor.process(rentalRequest);
    }
}
