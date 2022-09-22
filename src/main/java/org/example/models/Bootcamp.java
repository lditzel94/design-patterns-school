package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.AcademicOffer;
import org.example.interfaces.Composable;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Bootcamp extends AcademicOffer implements Composable {
    private double bonusPercentage;
    private List<AcademicOffer> offers = new ArrayList<>();

    @Override
    public void add( AcademicOffer offer ) throws Exception {
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
