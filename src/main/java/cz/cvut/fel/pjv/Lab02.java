/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */
package cz.cvut.fel.pjv;

import java.util.ArrayList;

public class Lab02 {
    //    private ArrayList<ArrayList<Double>> array = new ArrayList<ArrayList<Double>>();
    private TextIO text = new TextIO();

    private double getSum(ArrayList<Double> row) {
        double result = 0;
        for (double item : row) {
            result += item;
        }
        return result;
    }

    private double getEverage(ArrayList<Double> row) {
        final double sum = getSum(row);
        return sum / row.size();
    }

    private double getDeviation(ArrayList<Double> row) {
        double middle = getEverage(row);
        ArrayList<Double> temp_row = new ArrayList<Double>();
        for (double item : row) {
            temp_row.add(Math.pow((item - middle), 2));
        }

        return Math.sqrt(getSum(temp_row) / temp_row.size());
    }

    private void homework() {
        String point = text.getLine();
        if (point == "") {
            System.err.println("End of input detected!");
            return;
        }
        ArrayList<Double> row = new ArrayList<Double>();
        int i = 0;
        while (point != "") {
            i++;
            if (!TextIO.isDouble(point)) {
                point = text.getLine();
                System.err.println("A number has not been parsed from line " + i);
                continue;
            }
            row.add(Double.parseDouble(point));
            point = text.getLine();
            if (row.size() == 10) {
                System.out.printf("%2d %.3f %.3f\n", 10, getEverage(row), getDeviation(row));
                row = new ArrayList<Double>();
            }
            if (point == "") {
                System.err.println("End of input detected!");
            }
        }
        if (row.size() > 1) {
            System.out.printf("%2d %.3f %.3f\n", row.size(), getEverage(row), getDeviation(row));
        }
    }

    public void start(String[] args) {
        homework();
    }
}
