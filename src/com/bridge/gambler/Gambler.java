package com.bridge.gambler;

public class Gambler {
    static int dailyStake = 100;
    static int betInDollar = 1;

    Gambler(int dailyStake, int betInDollar) {
        this.dailyStake = dailyStake;
        this.betInDollar = betInDollar;

    }

    public static void main(String[] args) {

        System.out.println("Total daily Stake is : " + dailyStake);
        System.out.println("Betting Dollar for every game : " + betInDollar);

    }
}