package com.itschool;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычисление периметра и площади для заданного прямоугольника");
        double square = 0, perimeter = 0;

        System.out.println("Введите стороны прямоугольник");
        System.out.print("Введите сторону а : ");
        double sideA = scan.nextDouble();
        System.out.print("Введите сторону b : ");
        double sideB = scan.nextDouble();

        if( (sideA > 0) && (sideB > 0))
        {
            perimeter = 2*(sideA + sideB);
            System.out.println("Периметр равен : " + perimeter);
            square = sideA * sideB;
            System.out.println("Площадь равна : " + square);
        }
        else
            System.out.println("Сторонны прямоугольника введены некорректно");

        System.out.println();
        System.out.println("Вычислять длины стороны квадрата по его периметру: ");
        System.out.println("Введите периметр квадрата: ");
        double perimeterCube = scan.nextDouble();
        if (perimeterCube > 0){
            double sideCube = perimeterCube / 4;
            System.out.println("Сторона квадрата равна : " + sideCube);
        }
        else
            System.out.println("Периметр квадрата введён некорректно");

        System.out.println();
        System.out.println("Вычисление примеров: ");
        double answer_1 = 0, answer_2 = 0, answer_3 = 0, answer_4 = 0, answer_5 = 0;
        System.out.println("Пример № 1 ");
        double b_1, a_1, c_1;
        System.out.println("Введите значение числу а: ");
        a_1 = scan.nextDouble();
        System.out.println("Введите значение числу b: ");
        b_1 = scan.nextDouble();
        System.out.println("Введите значение числу c: ");
        c_1 = scan.nextDouble();

        if ((a_1 > 0) && (b_1 > 0) && (c_1 > 0)){
        answer_1 = ((b_1 + Math.sqrt(Math.pow(b_1, 2) + (4*a_1*c_1)))/(2*a_1)) - (Math.pow(a_1, 3)*c_1) + Math.pow(b_1, -2);
        System.out.println("Ответ : " + answer_1);}
        else{
            System.out.println("Значения для переменных введены не верно");}

        System.out.println("Пример № 2");
        double x;
        System.out.println("Введите значение числу x : " );
        x = scan.nextDouble();
        if (x != 0) {
            answer_2 = Math.pow(x, 2) + Math.pow(x, 3);
            System.out.println("Ответ : " + answer_2);
        }
        else{
            System.out.println("Значение для переменной 'x' некорректно");}

        System.out.println("Пример № 3");
        double x2;
        System.out.println("Введите значение числу x : " );
        x2 = scan.nextDouble();
        answer_3 = x2 - (Math.pow(x2, 3)/ 3 ) + (Math.pow(x2, 5)/5);
        System.out.println("Ответ : " + answer_3);

        System.out.println();
        System.out.println("Пример № 4");
        double x4, y4;
        System.out.print("Введите значение x : ");
        x4 = scan.nextDouble();
        System.out.print("Введите значение y : ");
        y4 = scan.nextDouble();
         if ((y4 != -1) && (x4 != -34))
         {
             answer_4 = ((x4 + y4)/(y4 + 1)) - ((x4*y4 - 12)/(34+x4));
             System.out.println("Ответ : " + answer_4);
         }
         else
             System.out.println("Введены не корректные значения для переменных");

        System.out.println();
        System.out.println("Пример № 5");
        double x5;
        System.out.print("Введите значение для x : ");
        x5 = scan.nextDouble();
        if((x5 + 1 !=0)&& (x5 -1 !=0))
        {
            answer_5 = Math.sin(Math.sqrt(x5 + 1 )) - Math.sin(Math.sqrt(x5 - 1));
            System.out.println("Ответ : " + answer_5);
        }
        else
            System.out.println("Введены не корректные значения для переменных");
        System.out.println();
        System.out.println("Конец программы");




    }
}
