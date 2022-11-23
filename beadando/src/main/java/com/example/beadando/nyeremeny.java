package com.example.beadando;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class nyeremeny {
    @Id
    private int id;
    private int huzasid;
    private int talalat;
    private int darab;
    private int ertek;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHuzasid() {
        return huzasid;
    }

    public void setHuzasid(int huzasid) {
        this.huzasid = huzasid;
    }

    public int getTalalat() {
        return talalat;
    }

    public void setTalalat(int talalat) {
        this.talalat = talalat;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }
}