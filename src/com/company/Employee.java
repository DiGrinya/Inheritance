package com.company;

import java.math.BigDecimal;

abstract class Employee {
    private String name;
    private BigDecimal salary;
    protected BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay(){
        if (bonus == null || salary == null ) {
            throw new IllegalArgumentException();
        }
        return salary.add(bonus);
    }

}

