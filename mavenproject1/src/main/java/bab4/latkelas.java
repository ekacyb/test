/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

import person.person;

/**
 *
 * @author A-22
 */
public class latkelas {
    public static void main(String[] args) {
        String judbuk1 = "jav 1";
        String authbuk1 = "budi";
        String judbuk2 = "jav 2";
        String authbuk2 = "santoso";
        System.out.println(judbuk1);
        System.out.println(authbuk1);
        System.out.println(judbuk2);
        System.out.println(authbuk2);
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "java 1";
        buku1.author.nama = "budi";
        buku2.judul = "java 2";
        buku2.author.nama = "robert";
        
        System.out.println(buku1.judul);
        buku1.author.namaperson();
//        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
        buku1.harga.setJual(120000);
        System.out.println(buku1.taper);
        System.out.println(buku1.harga.getbeli());
        System.out.println(buku1.penerbit.nama);
        System.out.println("Harga Jual Buku 1 = "+ buku1.harga.getJual());
        System.out.println("Harga Jual Buku 2 = "+ buku2.harga.getJual());
        buku1.terjual();
    }
}

class Buku{
    String judul;
    person author = new person();
    int taper =2024;
    Harga harga = new Harga();
    Perusahaan penerbit = new Perusahaan();
    
    public void terjual(){
        System.out.println("buku terjual dengan harga: " +harga.getbeli());
    }
}

class Harga{
    private double jual = 100000.00;
    private double beli = 80000.00;
    
    public double getbeli(){
        return beli;
    }
    public void setbeli(double beli) {
        this.beli = beli;
    }
    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }
    
}