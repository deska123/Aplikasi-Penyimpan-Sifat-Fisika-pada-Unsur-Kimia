public class Golongan1B extends UnsurKimia{
    
    // Konstruktor unsur kimia pada seluruh golongan 1B, kecuali unsur Roentgenium
    public Golongan1B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 1B, khusus untuk unsur Roentgenium saja
    public Golongan1B(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,massaJenis);
    }
}
