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
        felszereles = new ArrayList<>();
        hp = dobas() + 12;
        kepesseg = dobas() + 6;
        szerencse = dobas();
        this.nev = nev;
        this.kaszt = kaszt;
    }

    public int dobas() {
        return rnd.nextInt(6) + 1;
    }

    public void felvesz(Targy targy) {
        this.felvesz(targy, 1);
    }

    public void felvesz(Targy targy, int mennyiseg) {
        for (int i = 0; i < mennyiseg; i++) {
            this.felszereles.add(targy);
        }

    }

    public void hasznal(String targy) {
        this.hasznal(targy, 1);
    }

    public void hasznal(String targy, int mennyiseg) {
        this.hasznal(targy, mennyiseg, true);
    }

    public void hasznal(String targy, int mennyiseg, boolean elhasznal) {
        int db = targy_inventory_megszamlalas(targy);
        if (mennyiseg <= db) {
            int i = 0;
            if (elhasznal) {
                System.out.println("Használt fegyverek, amik elhasználodtak:");
                while (mennyiseg > 0) {
                    if (felszereles.get(i).getNev() == targy) {
                        System.out.println(felszereles.get(i).toString());
                        felszereles.remove(felszereles.get(i));
                        mennyiseg --;
                    }
                    i++;
                }
            } else {
                System.out.println("Használt fegyverek, amik nem használodtak el:");
                while (mennyiseg > 0) {
                    if (felszereles.get(i).getNev() == targy) {
                        System.out.println(felszereles.get(i).toString());
                        mennyiseg --;
                    }
                    i++;
                }
            }
        } else {
            if (db == 0) {
                System.out.println("Nincs ilyen tárgy az inventorydban");
            } else {
                System.out.println("Van ilyen tárgyad az inventorydban, de nincsen neked a kivánt mennyiséghez megfelelő.");
            }
        }

    }

    @Override
    public String toString() {
        return "Karakter{" + "hp=" + hp + ", kepesseg=" + kepesseg + ", szerencse=" + szerencse + ", nev=" + nev + ", kaszt=" + kaszt + '}';
    }

    public void inventory() {
        if (felszereles.size() == 0) {
            System.out.println("Nincs egy tárgy semm az inventorydban.");
        } else {
            for (int i = 0; i < felszereles.size(); i++) {
                System.out.println(felszereles.get(i).toString());

            }
        }

    }

    private int targy_inventory_megszamlalas(String targy) {
        int mennyiseg = 0;
        for (int i = 0; i < felszereles.size(); i++) {
            if (felszereles.get(i).getNev() == targy) {
                mennyiseg++;
            }
        }
        return mennyiseg;
    }

}
