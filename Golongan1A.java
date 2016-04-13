
public class Golongan1A extends UnsurKimia{

			// Konstruktor unsur kimia pada golongan 1A
		 	public Golongan1A(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
		        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
		    }
		
		    // Konstruktor unsur kimia pada golongan 1A, khusus untuk unsur Fransium sajaA
		    public Golongan1A(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
		        super(nama,simbol,nomorAtom,massaAtom,massaJenis);
		    }
}
