package com.example.beadando;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class uzenetek {
    @Id
    private int id;
    private String uzenet;
    private Date ido;
    private String nev;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUzenet() {
        return uzenet;
    }

    public void setUzenet(String uzenet) {
        this.uzenet = uzenet;
    }

    public Date getIdo() {
        return ido;
    }

    public void setIdo(Date ido) {
        this.ido = ido;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
}
