package com.bridge.gambler;

public class Gambler {
    static int dailyStake = 100;
    static int betInDollar = 1;
    public static final int win = 1;
    public static final int loss = 2;


    Gambler(int dailyStake, int betInDollar) {
        this.dailyStake = dailyStake;
        this.betInDollar = betInDollar;

    }

    public static void main(String[] args) {

        while (dailyStake > 50 && dailyStake != 150 ) {

            int result = (int) ((Math.random() * 10 % 2) + 1);

            if (result == win) {
                dailyStake++;
                System.out.println("Won");
            } else {
                dailyStake--;
                System.out.println("Lost");
            }

        }
        System.out.println("Total daily Stake is : " + dailyStake);
        System.out.println("Betting Dollar for every game : " + betInDollar);


    }
}