public class Golongan5A extends UnsurKimia{
		
		
		// Konstruktor unsur kimia pada golongan 5A khusus untuk Logam 
	 	public Golongan5A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
	    }
	
		// Konstruktor unsur kimia pada seluruh golongan 5A, kecuali unsur Livermorium dan Logam
	    public Golongan5A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
	    }
	    
	    // Konstruktor unsur kimia pada golongan 5A, khusus untuk unsur Livermorium saja
	    public Golongan5A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
	        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
	    }
}



