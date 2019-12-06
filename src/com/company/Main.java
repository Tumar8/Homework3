package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[8]; //массив
        names[1] = "Reina";
        names[2] = "Sezimai";
        names[3] = "Khanaiym";
        System.out.println(names[1] + " " + names[2] + " " + names[3]);

        String name = ("names[1]");
        String name1 = ("names[2]");
        String name2 = ("names[3]");
        switch (name) {
            default:
                System.out.println();
        case ("names[1]"):
                System.out.println("Good morning, " + names[1]);
            case ("names[2]"):
                System.out.println("Good afternoon, " + names[2]);
            case ("names[3]"):
                System.out.println("Good evening, " + names[3]);

        }

    }

}
