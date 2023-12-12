package jatek;

import java.util.ArrayList;

public class Jatek {

    public Jatek() {
    }

    public void run() {
        //   System.out.println("hello");

        Karakter karakter = new Karakter("Horvát Dani", "Varázsló");
//        System.out.println(k1.toString());
//        elvalaszto();
//        k1.inventory();
//        elvalaszto();
//        k1.felvesz(new Targy("tigris kard", "kard"));
//        k1.felvesz(new Targy("sima nyil", "nyil", "Lövésre használatos fegyver"), 8);
//        k1.inventory();
//        elvalaszto();
//        k1.hasznal("sima nyil", 9);
//        k1.hasznal("tigris kard");
//        elvalaszto();
//        k1.inventory();
//        

        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"), 2);
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("b", "b leírás"));
        karakter.felvesz(new Targy("c", "c leírás"), 1);
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"));
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"));
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("c", "c leírás"), 3);

        karakter.inventory();
        elvalaszto();
        System.out.println(karakter.toString());
        karakter.hasznal("a");
        karakter.hasznal("b", 2);
        karakter.hasznal("c", 2, false);
        karakter.hasznal("d", 5);
        karakter.hasznal("x");
        elvalaszto();
        karakter.inventory();

    }

    public void elvalaszto() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------\n");

    }

}
