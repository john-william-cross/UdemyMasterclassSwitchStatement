package com.johncross;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if(value ==1) {
//            System.out.println("Value was 1");
//        } else if(value==2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }

        //if vs switch statement is a matter of style; both can achieve same thing

//        int switchValue = 3;
//        //switch is good to use if you're testing different values for the same variable
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1 or 2");
//                break;
//        }

        char value = 'B';

        switch(value) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("A, B, C, D, or E was found.");
                System.out.println("Value was " + value);
                break;
            default:
                System.out.println("not found");
                break;
        }

        String month = "JAnuary";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
