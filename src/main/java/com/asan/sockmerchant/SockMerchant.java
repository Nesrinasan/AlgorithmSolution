package com.asan.sockmerchant;

import java.util.*;

/**
 * Created by Nesrin Aşan on 1/3/2020.
 *
 * Karışık olarak bulunan çorapları inceleyerek eşleştirip, kaç adet çorap çifti olduğunu bulan algoritma.
 *
 * Çoraplar [15, 12, 2, 12, 5, 15, 2] Burada 3 çift çorap vardır.
 */
public class SockMerchant {
    static List<Integer> corapList = new ArrayList();
    static int toplamCorapCiftSayisi;
    static Iterator<Integer> iter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet çorap girilecek");
        int corapSayisiGir = scanner.nextInt();

        /**
         * Çorapları topla.
         */
        int sayac = 1;
        while (true) {
            System.out.println("Çorap numarası giriniz");
            int corap = scanner.nextInt();
            corapList.add(corap);
            if (sayac == corapSayisiGir) {
                break;
            }
            sayac++;
        }
        iter = corapList.iterator();

        /**
         * Çorapları gör
         */
        getCoraplar(corapList);
        /**
         *  Topladığın çoraplardan çiftleri ayır.
         */
        corapCiftleriniBul();
        System.out.println("Toplam çorap çift sayısı " + toplamCorapCiftSayisi);

    }

    private static void getCoraplar(List<Integer> corapList) {
        for (Integer corap : corapList) {
            System.out.println(corap + ", ");
        }
    }

    private static void corapCiftleriniBul() {

        /**
         * Metot recursive olduğu için "java.util.ConcurrentModificationException" hatası alıyordu.
         * en dıştaki for döngüsü bitse bile tekra içerideki for döngüsüne giriyor. Çünkü recursive.
         * Bu nedenle etiketli break kullandım.
         */
        sonunaKadarCik:
        for (Integer corap : corapList) {
            int aynıCorapSayisi = 0;
            for (Integer kontrolEdilenCorap : corapList) {
                if (corap == kontrolEdilenCorap) {
                    aynıCorapSayisi++;
                    if (aynıCorapSayisi == 2) {
                        toplamCorapCiftSayisi++;
                        corapList.remove(corap);
                        corapCiftleriniBul();
                        break sonunaKadarCik;
                    }
                }
            }

        }
    }

}
