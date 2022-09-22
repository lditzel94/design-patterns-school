package org.example.models;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.AcademicOffer;

@Getter
@Setter
public class Workshop extends AcademicOffer {
    private int quantity;
    private double cost;

    @Override
    public double calcPrice() {
        return quantity * cost;
    }
}
