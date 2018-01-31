package com.company;

import java.util.Scanner;

public class Main {

    private int masyvas[];
    private int sk;

    public static void main(String[] args) {
        // 1.7.​ Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
        // skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni
        // nei 100

        Main objektas = new Main();
        objektas.nuskaitymas();
        objektas.isvedimas();

    }

    private void nuskaitymas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nurodykite, kiek skaiciu noresite ivesti: ");
        sk = sc.nextInt();
        masyvas = new int[sk];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + "-aji skaiciu: ");
            masyvas[i] = sc.nextInt();
        }
    }

    private void isvedimas() {
        System.out.println("Pasirinkti skaiciai, didesni uz 100: ");
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.println(masyvas[i]);
            }
        }
    }
}
