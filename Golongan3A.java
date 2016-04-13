public class Golongan3A extends UnsurKimia{
		
		
		// Konstruktor unsur kimia pada golongan 3A khusus untuk Logam 
	 	public Golongan3A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
	    }
	
		// Konstruktor unsur kimia pada seluruh golongan 3A, kecuali unsur Ununtrium dan Logam 
	    public Golongan3A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
	    }
	    
	    // Konstruktor unsur kimia pada golongan 3A, khusus untuk unsur Ununtrium saja
	    public Golongan3A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
	    }
}



