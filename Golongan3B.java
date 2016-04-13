public class Golongan3B extends UnsurKimia{
    
    // Konstruktor unsur kimia pada seluruh golongan 3B, kecuali unsur Lawrencium
    public Golongan3B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 2B, khusus untuk unsur Lawrencium saja
    public Golongan3B(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double titikLebur, double konduktivitasTermal){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,titikLebur,konduktivitasTermal);
    }
}
