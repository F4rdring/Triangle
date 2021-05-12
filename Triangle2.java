package Triangle;

import java.util.Scanner;

public class Triangle2 {

    public static void main(String[] args) {

        int a=8;
        int b=9;
        int c=7;
        int p = (a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника = " + s);


    }
}
