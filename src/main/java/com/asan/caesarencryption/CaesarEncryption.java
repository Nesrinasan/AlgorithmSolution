package com.asan.caesarencryption;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nesrin Aşan on 1/3/2020.
 */
public class CaesarEncryption {

    public static void main(String[] args) {
        Scanner kullaniciGirisi = new Scanner(System.in);
        System.out.println("Şifrelenecek kelimeyi giriniz");
        String sifrelenecekKelime = kullaniciGirisi.next();
        System.out.println("Şifreyi yapacak değeri giriniz");
        int sifreleyecekDeger = kullaniciGirisi.nextInt();
        String sifreliKelime = sifrele(sifrelenecekKelime, sifreleyecekDeger);
        System.out.println(sifreliKelime);

    }

    private static String sifrele(String sifrelenecekKelime, int sifreleyecekDeger) {
        Map<Character, Integer> alfabeIndisDegerMap = new HashMap<>();
        alfabeIndisDegerMap.put('a', 0);
        alfabeIndisDegerMap.put('b', 1);
        alfabeIndisDegerMap.put('c', 2);
        alfabeIndisDegerMap.put('ç', 3);
        alfabeIndisDegerMap.put('d', 4);
        alfabeIndisDegerMap.put('e', 5);
        alfabeIndisDegerMap.put('f', 6);
        alfabeIndisDegerMap.put('g', 7);
        alfabeIndisDegerMap.put('ğ', 8);
        alfabeIndisDegerMap.put('h', 9);
        alfabeIndisDegerMap.put('ı', 10);
        alfabeIndisDegerMap.put('i', 11);
        alfabeIndisDegerMap.put('j', 12);
        alfabeIndisDegerMap.put('k', 13);
        alfabeIndisDegerMap.put('l', 14);
        alfabeIndisDegerMap.put('m', 15);
        alfabeIndisDegerMap.put('n', 16);
        alfabeIndisDegerMap.put('o', 17);
        alfabeIndisDegerMap.put('ö', 18);
        alfabeIndisDegerMap.put('p', 19);
        alfabeIndisDegerMap.put('r', 20);
        alfabeIndisDegerMap.put('s', 21);
        alfabeIndisDegerMap.put('ş', 22);
        alfabeIndisDegerMap.put('t', 23);
        alfabeIndisDegerMap.put('u', 24);
        alfabeIndisDegerMap.put('ü', 25);
        alfabeIndisDegerMap.put('v', 26);
        alfabeIndisDegerMap.put('y', 27);
        alfabeIndisDegerMap.put('z', 28);

        String sifreliKelime = "";
        char[] sifrelenecekKelimeninHarfleri = sifrelenecekKelime.toCharArray();
        for (char sifrelenecekKelimeninHarfi : sifrelenecekKelimeninHarfleri) {
            Integer yeniKey = alfabeIndisDegerMap.get(sifrelenecekKelimeninHarfi);
            yeniKey = yeniKey + sifreleyecekDeger;
            Set<Character> characters = alfabeIndisDegerMap.keySet();
            for (Character character : characters) {
                Integer key = alfabeIndisDegerMap.get(character);
                if (yeniKey.equals(key)) {
                    sifreliKelime = sifreliKelime + character;
                }
            }
        }
        return sifreliKelime;

    }
}
