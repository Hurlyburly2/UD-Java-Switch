package com.dsimon;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
        }

        char letter = 'A';
        switch(letter) {
            case 'A':
                System.out.println("Found an A");
                break;
            case 'B':
                System.out.println("Found a B");
                break;
            case 'C':
                System.out.println("Found a C");
                break;
            case 'D':
                System.out.println("Found a D");
                break;
            case 'E':
                System.out.println("Found an E");
                break;
            default:
                System.out.println("Did not find A, B, C, D, or E");
                break;
        }

        String month = "JANUARy";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
