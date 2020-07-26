package com.object.mudle;

import java.util.Scanner;

public class SalaryManagementApplication {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final Employees employees = new Employees();

    public void main() {
        double taxRate = getTaxRate();
        String name = "직원A";
        double pay = employees.calculatePay("직원A", taxRate);
        describeResult(name, pay);
    }

    private double getTaxRate() {
        System.out.print("세율을 입력하세요: ");
        return SCANNER.nextDouble();
    }

    private void describeResult(final String name, final double pay) {
        System.out.println(String.format("이름: %s, 급여: %f", name, pay));
    }
}
