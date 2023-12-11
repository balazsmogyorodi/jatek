package jatek;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Karakter {

    private static final Random rnd = new Random();
    private int hp, kepesseg, szerencse;
    private String nev, kaszt;
    private ArrayList<Targy> felszereles;

    public Karakter(String nev, String kaszt) {
        hp = dobas() + 12;
        kepesseg = dobas() + 6;
        szerencse = dobas() + 6;
        this.nev = nev;
        this.kaszt = kaszt;

    }

    public int dobas() {
        return rnd.nextInt(6) * 2;
    }

    public void felvesz(Targy targy) {
        this.felvesz(targy, 1);
    }

    public void felvesz(Targy targy, int mennyiseg) {
        for (int i = 0; i < mennyiseg; i++) {
            this.felszereles.add(targy);
        }

    }

    public void hasznal(Targy targy) {
        this.hasznal(targy, 1);
    }

    public void hasznal(Targy targy, int mennyiseg) {
        this.hasznal(targy, mennyiseg, true);
    }

    public void hasznal(Targy targy, int mennyiseg, boolean hasznal) {
        if (hasznal) {
            int index = 0;
            System.out.println(felszereles.get(index));
            while (mennyiseg != 0 && index < felszereles.size()) {
                if (felszereles.get(index) == targy){
                    felszereles.remove(felszereles.get(index));
                    mennyiseg--;
                }
                       index++;
            }
        }
    }
}
