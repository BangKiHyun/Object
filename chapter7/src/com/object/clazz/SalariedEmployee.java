package com.object.clazz;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(final String name, final double basePay) {
        super(name, basePay);
    }

    @Override
    protected double calculatePay(final double taxRate) {
        return basePay - (basePay * taxRate);
    }

    @Override
    protected double monthlyBasePay() {
        return basePay;
    }
}
