package org.example.core;

import org.example.interfaces.AcademicOffer;

public class Course extends AcademicOffer {

    private double monthlyHours;
    private double durationInMonths;
    private double pricePerHour;

    public double getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours( double monthlyHours ) {
        this.monthlyHours = monthlyHours;
    }

    public double getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths( double durationInMonths ) {
        this.durationInMonths = durationInMonths;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour( double pricePerHour ) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calcPrice() {
        return monthlyHours * durationInMonths * pricePerHour;
    }
}
