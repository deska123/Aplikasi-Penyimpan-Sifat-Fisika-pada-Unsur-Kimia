public class Golongan8A extends UnsurKimia{
    
     // Konstruktor unsur kimia pada seluruh golongan 8A, kecuali unsur Ununoctium 
    public Golongan8A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 8A, khusus untuk unsur Ununoctium saja
    public Golongan8A(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,konduktivitasTermal,massaJenis);
    }
    
}
