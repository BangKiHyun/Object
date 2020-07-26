package com.object.abstraction;

//추상 데이터 타입정
public class Employee {
    private final String name;
    private final double basePay;
    private final boolean hourly;
    private final int timeCard;

    public Employee(final String name, final double basePay, final boolean hourly, final int timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.timeCard = timeCard;
    }

    //오퍼레이션 결정
    public double calculatePay(double taxRate) {
        if (hourly) {
            return calculateHourlyPay(taxRate);
        }

        return calculateSalariedPay(taxRate);
    }

    private double calculateHourlyPay(final double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    private double calculateSalariedPay(final double taxRate) {
        return basePay - (basePay * taxRate);
    }
}
