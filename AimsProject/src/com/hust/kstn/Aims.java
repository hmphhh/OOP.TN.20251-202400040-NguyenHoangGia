package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc[] dvds = {new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95),
            new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95),
            new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 128, 18.50),
            new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 25.00),
            new DigitalVideoDisc("Avengers: Endgame", "Action", "Anthony Russo", 181, 27.99),
            new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 22.50),
            new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 19.00),
            new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 21.99),
            new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 20.99),
            new DigitalVideoDisc("The Matrix", "Action", "Lana Wachowski", 136, 23.50),
            new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 18.99),
            new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 26.50),
            new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 17.75),
            new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 24.00),
            new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 16.99),
            new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 25.99),
            new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 27.50),
            new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 23.99),
            new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 18.50),
            new DigitalVideoDisc("Shrek", "Animation", "Andrew Adamson", 90, 17.00),
            new DigitalVideoDisc("Up", "Animation", "Pete Docter", 96, 19.25)};

        for (DigitalVideoDisc disc : dvds) {
            cart.addDVD(disc);
        }
        cart.print();

        cart.removeDVD(dvds[20]);
        for (DigitalVideoDisc disc : dvds) {
            cart.removeDVD(disc);
        }
    }
}
