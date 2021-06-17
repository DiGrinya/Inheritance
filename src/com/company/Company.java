package com.company;

import java.math.BigDecimal;

public class Company {

    private Employee[] employees;
    private BigDecimal companyBonus;

    public Company (Employee... employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus (BigDecimal companyBonus) {
        if (companyBonus == null || companyBonus.compareTo(BigDecimal.ZERO) < 0 ) {
            throw new IllegalArgumentException();
        } else {
            for (Employee emp: this.employees) {
                emp.setBonus(companyBonus);
            }
        }
    }

    public BigDecimal totalToPay () {
        BigDecimal sumSel = BigDecimal.ZERO;
        BigDecimal sumBon = BigDecimal.ZERO;

        for (int i = 0; i < employees.length ; i++) {
            sumSel = sumSel.add(employees[i].getSalary());
            sumBon = sumBon.add(employees[i].getBonus());
        }

        return sumSel.add(sumBon);
    }


    public String nameMaxSalary (){

        BigDecimal maxSel = employees[0].getSalary().add(employees[0].getBonus());
        String bestWorker = "";
        for (int i = 1; i < employees.length ; i++) {
            if(employees[i].getSalary().add(employees[i].getBonus()).compareTo(maxSel)==1) {
                maxSel = employees[i].getSalary().add(employees[i].getBonus());
                bestWorker = employees[i].getName();
            }
        }
        return bestWorker;
    }

}





