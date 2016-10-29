package com.example.budipradnyana.myapplication.Model;

/**
 * Created by Budi Pradnyana on 10/27/2016.
 */

public class Mahasiswa {
    private String nama,nim,foto;

    public Mahasiswa(String nama, String nim, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
