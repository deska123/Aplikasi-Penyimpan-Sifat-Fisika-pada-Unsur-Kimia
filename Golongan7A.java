public class Golongan7A extends UnsurKimia{
    
    // Konstruktor unsur kimia pada seluruh golongan 7A, kecuali unsur Ununseptium 
    public Golongan7A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 7A, khusus untuk unsur Ununseptium saja
    public Golongan7A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
    }
}
