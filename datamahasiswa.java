package SDA2;

import java.util.LinkedList;

public class datamahasiswa {
    public static void main(String[] args) {

        //Buatlah sebuah LinkedList yang mana pada LinkedList 
        //tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.

        LinkedList<String> NIM = new LinkedList<>();
        LinkedList<String> NAMA = new LinkedList<>();
        LinkedList<String> ALAMAT = new LinkedList<>();

        //Kemudian Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui

        //add(), addFirst(), dan addLast()

        NAMA.add("Citra Aulia");
        NIM.add("2111521022");
        ALAMAT.add("Aceh");

        NAMA.addFirst("Niall");
        NIM.addFirst("2111521000");
        ALAMAT.addFirst("Irlandia");

        NAMA.addLast("Zayn");
        NIM.addLast("2111522000");
        ALAMAT.addLast("London");

        NAMA.add("Peter");
        NIM.add("201523090");
        ALAMAT.add("Queen");

        System.out.println("-----PENAMBAHAN DATA MAHASISWA-----");
        System.out.println("Nama \t:" +NAMA);
        System.out.println("NIM \t:" +NIM);
        System.out.println("Alamat \t:" +ALAMAT);
        System.out.println("");

        //set()

        NAMA.set(0, "Gigi");
        NIM.set(2, "191521033");
        ALAMAT.set(2,"UK");

        NAMA.set(2, "Zendaya");
        NIM.set(3, "191521114");
        ALAMAT.set(3,"Ukraina");

        System.out.println("----MENYISIPKAN DATA MAHASISWA----");
        System.out.println("Nama \t:" +NAMA);
        System.out.println("NIM \t:" +NIM);
        System.out.println("Alamat \t:" +ALAMAT);
        System.out.println("");

        //remove()

        NAMA.remove(0);
        NIM.remove(1);
        ALAMAT.remove(2);

        System.out.println("-----MENGHAPUS DATA MAHASISWA-----");
        System.out.println("Nama \t:" +NAMA);
        System.out.println("NIM \t:" +NIM);
        System.out.println("Alamat \t:" +ALAMAT);
        System.out.println("");

        //pop()

        NAMA.pop();
        NIM.pop();
        ALAMAT.pop();
        System.out.println("---Data yang tersisa setelah fungsi POP---");
        System.out.println("Data nama setelah ditambahkan \t        : "+NAMA);
        System.out.println("Data NIM setelah ditambahkan \t        : "+NIM);
        System.out.println("Data Alamat setelah ditambahkan\t        : "+ALAMAT);
        System.out.println("");

        //push()

        NAMA.push("Harry");
        NIM.push("221521698");
        ALAMAT.push("Rusia");
        System.out.println("---Data setelah fungsi PUSH---");
        System.out.println("Data nama setelah ditambahkan \t        : "+NAMA);
        System.out.println("Data NIM setelah ditambahkan \t        : "+NIM);
        System.out.println("Data Alamat setelah ditambahkan\t        : "+ALAMAT);
        System.out.println("");

        //isEmpty()

        System.out.println("---Pengecekan data---");
        System.out.println("Apakah data nama kosong? "+NAMA.isEmpty());

        NIM.clear();
        System.out.println("Apakah data NIM kosong? "+NIM.isEmpty());

        System.out.println("Apakah data alamat? "+ALAMAT.isEmpty());
        System.out.println("");

        //indexOf()

        System.out.println("---INDEX OF---"); 
        System.out.println("fungsi index of pada NAMA\t:"+NAMA.indexOf("Peter"));
        System.out.println("fungsi index of pada NIM\t:"+NIM.indexOf("2111521022"));
        System.out.println("fungsi index of oada ALAMAT\t:"+ALAMAT.indexOf("Aceh"));
        System.out.println("");

        //get()

        System.out.println("---GET---"); 
        System.out.println("fungsi get NAMA\t        :"+NAMA.get(0));
        System.out.println("fungsi get ALAMAT\t:"+ALAMAT.get(0));
        System.out.println("fungsi get NIM\t:"+NIM.get(5));



    }
    
}
