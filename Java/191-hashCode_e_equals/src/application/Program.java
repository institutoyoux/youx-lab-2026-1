package application;

import entities.Client;

public class Program {

    static void main() {
//
//        String a = "Maria";
//        String b = "Alex";
//
//        //System.out.println(a.equals(b));
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = new String("Test");
        String s2 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
    }
}
