package org.example.core;

import org.example.interfaces.AcademicOffer;

public class Workshop extends AcademicOffer {
    private int quantity;
    private double cost;

    @Override
    public double calcPrice() {
        return quantity * cost;
    }
}
