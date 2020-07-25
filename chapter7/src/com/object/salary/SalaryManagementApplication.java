package com.object.salary;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalaryManagementApplication {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static List<String> employees = Arrays.asList("직원A", "직원B", "직원C");
    private static List<Integer> basePays = Arrays.asList(400, 300, 250);

    public void run(String name) {
        double taxRate = getTaxRate();
        double pay = calculatePayFor(name, taxRate);
        System.out.println(describeResult(name, pay));
    }

    private double getTaxRate() {
        System.out.print("세율을 입력하세요: ");
        return SCANNER.nextDouble();
    }

    private double calculatePayFor(String name, double taxRate) {
        int idx = employees.indexOf(name);
        int basePay = basePays.get(idx);
        return basePay - (basePay * taxRate);
    }

    private String describeResult(final String name, final double pay) {
        return String.format("이름: %s, 급여: %f", name, pay);
    }
}
