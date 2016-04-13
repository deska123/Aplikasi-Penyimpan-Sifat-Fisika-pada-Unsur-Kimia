public class Golongan6A extends UnsurKimia {
	
	// Konstruktor unsur kimia pada seluruh golongan 6A, kecuali unsur Livermorium 
    public Golongan6A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    // Konstruktor unsur kimia pada golongan 6A, khusus untuk unsur Livermorium saja
    public Golongan6A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
    }
}
