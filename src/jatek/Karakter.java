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
        szerencse = dobas() ;
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

    public void hasznal(String targy, int mennyiseg, boolean hasznal) {
        int db = mennyiseg;
        if (hasznal) {
            int index = 0;
            while (mennyiseg != 0 && index < felszereles.size()) {
                if (felszereles.get(index).getNev() == targy) {
                    felszereles.remove(felszereles.get(index));
                    mennyiseg--;
                }
                index++;
            }
            if (index >= felszereles.size()) {
                System.out.println("Nincs ilyen tárgy az inventoryban.");
            } 
            else {
                  if (db > 1){
                  System.out.println("Elhasználtad a tárgyaidat.");
                }else{
                    System.out.println("Elhasználtad a tárgyadat.");
                  }         
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
                System.out.println(   felszereles.get(i).toString());
             
            }
        }

    }
}
