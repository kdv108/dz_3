package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Dz3_Example_1_a();
	    Dz3_Example_1_b();
	    Dz3_Example_1_c();
	    Dz3_Example_2();
	    Dz3_Example_3();
	    Dz3_Example_4();
	    Dz3_Example_5();
	    Dz3_Example_6();
	    Dz3_Example_7();
	    Dz3_Example_8();
	    Dz3_Example_9();
	    Dz3_Example_10();
	    Dz3_Example_11();
    }
    private static void Dz3_Example_1_a(){
            double x;
            double a = 0;
            double b = 5;
            double h = 1;
            double f;

            System.out.println("Программа выводит результат функции F(x)=x-sin(x)");
            System.out.println("Значение x     |     Значение F(x)");
            while (a <= b){
                x = a;
                f = x - Math.sin(x);
                System.out.println("      "+x+"      |      "+f);
                a += h;
            }
    }
    private static void Dz3_Example_1_b(){
        double x;
        double a = 0;
        double b = 5;
        double h = 1;
        double f;

        System.out.println("Программа выводит результат функции F(x)=sin^2(x)");
        System.out.println("Значение x     |     Значение F(x)");
        while (a <= b){
            x = a;
            f = Math.sin(x) * Math.sin(x);
            System.out.println("      "+x+"      |      "+f);
            a += h;
        }
    }
    private static void Dz3_Example_1_c(){
        double x;
        double a = 0;
        double b = 5;
        double h = 1;
        double f;

        System.out.println("Программа выводит результат функции F(x)=2cos(x)-1");
        System.out.println("Значение x     |     Значение F(x)");
        while (a <= b){
            x = a;
            f = 2 * Math.cos(x) - 1;
            System.out.println("      "+x+"      |      "+f);
            a += h;
        }
    }
    private static void Dz3_Example_2(){
        double x  = 1;
        double h = 0.5;
        int a = 3;
        int b = -5;
        double y;

        System.out.println("Программа вычисляет функцию y=a*x*x+b");
        while (x<=5){
            y = a * x * x + b;
            System.out.println("x = "+x+";     y = "+y);
            x += h;
        }
    }
    private static void Dz3_Example_3(){
        int a;
        int b;
        int a1 = 0;
        int b1 = 0;
        int chislo;
        System.out.println("Программа находит верно ли утверждение что цифра 'a' встречаеться реже чем цифра 'b' в заданном натуральном числе.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите заданное натуральное число: ");
        chislo = in.nextInt();
        System.out.println("Введите цифру 'a': ");
        a = in.nextInt();
        System.out.println("Введите цифру 'b': ");
        b = in.nextInt();
        for (int i = 0; i <= chislo; i++){
            if(i == a) a1++;
            if(i == b) b1++;
        }
        if(a1 < b1) System.out.println("Да, утверждение верно!");
        else System.out.println("Нет утверждение не верно.");
    }
    private static void Dz3_Example_4(){
        System.out.println("Программа вычисляет значение двойной суммы:");
          // Воспользуемся свойством двойной суммы, и переставим сумму с неизвестной "n" на первое место а сумму с известными данными на второе для вычислений.
        int I = 20;
        int k1 = 1;
        int k2 = 2;
        double zK1 = 0;
        double zK2 = 0;
        double x;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= I; i++){
            System.out.println("Введите значение переменной 'x' с индексом "+i+": ");
            x = in.nextDouble();
            zK1 += x/k1;
            zK2 += (x*x)/(k1*k2);
        }
        System.out.println("Решение: z = "+zK1+" + "+zK2+" + .... + ∑ x^n/n!");
    }
    private static void Dz3_Example_5(){
        System.out.println("Программа вычисляет значение функции сумм:");
        int I = 15;
        double z = 0;
        double x;
        double iF = 1;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= I; i++){
            System.out.println("Введите значение 'x' с индексом "+i+": ");
            x = in.nextDouble();
            iF = iF * i;
            z += (i + x)/iF;
            System.out.println("z с индексом "+i+"= "+z);
        }
    }
    private static void Dz3_Example_6(){
        double k;
        int x = 1;
        int y = 1;
        int maxNum = 30;

        System.out.println("Программа находит все натуральные решения x и y уравнения y²+x²=k² при условии что все переменные находяться в диапазоне от 1 до 30");
        while(x <= maxNum){
            while (y <= maxNum){
                k = Math.sqrt((x * x + y * y));
                if((maxNum >= k) & ((k%1) == 0)) {
                    System.out.println("x = " + x + ", y = " + y + ", k = " + k);
                }
                ++y;
            }
            y = x + 1;
            ++x;
        }

    }
    private static void Dz3_Example_7(){
        int num = 100;
        int y = 19;
        int maxNum = 15;
        System.out.println("Программа находит первых 15 чисел нацело делящиеся на 19 и больше 100:");
        for (int i = 1; i <= maxNum; num++){
            if ((num % y) == 0){
                System.out.println(i+". "+num+";");
                ++i;
            }
        }
    }
    private static void Dz3_Example_8(){
        int num = 500;
        int y = 13;
        int y1 = 17;
        int maxNum = 20;
        System.out.println("Программа находит первых 20 чисел нацело делящиеся на 17 или 13 и больше 500:");
        for (int i = 1; i <= maxNum; num++){
            if (((num % y) == 0) || ((num % y1) == 0)){
                System.out.println(i+". "+num+";");
                ++i;
            }
        }
    }
    private static void Dz3_Example_9(){
        int a = 2;
        int b = 4;
        double Z;
        int aSumma = 0;
        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Программа вычисляет кол-во членов заданной арифметической прогрессии, сумма которых превышает заданную величену Z.");
        System.out.print("Введите значение переменной Z: ");
        Z = in.nextDouble();
        aSumma += a;
        for (i = 1; aSumma <= Z; i++){
            a += b;
            aSumma += a;
        }
        System.out.println("Колличество слагаемых: "+i);
        System.out.println("Сумма слагаемых: "+aSumma);
        System.out.println("Последнее слагаемое: "+a);
    }
    private static void Dz3_Example_10(){
        int a = 1;
        int b = 4;
        int aSumma = 0;
        int i = 10;

        System.out.println("Программа находит сумму первых 10-ти членов прогрессии: 1, 5, 9, 13, ...");
        for (int n = 1; n <= i; n++){
            if(n == 1){
                aSumma += a;
            } else {
                a += b;
                aSumma += a;
            }
            System.out.println(n+". "+a+";");
        }
        System.out.println("Сумма первых 10-ти членов равна: "+aSumma);
    }
    private static void Dz3_Example_11(){
        System.out.println("Программа выводит на экран Прямоугольник:");
        int c = 10;
        int x = 25;
        int y = 5;
        for (int i = 1; i <= y; i++){
            for(int c1 = 0; c1 <= c; c1++){
                System.out.print(" ");
                if(c1 == c){
                    System.out.print("*");
                    for (int x1 = 1; x1 <= x; x1++){
                        if ((i == 1) || (i == y)){
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                }
            }
            System.out.println("*");
        }
        System.out.println("Программа выводит на экран Прямоугольный треугольник:");
        y = 8;
        for(int i = 1; i <= y; i++){
            for(int c1 = 0; c1 <= c; c1++){
                System.out.print(" ");
                if((c1 == c) & (i != 1)){
                    System.out.print("*");
                    for (int y1 = 3; y1 <= i; y1++){
                        if (i == y){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println("*");
        }
        System.out.println("Программа выводит на экран Равносторонний треугольник:");
        y = 3;
        x = 1;
        for (int i = 1; i <= y; i++){
            for (int c1 = 1; c1 <= c; c1++){
                System.out.print(" ");
                if (c1 == c){
                    for (int x1 = 1; x1 <= x; x1++){
                        if ((x1 % 2) > 0){
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                }
            }
            x += 2;
            c--;
            System.out.println(" ");
        }
        System.out.println("Программа выводит на экран Ромб:");
        y = 11;
        x = 1;
        c = 10;
        for (int i = 1; i <= y; i++){
            for (int c1 = 1; c1 <= c; c1++){
                System.out.print(" ");
                if ((c1 == c) & ((i != 1) & (i != y))){
                    System.out.print("*");
                    for (int x1 = 1; x1 <= x; x1++){
                        System.out.print(" ");
                    }
                    if(i < 6) x += 2;
                    else x -= 2;
                }
            }
            if (i < 6) c--;
            else c++;
            System.out.println("*");
        }
    }
}
