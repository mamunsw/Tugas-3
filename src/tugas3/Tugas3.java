/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author MSW98
 */
// Nama : Ma'mun Basyari
// Nim : 10116488
// Kelas : IF-11
class Mahasiswa {

    private String nim, nama, keterangan;
    private double nQuiz, nUts, nUas, nilaiAkhir;
    private char index = 0;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getQuiz() {
        return nQuiz;
    }

    public void setQuiz(double nQuiz) {
        this.nQuiz = nQuiz;
    }

    public double getUts() {
        return nUts;
    }

    public void setUts(double nUts) {
        this.nUts = nUts;
    }

    public double getUas() {
        return nUas;
    }

    public void setUas(double nUas) {
        this.nUas = nUas;
    }

    public double getnNilaiAkhir(double nQuiz, double nUts, double nUas) {
        nilaiAkhir = 0.2 * nQuiz + 0.3 * nUts + 0.5 * nUas;
        return nilaiAkhir;
    }

    public void getIndexAkhir(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            index = 'A';
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir >= 68) {
            index = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 56) {
            index = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 45) {
            index = 'D';
            keterangan = "Kurang";

        } else {
            index = 'E';
            keterangan = "Sangat Kurang";
        }
        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + keterangan);

    }
}

public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa nMhs = new Mahasiswa();
        nMhs.setNama("Ma'mun Basyari");
        nMhs.setNim("10116488.");
        nMhs.setQuiz(70);
        nMhs.setUts(80);
        nMhs.setUas(40);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Nama Ke-" + i + "=" + nMhs.getNama());
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("Nim Ke-" + j + "=" + nMhs.getNim() + j);
        }
        double nilaiAkhir = nMhs.getnNilaiAkhir(nMhs.getQuiz(), nMhs.getUts(), nMhs.getUas());

        System.out.println("\nQuiz = " + nMhs.getQuiz());
        System.out.println("Uts = " + nMhs.getUts());
        System.out.println("Uas= " + nMhs.getUas());
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        nMhs.getIndexAkhir(nilaiAkhir);

    }

}
