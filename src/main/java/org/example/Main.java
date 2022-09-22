package org.example;

import org.example.factories.AcademicOfferFactory;
import org.example.models.Bootcamp;
import org.example.models.Course;
import org.example.models.Institute;

import static org.example.types.OfferTypes.BOOTCAMP;
import static org.example.types.OfferTypes.COURSE;

public class Main {
    public static void main( String[] args ) {
        var institute = Institute.builder().name( "Digital House" ).build();
        var factory = AcademicOfferFactory.getInstance();
        var frontEnd = ( Course ) factory.createOffer( COURSE );
        var backEnd = ( Course ) factory.createOffer( COURSE );
        var fullstack = ( Bootcamp ) factory.createOffer( BOOTCAMP );

        frontEnd.setName( "Front end" );
        frontEnd.setMonthlyHours( 16 );
        frontEnd.setDurationInMonths( 2 );
        frontEnd.setPricePerHour( 1000 );

        backEnd.setName( "Back end" );
        backEnd.setMonthlyHours( 20 );
        backEnd.setDurationInMonths( 2 );
        backEnd.setPricePerHour( 900 );

        fullstack.setName( "Full Stack" );
        fullstack.setBonusPercentage( 20 );

        composeBootcamp( frontEnd, backEnd, fullstack );
        composeInstitute( institute, fullstack );

        institute.generateReport();
    }

    private static void composeInstitute( Institute institute, Bootcamp fullstack ) {
        try {
            institute.add( fullstack );
        } catch ( Exception exception ) {
            System.out.println( exception.getMessage() );
        }
    }

    private static void composeBootcamp( Course frontEnd, Course backEnd, Bootcamp fullstack ) {
        try {
            fullstack.add( frontEnd );
            fullstack.add( backEnd );
        } catch ( Exception exception ) {
            System.out.println( exception.getMessage() );
        }
    }
}