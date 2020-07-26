package com.object.clazz;

public abstract class Employee {
    protected final String name;
    protected final double basePay;

    public Employee(final String name, final double basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    protected abstract double calculatePay(double taxRate);

    protected abstract double monthlyBasePay();
}
