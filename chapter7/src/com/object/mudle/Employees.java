package com.object.mudle;

import java.util.Arrays;
import java.util.List;

public class Employees {
    private static final List<String> EMPLOYEES = Arrays.asList("직원A", "직원B", "직원C", "직원D", "직원E", "직원F");
    private static final List<Double> BASE_PAYS = Arrays.asList(400d, 300d, 250d, 1d, 1d, 1.5);
    private static final List<Boolean> HOURLYS = Arrays.asList(false, false, false, true, true, true);
    private static final List<Integer> TIME_CARDS = Arrays.asList(0, 0, 0, 120, 120, 120);

    public double calculatePay(String name, double taxRate) {
        int idx = EMPLOYEES.indexOf(name);
        if (HOURLYS.get(idx)) {
            return calculateHourlyPayFor(idx, taxRate);
        }
        return calculatePayFor(idx, taxRate);
    }

    private double calculateHourlyPayFor(final int idx, final double taxRate) {
        double basePay = BASE_PAYS.get(idx) * TIME_CARDS.get(idx);
        return basePay - (basePay * taxRate);
    }

    private double calculatePayFor(final int idx, final double taxRate) {
        double basePay = BASE_PAYS.get(idx);
        return basePay - (basePay * taxRate);
    }
}
