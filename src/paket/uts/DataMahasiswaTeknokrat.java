/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket.uts;

/**
 *
 * @author MalingerS Media
 */
public class DataMahasiswaTeknokrat {

    private String nama, npm, hurufMutu;
    private double nilaiUts, nilaiUas, nilaiQuis, nilaiTugas, totalNilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public void setNilaiQuis(double nilaiQuis) {
        this.nilaiQuis = nilaiQuis;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public String getHurufMutu() {
        hitungHurufMutu();
        return hurufMutu;
    }

    public double getTotalNilai() {
        hitungTotal();
        return totalNilai;
    }

    void hitungTotal() {
        totalNilai = (nilaiQuis * 0.15) + (nilaiTugas * 0.30) + (nilaiUts * 0.25) + (nilaiUas * 0.30);
    }

    void hitungHurufMutu() {
        hitungTotal();
        if (totalNilai >= 90 && totalNilai <= 100) {
            hurufMutu = "A";
        } else if (totalNilai >= 80 && totalNilai < 90) {
            hurufMutu = "B";
        } else if (totalNilai >= 70 && totalNilai < 80) {
            hurufMutu = "C";
        } else if (totalNilai >= 60 && totalNilai < 70) {
            hurufMutu = "D";
        } else if (totalNilai >= 0 && totalNilai < 60) {
            hurufMutu = "E";
        } else {
            hurufMutu = "Maaf, anda salah memasukkan nilai";
        }
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public double getNilaiQuis() {
        return nilaiQuis;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

}
