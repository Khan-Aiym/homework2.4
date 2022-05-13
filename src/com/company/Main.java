package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<String> languages1 = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите язык" + languages.add(scanner.nextLine()));
            }
            break;
        }
        while (true) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите язык" + languages1.add(scanner.nextLine()));
            }
            break;
        }

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        A.addAll(languages);
        B.addAll(languages1);
        System.out.println(A);
        System.out.println(B);
        ArrayList<String> C = new  ArrayList<>();
        C.addAll(A);
        Collections.reverse(B);
        C.addAll(B);
        Collections.rotate(C.sublist(1, 6), -1);
        Collections.rotate(C.sublist(1, 7), -1);
        Collections.rotate(C.sublist(1, 8), -1);
        Collections.rotate(C.sublist(1, 9), -1);
        System.out.println(C);

        C.sort(Comparator.comparingInt(String::length));
        C.forEach(System.out::println);






    }
}
