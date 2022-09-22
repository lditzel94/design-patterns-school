package org.example.core;

import org.example.interfaces.AcademicOffer;
import org.example.interfaces.Composable;

import java.util.ArrayList;
import java.util.List;

public class Institute implements Composable {
    private String name;
    private List<AcademicOffer> offers = new ArrayList<>();

    public void generateReport() {
        for ( var offer : offers ) {
            System.out.println( "Nombre :: " + offer.getName() );
            System.out.println( "Precio :: " + offer.calcPrice() );
        }
    }


    @Override
    public void add( AcademicOffer offer ) {
        offers.add( offer );
    }
}
