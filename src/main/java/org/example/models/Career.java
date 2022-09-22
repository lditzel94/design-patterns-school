package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.AcademicOffer;
import org.example.interfaces.Composable;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Career extends AcademicOffer implements Composable {
    private double basePrice;
    private List<AcademicOffer> offers = new ArrayList<>();

    @Override
    public void add( AcademicOffer offer ) throws Exception {
        if ( !isValidOffer( offer ) ) throw new Exception( "Unicamente puede ingresar Cursos o Talleres" );
        if ( !isValidCourse( offer ) ) throw new Exception( "Los cursos deben tener una duración mayor a 10hs mensuales" );
        offers.add( offer );
    }

    private static boolean isValidOffer( AcademicOffer offer ) {
        return offer instanceof Course || offer instanceof Workshop;
    }

    private static boolean isValidCourse( AcademicOffer offer ) {
        return offer instanceof Course && ( ( Course ) offer ).getMonthlyHours() > 10;
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
