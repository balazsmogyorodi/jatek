package jatek;

import java.util.UUID;

public class Targy {

    private UUID id;
    private String nev, targy, leiras;

    public Targy(String nev, String targy) {
        this(nev, targy, "Nincs informácó");
    }

    public Targy(String nev, String targy, String leiras) {
        this.nev = nev;
        this.targy = targy;
        this.leiras = leiras;
        id = UUID.randomUUID();
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Targy{" + "id=" + id + ", nev=" + nev + ", targy=" + targy + ", leiras=" + leiras + '}';
    }

}
