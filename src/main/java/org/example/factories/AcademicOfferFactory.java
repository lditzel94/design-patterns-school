package org.example.factories;

import org.example.interfaces.AcademicOffer;
import org.example.models.Bootcamp;
import org.example.models.Career;
import org.example.models.Course;
import org.example.models.Workshop;
import org.example.types.OfferTypes;

public class AcademicOfferFactory {
    private static AcademicOfferFactory instance;

    private AcademicOfferFactory() {
    }

    public static AcademicOfferFactory getInstance() {
        if ( instance == null ) return new AcademicOfferFactory();
        return instance;
    }


    public AcademicOffer createOffer( OfferTypes type ) {
        switch ( type ) {
            case CAREER:
                return new Career();
            case COURSE:
                return new Course();
            case WORKSHOP:
                return new Workshop();
            case BOOTCAMP:
                return new Bootcamp();
            default:
                return null;
        }
    }
}
