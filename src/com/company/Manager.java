package com.company;

import java.math.BigDecimal;

public class Manager extends Employee{

    private int quantity;

    public Manager(String name, BigDecimal salary, int quantity){
        super(name, salary);
        if (quantity < 0  ) {
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;

    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus.compareTo(BigDecimal.ZERO) < 0 || bonus == null ) {
            throw new IllegalArgumentException();
        }
        if (quantity > 100 && quantity <= 150) bonus = bonus.add(BigDecimal.valueOf(500));
        else if (quantity > 150) bonus = bonus.add(BigDecimal.valueOf(1000));
        this.bonus = bonus;
    }
}
