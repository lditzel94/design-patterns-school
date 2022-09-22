package org.example.models;

import lombok.Builder;
import org.example.interfaces.AcademicOffer;
import org.example.interfaces.Composable;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Institute implements Composable {
    private String name;
    private List<AcademicOffer> offers;

    public void generateReport() {
        for ( var offer : offers ) {
            System.out.println( "Nombre :: " + offer.getName() );
            System.out.println( "Precio :: " + offer.calcPrice() );
        }
    }


    @Override
    public void add( AcademicOffer offer ) throws Exception {
        if ( offers == null ) offers = new ArrayList<>();
        offers.add( offer );
    }
}
