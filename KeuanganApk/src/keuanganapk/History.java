package keuanganapk;
import java.util.Date;

public class History {
    private int id;
    private int userId;
    private double jumlah;
    private String metode;
    private Date tanggal;
    
    // Constructor
    public History(int id, int userId, double jumlah, String metode, Date tanggal) {
        this.id = id;
        this.userId = userId;
        this.jumlah = jumlah;
        this.metode = metode;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public double getJumlah() {
        return jumlah;
    }
    
    public String getMetode() {
        return metode;
    }
    
    public Date getTanggal() {
        return tanggal;
    }
}
