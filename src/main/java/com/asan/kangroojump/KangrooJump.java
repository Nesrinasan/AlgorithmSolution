package com.asan.kangroojump;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * İki adet kanguru bir noktaya yerleştirilir. Konumları :x1, x2.
 * kanguruların zıplama uzunluğu : l1, l2 olsun.
 * kanguruların her zıplama sonucu aldığı yol : v1 = x1+l1 , v2 = x2+l2 olsun
 * Bu iki kanguru aynı anda zıplamaya başlayacaktır.
 * Zıplama sırasında aynı noktaya zıpladıklarında ekrana konumu ve kocaman bir "YESS" yazan program.
 * */
public class KangrooJump {

    static Integer kangroo1Loc;
    static Integer kangroo2Loc;
    static Integer kangroo1Unit;
    static Integer kangroo2Unit;

    public static void main(String[] args) {
        createKangrooLoc();
        getHowManyUnitsJump();
        calculateAndCompareKangrooLoc(kangroo1Loc, kangroo2Loc, kangroo1Unit, kangroo2Unit);

    }

    private static void createKangrooLoc() {
        Scanner scCreateKangroo = new Scanner(System.in);
        System.out.println("Create Kangroo 1 Location : ");
        kangroo1Loc = scCreateKangroo.nextInt();
        System.out.println("Create Kangroo 2 Location : ");
        kangroo2Loc = scCreateKangroo.nextInt();

    }

    private static void getHowManyUnitsJump() {
        Scanner scUnits = new Scanner(System.in);
        System.out.println("How many units do kangroo1 jump : ");
        kangroo1Unit = scUnits.nextInt();
        System.out.println("How many units do kangroo1 jump : ");
        kangroo2Unit = scUnits.nextInt();
    }

    private static void calculateAndCompareKangrooLoc(Integer kangroo1Loc, Integer kangroo2Loc, Integer kangroo1Unit, Integer kangroo2Unit) {
        for (int i = 0; i < 1000; i++) {
            kangroo1Loc = kangroo1Loc + kangroo1Unit;
            kangroo2Loc = kangroo2Loc + kangroo2Unit;
            if (kangroo1Loc.equals(kangroo2Loc)) {
                System.out.println("YES!!! " + "Location : " + kangroo1Loc);
                break;
            }
        }

    }
}
