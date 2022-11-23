package com.example.beadando;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class huzas {
    @Id
    private int id;
    private int ev;
    private int het;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHet() {
        return het;
    }

    public void setHet(int het) {
        this.het = het;
    }
}
