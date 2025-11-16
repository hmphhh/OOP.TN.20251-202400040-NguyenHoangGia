package com.hust.kstn.models;

public class Cart {

    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsInCart[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added successfully");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].equals(disc)) {
                itemsInCart[i] = itemsInCart[qtyOrdered - 1];
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed successfully");
                return;
            }
        }
        System.out.println("The disc does not exist");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("===============================================");
        System.out.println("Total items in cart: " + qtyOrdered);
        System.out.println("All items in cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(
                    (i + 1) + ". [Title]: " + itemsInCart[i].getTitle() + ", [Cost]: " + itemsInCart[i].getCost());
        }
        System.out.printf("Total cost: %.2f\n", calculateTotalCost());
        System.out.println("===============================================");
    }
}
