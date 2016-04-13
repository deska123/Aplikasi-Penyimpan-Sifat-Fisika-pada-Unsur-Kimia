public class Golongan8B extends UnsurKimia{
    // Konstruktor unsur kimia pada seluruh golongan 8B
    public Golongan8B(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
    }
    
    public Golongan8B(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,massaJenis);
    }
}
