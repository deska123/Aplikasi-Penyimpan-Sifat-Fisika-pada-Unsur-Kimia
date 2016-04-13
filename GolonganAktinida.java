public class GolonganAktinida extends UnsurKimia {
    // Konstruktor unsur kimia pada seluruh golongan 8B
    public GolonganAktinida(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,koefisienMuai,massaJenis);
    }
    
    public GolonganAktinida(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,warna,jenisUnsur,titikLebur,titikDidih,konduktivitasTermal,massaJenis);
    }
    
    public GolonganAktinida(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double titikLebur, double konduktivitasTermal, double massaJenis){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,titikLebur,konduktivitasTermal,massaJenis);
    }
    
    public GolonganAktinida(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double titikLebur, double konduktivitasTermal){
        super(nama,simbol,nomorAtom,massaAtom,jenisUnsur,titikLebur,konduktivitasTermal);
    }
    
}
