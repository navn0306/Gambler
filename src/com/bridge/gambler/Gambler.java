package com.bridge.gambler;

public class Gambler {

    static int dailyStake = 100;
    static int winCount = 0;
    static int lossCount = 0;
    static int dayLostCount = 0;
    static int dayWonCount = 0;
    static int totalAmountWonForMonth = 0;
    static int totalAmountLostForMonth = 0;

    public static final int win = 1;

    public static void main(String[] args) {
        for (int day = 1; day <= 20; day++) {
            dailyStake = 100;
            System.out.println("DAY Number " + day);
            while (dailyStake >= 51 && dailyStake <= 149) {
                int result = (int) ((Math.random() * 10 % 2) + 1);
                if (result == win) {
                    dailyStake++;
                    winCount++;
                } else {
                    dailyStake--;
                    lossCount++;
                }

                if (dailyStake == 150) {
                    totalAmountWonForMonth += 50;
                    dayWonCount++;
                } else if (dailyStake == 50) {
                    totalAmountLostForMonth -= 50;
                    dayLostCount++;
                }
                
            }
        }
        System.out.println("Won times " + winCount);
        System.out.println("Lost count " + lossCount);
        System.out.println("Total amount won for 20 Days " + totalAmountWonForMonth);
        System.out.println("Total amount lost for 20 Days " + totalAmountLostForMonth);
        System.out.println("Number of days lost " + dayLostCount + " by $50.");
        System.out.println("Number of days won " + dayWonCount + " by $50.");

    }

}
