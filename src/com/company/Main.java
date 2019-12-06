package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3]; //массив
        names[0] = "Reina";
        names[1] = "Sezimai";
        names[2] = "Khanaiym";
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

        for (int i = 0; i <names.length ; i++) {
            switch (i) {
                case 0:
                    System.out.println("Good morning, " + names[0]);
                    break;
                case 1:
                    System.out.println("Good afternoon, " + names[1]);
                    break;
                case 2:
                    System.out.println("Good evening, " + names[2]);
                    break;

            }
        }
    }

}
