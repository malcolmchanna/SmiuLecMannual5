package com.company;
//MUZAMIL JAMIL CHANNA BSE 20S 026
public class MyMath {

    public static double round100th(double dnum) {
        return Math.round(dnum * 100.) / 100.0;
    }//endRound100th

    public static class TryMyMath {
        public static void SquareCube(double doubNum) {
            System.out.println("Number: " + MyMath.round100th(doubNum));
            System.out.println("Square:  " + MyMath.round100th(Math.pow(doubNum,2)));
            System.out.println("Cube:  " + MyMath.round100th(Math.pow(doubNum,3)));
        }// end SquareCube

    }//end TryMyMath

    public static void main( String [] args ){
        System.out.println("MUZAMIL JAMIL CHANNA BSE-20S-026");
        System.out.println("_________________________");
        TryMyMath.SquareCube(Math.E);
    } // end main

}// end class TryMyMath

