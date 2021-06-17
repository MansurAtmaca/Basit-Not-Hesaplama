package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Lütfen Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        int muzik = input.nextInt();
        double ortalama = (fizik + kimya + turkce + tarih + muzik) / 5;
        System.out.println("Ortalamanız: " + ortalama);
        String str = (ortalama < 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(str);


    }
}
