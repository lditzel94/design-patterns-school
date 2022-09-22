package org.example.core;

import org.example.interfaces.AcademicOffer;

import java.util.ArrayList;
import java.util.List;

public class Career extends AcademicOffer {
    private double basePrice;
    private List<AcademicOffer> offers = new ArrayList<>();

    public void add( AcademicOffer offer ) {
        offers.add( offer );
    }

    @Override
    public double calcPrice() {
        double total = 0;
        for ( var offer : offers ) {
            total += offer.calcPrice();
        }

        return total + basePrice;
    }
}
