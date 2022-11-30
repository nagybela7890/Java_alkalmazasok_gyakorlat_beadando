package com.example.beadando;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class UzenetOsztaly {
    @Id
    private int id;
    @NotNull
    @Size(min=2, max=100)

    private String content;
    private Date ido;
    private String nev;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
