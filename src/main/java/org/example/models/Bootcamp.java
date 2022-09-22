package org.example.core;

import org.example.interfaces.AcademicOffer;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp extends AcademicOffer {
    private double bonusPercentage;
    private List<AcademicOffer> offers = new ArrayList<>();

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage( double bonusPercentage ) {
        this.bonusPercentage = bonusPercentage;
    }

    public void add( AcademicOffer offer ) {
        offers.add( offer );
    }

    @Override
    public double calcPrice() {
        double total = 0;
        for ( var offer : offers ) {
            total += ( ( 1 - bonusPercentage / 100 ) * offer.calcPrice() );
        }

        return total;
    }
}
