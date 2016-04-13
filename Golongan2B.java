
public class Golongan2B extends UnsurKimia{
     // Konstruktor unsur kimia pada seluruh golongan 8A, kecuali unsur Ununoctium 
    public Golongan2B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 2B, khusus untuk unsur Raksa saja
    public Golongan2B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 2B, khusus untuk unsur Copernicium saja
    public Golongan2B(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,massaJenis);
    }
}
