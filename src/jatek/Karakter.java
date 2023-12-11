
package jatek;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;


public class Karakter {
    private static final Random rnd = new Random();
    private int dobas;
    private String nev, kaszt;
    private ArrayList<Targy> felszereles;
    
    
    public Karakter (String nev, String kaszt){
        this.nev = nev;
        this.kaszt = kaszt;

    }
    public int dobas(){
    return rnd.nextInt(6)+1;
    }
    
    
    public void felvesz(){
    
    
    }
    
}
