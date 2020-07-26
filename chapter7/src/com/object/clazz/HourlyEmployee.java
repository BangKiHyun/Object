package com.object.clazz;

public class HourlyEmployee extends Employee {

    private final int timeCard;

    public HourlyEmployee(final String name, final double basePay, final int timeCard) {
        super(name, basePay);
        this.timeCard = timeCard;
    }

    @Override
    protected double calculatePay(final double taxRate) {
        return (basePay - timeCard) - (basePay - timeCard) * taxRate;
    }

    @Override
    protected double monthlyBasePay() {
        return 0;
    }
}
