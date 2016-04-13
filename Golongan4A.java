public class Golongan4A extends UnsurKimia{
		
		
		// Konstruktor unsur kimia pada golongan 4A khusus untuk Logam 
	 	public Golongan4A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
	    }
	
		// Konstruktor unsur kimia pada seluruh golongan 4A, kecuali unsur Fleoporium dan Logam 
	    public Golongan4A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
	    }
	    
	    // Konstruktor unsur kimia pada golongan 4A, khusus untuk unsur Fleoporium saja
	    public Golongan4A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
	    }
}



