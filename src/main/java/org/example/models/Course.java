package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.AcademicOffer;

@Getter
@Setter
public class Course extends AcademicOffer {

    private double monthlyHours;
    private double durationInMonths;
    private double pricePerHour;

    @Override
    public double calcPrice() {
        return monthlyHours * durationInMonths * pricePerHour;
    }
}
