/*
* File: App.java
* Author: Katona Valentin
* Copyright: 2022, Katona Valentin
* Group: Szoft II/N
* Date: 2022-01-20
* Github: https://github.com/djvalee/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
    static Calory calory;
    static Scanner scanner;
    public static void main(String[] args) throws Exception {
        init();
    }
    public static void init(){
        scanner = new Scanner(System.in);
        calory = new Calory();
        System.out.println("");
        System.out.println("");
        System.out.println("Calory Calculator made by Valentin Katona");
        System.out.println("2022-01-20");
        System.out.println("");
        System.out.println("");
        System.out.println("Choose: Woman[1] OR Man[2]");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                {
                calculateWoman();
                break;}
            case 2:
                {
                calculateMan();
                break;}
            default:
                System.out.println("Not correct number!");
                break;
        }
    }
    public static void calculateMan(){
        System.out.println("Calory Calculator Man");
        System.out.println("Height:");
        double height = scanner.nextDouble();
        System.out.println("Weight:");
        double weight = scanner.nextDouble();
        System.out.println("Age:");
        double age = scanner.nextDouble();
        double result = calory.calcMan(height, weight, (int) age);
        System.out.println("Result: "+result+" calory!");
    }
    public static void calculateWoman(){
        System.out.println("Calory Calculator Woman");
        System.out.println("Height:");
        double height = scanner.nextDouble();
        System.out.println("Weight:");
        double weight = scanner.nextDouble();
        System.out.println("Age:");
        double age = scanner.nextDouble();
        double result = calory.calcWoman(height, weight, (int) age);
        System.out.println("Result: "+result+" calory!");
    }
}