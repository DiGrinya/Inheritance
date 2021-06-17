package com.company;

import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent){
        super(name, salary);
        if (percent < 0  ) {
            throw new IllegalArgumentException();
        }
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus.compareTo(BigDecimal.ZERO) < 0 || bonus.equals(null) ) {
            throw new IllegalArgumentException();
        }
        if(percent > 100 && percent <= 200) bonus = bonus.multiply(BigDecimal.valueOf(2));
        else if (percent > 200) bonus = bonus.multiply(BigDecimal.valueOf(3));
        this.bonus = bonus;
    }
}
