package com.gla.Array;
import java.util.*;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter salary: ");
                if (sc.hasNextDouble()) {
                    double salary = sc.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        break;
                    } else {
                        System.out.println("Salary must be positive. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                }
            }
            while (true) {
                System.out.print("Enter years of service: ");
                if (sc.hasNextDouble()) {
                    double years = sc.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        break;
                    } else {
                        System.out.println("Years of service cannot be negative. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next(); // clear invalid input
                }
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Bonus: " + bonuses[i] +
                    " | New Salary: " + newSalaries[i]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

