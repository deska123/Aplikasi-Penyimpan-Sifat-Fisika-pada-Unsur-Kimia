public class UnsurKimia {
    private String nama;
    private String simbol;
    private String nomorAtom;
    private String massaAtom;
    private String warna;
    private String jenisUnsur;
    private double titikLebur;
    private double titikDidih;
    private double konduktivitasTermal;
    private double koefisienMuai;
    private double massaJenis;
   
    // Konstruktor unsur kimia secara umum
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.warna = warna;
        this.jenisUnsur = jenisUnsur;
        this.titikLebur = titikLebur;
        this.titikDidih = titikDidih;
        this.konduktivitasTermal = konduktivitasTermal;
        this.koefisienMuai = koefisienMuai;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki warna
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double koefisienMuai, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.jenisUnsur = jenisUnsur;
        this.titikLebur = titikLebur;
        this.titikDidih = titikDidih;
        this.konduktivitasTermal = konduktivitasTermal;
        this.koefisienMuai = koefisienMuai;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double titikLebur, double titikDidih, double konduktivitasTermal, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.warna = warna;
        this.jenisUnsur = jenisUnsur;
        this.titikLebur = titikLebur;
        this.titikDidih = titikDidih;
        this.konduktivitasTermal = konduktivitasTermal;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki warna, jenisUnsur, titikLebur, titikDidih, konduktivitasTermal, dan koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki warna, titikLebur, titikDidih, dan koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double konduktivitasTermal, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.jenisUnsur = jenisUnsur;
        this.konduktivitasTermal = konduktivitasTermal;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki warna, titikLebur, titikDidih, konduktivitasTermal, dan koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.jenisUnsur = jenisUnsur;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa memiliki titikLebur, titikDidih, dan koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String warna, String jenisUnsur, double konduktivitasTermal, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.warna = warna;
        this.jenisUnsur = jenisUnsur;
        this.konduktivitasTermal = konduktivitasTermal;
        this.massaJenis = massaJenis;
    }
    
    // Konstruktor unsur kimia tanpa warna, titikDidih dan koefisienMuai
    public UnsurKimia(String nama, String simbol, String nomorAtom, String massaAtom, String jenisUnsur, double titikLebur, double konduktivitasTermal, double massaJenis){
        this.nama = nama;
        this.simbol = simbol;
        this.nomorAtom = nomorAtom;
        this.massaAtom = massaAtom;
        this.jenisUnsur = jenisUnsur;
        this.titikLebur = titikLebur;
        this.konduktivitasTermal = konduktivitasTermal;
        this.massaJenis = massaJenis;
    }
    
    public UnsurKimia () {
    	
    }
   
    public String dapatNama(){
        return nama;
    } 
    
    public String dapatSimbol(){
        return simbol;
    }
    
    public String dapatNomorAtom(){
        return nomorAtom;
    }
    
    public String dapatMassaAtom(){
        return massaAtom;
    }
    
    public String dapatWarna(){
        return warna;
    }
    
    public String dapatJenisUnsur(){
        return jenisUnsur;
    }
    
    public double dapatTitikLebur(){
        return titikLebur;
    }
    
    public double dapatTitikDidih(){
        return titikDidih;
    }
    
    public double dapatKonduktivitasTermal(){
        return konduktivitasTermal;
    }
    
    public double dapatKoefisienMuai(){
        return koefisienMuai;
    }
    
    public double dapatMassaJenis(){
        return massaJenis;
    }
    
}