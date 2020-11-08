package com.example.crudmysql.data;

public class Data {
    String id,nama,posisi,gajih;

    public Data() {
    }

    public Data(String id, String nama, String posisi, String gajih) {
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.gajih = gajih;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getGajih() {
        return gajih;
    }

    public void setGajih(String gajih) {
        this.gajih = gajih;
    }
}
