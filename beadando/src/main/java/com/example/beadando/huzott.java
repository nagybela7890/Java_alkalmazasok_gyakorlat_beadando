package com.example.beadando;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class huzott {
    @Id
    private int id;
    private int huzasid;
    private int szam;

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

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }
}
