package jatek;

import java.util.ArrayList;

public class Jatek {

    public Jatek() {
    }

    public void run() {
        //   System.out.println("hello");

        Karakter k1 = new Karakter("Horvát Dani", "Varázsló");
        System.out.println(k1.toString());
        elvalaszto();
        k1.inventory();
        elvalaszto();
        k1.felvesz(new Targy("tigris kard", "kard"));
        k1.felvesz(new Targy("sima nyil", "nyil", "Lövésre használatos fegyver"), 8);
        k1.inventory();
        elvalaszto();
        k1.hasznal("sima nyil", 9);
        elvalaszto();
        k1.hasznal("sima nyil", 3);
        elvalaszto();
        k1.hasznal("sima nyil", 3, false);
        elvalaszto();
        k1.hasznal("sima", 3, false);
        elvalaszto();
        k1.hasznal("tigris kard");
        elvalaszto();
        k1.inventory();

    }

    public void elvalaszto() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------\n");

    }

}
