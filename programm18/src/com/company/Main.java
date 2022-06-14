package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextInt();

        System.out.print("Введите y: ");
        double y = scanner.nextInt();

        Formula formula = Formula.getFormula();
        formula.setFormula(x, y);
        formula.displayFormula();
        Formula formula1 = Formula.getFormula();

        if (formula.hashCode() == formula1.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

}


class Formula {
    static final Formula formula = new Formula();
    private static Formula Formula;
    double x;
    double y;

    private Formula() {}
    public static Formula getInstance(){
        if (Formula == null){
            Formula = new Formula();
        }
        return Formula;
    }

    public static Formula getFormula() {
        return formula;
    }

    public void setFormula(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public void displayFormula() {
        double sum = 2 * x + 3 / y;
        System.out.println(sum);

    }


}
