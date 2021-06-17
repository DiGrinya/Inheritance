package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {



        SalesPerson Bob = new SalesPerson("Bob", new BigDecimal(3000), 200);
        SalesPerson Aik = new SalesPerson("Aik", new BigDecimal(5000), 95);
        SalesPerson Tom = new SalesPerson("Tom", new BigDecimal(5000), 211);
        Manager Bread = new Manager("Bread", new BigDecimal(100), 150);
        Manager Bill = new Manager("Bill", new BigDecimal(5000), 90);
        Manager Nil = new Manager("Nil", new BigDecimal(5000), 50);
        Bob.setBonus(new BigDecimal(10));
        Aik.setBonus(new BigDecimal(15));
        Tom.setBonus(new BigDecimal(15));
        Bread.setBonus(new BigDecimal(535));
        Bill.setBonus(new BigDecimal(15));
        Nil.setBonus(new BigDecimal(15));
        Company expenses = new Company(Bob,Aik,Tom,Bread,Bill,Nil);

        expenses.giveEverybodyBonus(new BigDecimal(0));

        System.out.println(expenses.nameMaxSalary());

        System.out.println(Bob.toPay());
        System.out.println(Aik.toPay());
        System.out.println(Tom.toPay());
        System.out.println(Bread.toPay());
        System.out.println(Bill.toPay());
        System.out.println(Nil.toPay());


    }
}
