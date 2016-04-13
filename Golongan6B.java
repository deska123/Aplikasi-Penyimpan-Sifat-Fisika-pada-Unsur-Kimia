public class Golongan6B extends UnsurKimia {
     
    // Konstruktor unsur kimia pada seluruh golongan 4B, kecuali unsur Rutherfordium
    public Golongan6B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
    }
    
    // Konstruktor unsur kimia pada seluruh golongan 4B
    public Golongan6B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,konduktivitasTermal,massaJenis);
    }
}
