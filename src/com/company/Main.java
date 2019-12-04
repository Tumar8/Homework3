package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[8]; //массив
        names[5] = "Reina";
        names[7] = "Sezimai";
        names[3] = "Khanaiym";
        System.out.println(names[5] + " " + names[7] + " " + names[3]);

        String name = ("names[5]");
        switch (name) {
            case ("names[5]"):
                System.out.println("Good morning, " + names[5]);
        }
        String name1 = ("names[7]");
        switch (name1) {
            case ("names[7]"):
                System.out.println("Good afternoon, " + names[7]);
        }
        String name2 = ("names[3]");
        switch (name2) {
            case ("names[3]"):
                System.out.println("Good evening, " + names[3]);
        }
    }

}
