import javax.swing.JOptionPane;

public class DataUnsur {
	
	private String data;
	UnsurKimia kirimNilai = new UnsurKimia();
	
	Golongan1A Hidrogen = new Golongan1A("Hidrogen", "H", "1", "1.00794", "Tak berwarna", "Non-logam", 13.81, 20.28, 0.1815, 0, 89.9);
	Golongan1A Lithium = new Golongan1A("Lithium", "Li", "3", "6.941", "Merah karmin", "Logam Alkali", 453.7, 1615, 84.7, 0, 530);
	Golongan1A Natrium = new Golongan1A("Natrium", "Na", "11", "22.9898", "Kuning", "Logam Alkali", 371, 1156, 141, 0, 910);
	Golongan1A Kalium = new Golongan1A("Kalium", "K", "19", "39.0983", "Ungu", "Logam Alkali", 336.8, 1033, 102.5, 0, 860);
	Golongan1A Rubidium = new Golongan1A("Rubidium", "Rb", "27", "85.4678", "Merah", "Logam Alkali", 312.63, 961, 58.2, 0, 1532);
	Golongan1A Cesium = new Golongan1A("Sesium", "Cs", "35", "132.905", "Biru", "Logam Alkali", 301.54, 944, 35.9, 0, 1870);
	Golongan1A Fransium = new Golongan1A("Fransium", "Fr", "43", "223", 2900);
	
	Golongan2A Berrilium = new Golongan2A("Berrilium", "Be", "4", "9.012182", "Abu-abu", "Logam Alkali Tanah", 1580, 2742, 190, 11.3*0.000001, 1848);
	Golongan2A Magnesium = new Golongan2A("Magnesium", "Mg", "12", "24.3050", "Silver", "Logam Alkali Tanah", 923, 1363, 160, 8.2*0.000001, 1738);
	Golongan2A Kalsium = new Golongan2A("Kalsium", "Ca", "20", "40.078", "Silver", "Logam Alkali Tanah", 1115, 1757, 200, 22.3*0.000001, 1550);
	Golongan2A Stronsium = new Golongan2A("Stronsium", "Sr", "38", "87.62", "Silver", "Logam Alkali Tanah", 1050, 1655, 35, 22.5*0.000001, 2630);
	Golongan2A Barium = new Golongan2A("Barium", "Ba", "56", "137.327", "Silver", "Logam Alkali Tanah", 1000, 2143, 18, 20.6*0.000001, 3510);
	Golongan2A Radium = new Golongan2A("Radium", "Ra", "88", "132.905", "Metalik", "Logam Alkali Tanah", 973, 2010, 19, 0, 5000);

	Golongan3A Boron = new Golongan3A("Boron","B","5","10.811","Hitam","Non-logam",2349,4200,27,13.6*0.000001,2460);
	Golongan3A Aluminium = new Golongan3A("Aluminium","Al","13","26.9815386","Silver","Semi-logam",933.47,2792,235,13.6*0.000001,2700);
	Golongan3A Gallium = new Golongan3A("Gallium","Ga","31","69.723","Silver","Logam",302.91,2477,29,13.120*0.000001,5904);
	Golongan3A Indium = new Golongan3A("Indium","In","49","114.818","Silver","Logam",429.75,2345,82,32.1*0.000001,7310);
	Golongan3A Thallium = new Golongan3A("Thalium","Tl","81","204.3833","Putih Silver","Logam",577,1746,46,29.9*0.000001,11850);
	Golongan3A Ununtrium = new Golongan3A("Ununtrium","Uut","113","284",16000);
	
	Golongan4A Karbon = new Golongan4A("Karbon","C","6","12.0107","Kehitaman","Non-logam",3800,4300,140,7.1*0.000001,2267);
	Golongan4A Silikon = new Golongan4A("Silikon","Si","14","28.0855","Keabu-abuan","Non-logam",1687,3173,150,2.6*0.000001,2330);
	Golongan4A Germanium = new Golongan4A("Germanium","Ge","32","72.64","Abu-abu Putih","Semi-logam",1211,3093,60,6*0.000001,5323);
	Golongan4A Kaleng = new Golongan4A("Kaleng","Ti","50","118.70","Perak","Semi-logam",505.08,2875,66.6,22*0.000001,7310);
	Golongan4A Timbal = new Golongan4A("Timbal","Pb","82","207.2","Kebiruan","Logam",600.61,2022,35,28.9*0.000001,11340);
	Golongan4A Fleoporium = new Golongan4A("Fleoporium","Fl","114","289",14000);
	
	Golongan5A Nitrogen = new Golongan5A("Nitrogen","N","7","14","Tidak berwarna","Non-logam",63.05,77.36,0.02583,1026);
	Golongan5A Fosfor = new Golongan5A("Fospor","P","15","30.973762","Tidak berwarna","Non-logam",317.3,550,0.236,1823);
	Golongan5A Arsenik = new Golongan5A("Arsenik","As","33","74.92160","Abu-abu Metalik","Semi-logam",1090,887,50,5727);
	Golongan5A Antimon = new Golongan5A("Antimon","Sb","51","121.760","Abu-abu Silver","Semi-logam",903.78,1860,24,11.2*0.000001,6697);
	Golongan5A Bismut = new Golongan5A("Bismut","Bi","83","208.980","Putih Kemerahan","Logam",544.4,1837,8,13.4*0.000001,9780);
	Golongan5A Ununpentium = new Golongan5A("Ununpentium","Uup","115","288",13000);
	
	Golongan6A Oksigen = new Golongan6A("Oksigen","O","8","15.9994","Tidak berwarna","Non-logam",54.8,90.2,0.02658,1495);
	Golongan6A Sulfur = new Golongan6A("Belerang","S","16","32.065","Kuning lemon","Non-logam",388.36,717.87,0.02050,1960);
	Golongan6A Selenium = new Golongan6A("Selenium","Se","34","78","Keabu-abuan","Non-logam",494,958,0.52,4819);
	Golongan6A Tellurium = new Golongan6A("Tellurium","Te","52","127.60","Abu-abu perak","Semi-logam",722.6,1291,3,6240);
	Golongan6A Polonium = new Golongan6A("Polonium","Po","84","207.19","Perak","Logam",527,1235,20,9196);
	Golongan6A Livermorium = new Golongan6A("Livermorium","Lv","116","293",1120);
	
	Golongan7A Fluorin = new Golongan7A("Fluorin","F","9","18.9984032","Kuning tua","Non-logam",53.53,85.03,0.0277,1700);
    Golongan7A Klorin = new Golongan7A("Klorin","Cl","17","35.453","Hijau kekuningan","Non-logam",171.6,239.11,0.0089,2030);
    Golongan7A Bromin = new Golongan7A("Bromin","Br","35","79.904","Coklat kemerahan","Non-logam",265.8,332,0.12,4050);
    Golongan7A Iodine = new Golongan7A("Iodine","I","53","126.90447","Abu-abu keungu-unguan","Non-logam",386.85,457.4,0.449,4940);
    Golongan7A Astatin = new Golongan7A("Astatin","At","85","210","Abu-abu","Non-logam",53.53,85.03,0.0277,1700);
    Golongan7A Ununseptium = new Golongan7A("Ununseptium","Uus","117","294",7200);
        
    Golongan8A Helium = new Golongan8A("Helium","He","2","4.002602","Tidak berwarna","Non-logam",0.95, 4.22,0.1513,214);
    Golongan8A Neon = new Golongan8A("Neon","Ne","10","20.1797","Tidak berwarna","Non-logam",24.56,27.07,0.0491,1444);
    Golongan8A Argon = new Golongan8A("Argon","Ar","18","39.948","Tidak berwarna","Non-logam",83.8,87.3,0.01772,1616);
    Golongan8A Kripton = new Golongan8A("Kripton","Kr","9","18.9984032","Tidak berwarna","Non-logam",53.53,85.03,0.0277,1700);
    Golongan8A Xenon = new Golongan8A("Xenon","Xe","54","131.293","Tidak berwarna","Non-logam",161.4,165.1,0.00569,3640);
    Golongan8A Radon = new Golongan8A("Radon","Rn","86","222","Tidak berwarna","Non-logam",202,211.3 ,0.00361,4400);
    Golongan8A Ununoctium = new Golongan8A("Ununoctium","Uuo","118","294","Non-logam",0.0023,5700);
        
    Golongan1B Tembaga = new Golongan1B("Tembaga","Cu","29","63.546 ","Metalik","Logam",1357.77,3200,400,16.5*0.000001,8920);
    Golongan1B Perak = new Golongan1B("Perak","Ag","47","107.8682","Abu-abu","Logam",1234.93,2435,430,18.9*0.000001,10490);
    Golongan1B Emas = new Golongan1B("Emas","Au","79","196.966569","Emas","Logam",1337.33,3129,320,14.2*0.000001,19300);
    Golongan1B Roentgenium = new Golongan1B("Roentgenium","Rn","111","280 ","Logam", 24400);
        
    Golongan2B Seng = new Golongan2B("Seng","Zn","30","65.38","Abu-abu tua kebiru-biruan","Logam",692.68,1180,116,30.2*0.000001,7140);
    Golongan2B Cadmium = new Golongan2B("Cadmium","Cd","48","112.411","Metalik abu-abu","Logam",594.22,1040,97,30.8*0.000001,8650);
    Golongan2B Raksa = new Golongan2B("Raksa","Hg","80","200.59 ","Putih silver","Logam",234.32,629.88,8.3,14190);
    Golongan2B Copernicium = new Golongan2B("Copernicium","Cn","112","285","Logam",16800);
        
    Golongan3B Scandium = new Golongan3B("Scandium","Sc","21","44.955912","Putih silver","Logam",1814,3103,16,10.2*0.000001,2985);
    Golongan3B Yttrium = new Golongan3B("Yttrium","Y","39","88.90585","Putih silver","Logam",1799,3609,17.2,10.6*0.000001,4472);
    Golongan3B Lutetium = new Golongan3B("Lutetium","Lu","71"," 174.9668","Putih silver","Logam",1925,3675,16,9.9*0.000001,9841);
    Golongan3B Lawrencium = new Golongan3B("Lawrencium","Lr","103","262 ","Logam",1900,10);
      
    Golongan4B Titanium = new Golongan4B("Titanium","Ti","22","47.867","Metalik silver","Logam",1941,3560,21.9,8.6*0.000001,4507);
    Golongan4B Zirconium = new Golongan4B("Zirconium","Zr","90","91.224","Metalik silver","Logam",2128,4682,22.7,5.7*0.000001,6511);
    Golongan4B Hafnium = new Golongan4B("Hafnium","Hf","72","178.49","Abu-abu","Logam",2506,4876,23,5.9*0.000001,13310);
    Golongan4B Rutherfordium = new Golongan4B("Rutherfordium","Rf","104","265","Metalik silver","Logam",23,17000);
        
    Golongan5B Vanadium = new Golongan5B("Vanadium","V","23","50.9415","Metalik silver","Logam",2183,3680,30.7,8.4*0.000001,6110);
    Golongan5B Niobium = new Golongan5B("Niobium","Nb","41","92.90638","Metalik abu-abu","Logam",2750,5017,54,7.3*0.000001,8570);
    Golongan5B Tantalum = new Golongan5B("Tantalum","Ta","73","47.867","Biru keabu-abuan","Logam",3290,5731,57,6.3*0.000001,16650);
    Golongan5B Dubnium = new Golongan5B("Dubnium","Db","105","47.867","Metalik silver","Logam",1941,3560,21.9,8.6*0.000001,4507);
        
    Golongan6B Kromium = new Golongan6B("Kromium","Cr","24","50.9415","Metalik silver","Logam",2180,2944,94,4.9*0.000001,7140);
    Golongan6B Molybdenum = new Golongan6B("Molybdenum","Mo","42","95.96","Metalik silver","Logam",2896,4912,139,4.8*0.000001,10280);
    Golongan6B Tungsten = new Golongan6B("Tungsten","W","74","183.84","Putih keabuan","Logam", 3695,5828,174,4.5*0.000001,23200);
    Golongan6B Seaborgium = new Golongan6B("Seaborgium","Sg","106","271","Metalik silver","Logam",19,7140);
        
    Golongan7B Mangan = new Golongan7B("Mangan","Mn","25","54.938045","Metalik silver","Logam",1519,2334,7.8,21.7*0.000001,7470);
    Golongan7B Technetium = new Golongan7B("Technetium","Tc","43","98","Metalik silver","Logam",2430,4538,51,11500);
    Golongan7B Rhenium = new Golongan7B("Rhenium","Re","75","186.207","Putih keabu-abuan","Logam",3459,5869,48,6.2*0.000001,21020);
    Golongan7B Bohrium = new Golongan7B("Bohrium","Bh","107","272","Logam",3459,5869,48,6.2*0.000001,21020);
        
    Golongan8B Besi = new Golongan8B("Besi","Fe","26","55.845","Metalik","Logam",1811,3134,80,11.8*0.000001,7874);
    Golongan8B Cobalt = new Golongan8B("Cobalt","Co","27","58.933195","Metalik","Logam",1768,3200,100,13.0*0.000001,8900);
    Golongan8B Nikel = new Golongan8B("Nikel","Ni","28","58.6934","Metalik","Logam",1728,3186,91,13.4*0.000001,8908);
    Golongan8B Ruthenium = new Golongan8B("Ruthenium","Ru","44","101.07","Metalik putih","Logam",2607,4423,120,6.4*0.000001,12370);
    Golongan8B Rhodium = new Golongan8B("Rhodium","Rh","45","102.90550","Metalik putih","Logam",2237,3968,150,8.2*0.000001,12450);
    Golongan8B Palladium = new Golongan8B("Palladium","Pd","46","106.42","Metalik","Logam",1828.05,3236,72,11.8*0.000001,12023);
    Golongan8B Osmium = new Golongan8B("Osmium","Os","76","190.23","Abu-abu kebiru-biruan","Logam",3306,5285,88,5.1*0.000001,22610);
    Golongan8B Iridium = new Golongan8B("Iridium","Ir","77","192.217 ","Putih silver","Logam",2739,4701,150,6.4*0.000001,22650 );
    Golongan8B Platina = new Golongan8B("Platina","Pt","78","195.084 ","Putih keabu-abuan","Logam",2041.4,4098,72,8.8*0.000001,21090);
    Golongan8B Hassium = new Golongan8B("Hassium","Hs","108","277","Logam",28600);
    Golongan8B Meitnerium = new Golongan8B("Meitnerium","Mt","109","276","Logam",28200);
    Golongan8B Darmstadtium = new Golongan8B("Darmstadtium","Ds","110","281","Logam",27400);
        
    GolonganLantanida Lanthanum = new GolonganLantanida("Lanthanum","La","57","138.90547","Putih silver","Logam",1193,3743,13,12.1*0.000001,6146);
    GolonganLantanida Cerium = new GolonganLantanida("Cerium","Ce","58","138.90547","Putih silver","Logam",1068,3633,11,6.3*0.000001,6689);
    GolonganLantanida Praseodymium = new GolonganLantanida("Praseodymium","Pr","59","140.90765","Putih silver","Logam",1208,3563,13,6.7*0.000001,6640);
    GolonganLantanida Neodymium = new GolonganLantanida("Neodymium","Nd","60","144.242","Putih silver","Logam",1297,3373,17,9.6*0.000001,6800);
    GolonganLantanida Promethium = new GolonganLantanida("Promethium","Pm","61","145","Metalik","Logam",1373,3273,15,11*0.000001,7264);
    GolonganLantanida Samarium = new GolonganLantanida("Samarium","Sm","62","150.36","Putih silver","Logam",1345,2076,13,12.7*0.000001,7353);
    GolonganLantanida Europium = new GolonganLantanida("Europium","Eu","63","151.964","Putih silver","Logam",1099,1800,14,35*0.000001,5244 );
    GolonganLantanida Gadolinium = new GolonganLantanida("Gadolinium","Gd","64","157.25","Putih silver","Logam",1585,3523,11,9.4*0.000001,7901);
    GolonganLantanida Terbium = new GolonganLantanida("Terbium","Tb","65","158.92535","Putih silver","Logam",1629,3503,11,10.3*0.000001,8219 );
    GolonganLantanida Dysprosium = new GolonganLantanida("Dysprosium","La","66","162.500","Putih silver","Logam",1680,2840,11,9.9*0.000001,8551);
    GolonganLantanida Holmium = new GolonganLantanida("Holmium","Ho","67","164.93032","Putih silver","Logam",1734,2993,16,11.2*0.000001,8795);
    GolonganLantanida Erbium = new GolonganLantanida("Erbium","Er","68","167.259","Putih silver","Logam",1802,3141,15,12.2*0.000001,9066);
    GolonganLantanida Thulium = new GolonganLantanida("Thulium","Tm","69","168.93421","Putih silver","Logam",1818,2223,17,13.3*0.000001,9321);
    GolonganLantanida Ytterbium = new GolonganLantanida("Ytterbium","Yb","70","173.054","Putih silver","Logam",1097,1469,34.9,26.3*0.000001,6570);
      
    GolonganAktinida Actinium = new GolonganAktinida("Actinium","Ac","89","227","Silver","Logam",1323,3573,12,10070);
    GolonganAktinida Thorium = new GolonganAktinida("Thorium","Th","90","232.03806","Putih silver","Logam",2115,5093,54,11*0.000001,11724);
    GolonganAktinida Protactinium = new GolonganAktinida("Actinium","Pa","91","231.03588","Metalik silver","Logam",1841,4300,47,15370);
    GolonganAktinida Uranium = new GolonganAktinida("Uranium","U","92","238.02891","Abu-abu metalik","Logam",1405.3,4200,27.6,13.9 *0.000001,19050);
    GolonganAktinida Neptunium = new GolonganAktinida("Neptunium","Np","93","237","Metalik silver","Logam",910,4300,6,20450);
    GolonganAktinida Plutonium = new GolonganAktinida("Plutonium","Pu","94","244","Putih silver","Logam",912.5,3503,6,19816);
    GolonganAktinida Americium = new GolonganAktinida("Americium","Am","95","243","Putih silver","Logam",1449,2880,10,13780);
    GolonganAktinida Curium = new GolonganAktinida("Curium","Cm","96","247","Silver","Logam",1613,3383,10 ,13510);
    GolonganAktinida Berkelium = new GolonganAktinida("Berkelium","Bk","97","247","Logam",1259,10,14780);
    GolonganAktinida Californium = new GolonganAktinida("Californium","Cf","98","251","Logam",1173,10,15100);
    GolonganAktinida Einsteinium = new GolonganAktinida("Einsteinium","Es","99","252","Logam",1133,10,13500);
    GolonganAktinida Fermium = new GolonganAktinida("Fermium","Fm","100","257","Logam",1800,10);
    GolonganAktinida Mendelevium = new GolonganAktinida("Mendelevium","Md","101","258","Logam",1100,10);
    GolonganAktinida Nobelium = new GolonganAktinida("Nobelium","No","102","259","Logam",1100,10);
	
	public DataUnsur() {
		getData();
	}
	
	public String getData () {
		return data;
	}
	
		//Golongan I A
		//Hidrogen, Lithium, Natrium, Kalium, Rubidium, Cesium, Fransium
		public void hidrogen() {
			data = "Nama unsur : " + Hidrogen.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Hidrogen.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Hidrogen.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Hidrogen.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Hidrogen.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Hidrogen.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Hidrogen.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Hidrogen.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Hidrogen.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Hidrogen.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Hidrogen.dapatMassaJenis() + " Kg/m3 \n";
	    	
		}
		
		public void lithium() {
			data = "Nama unsur : " + Lithium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Lithium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Lithium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Lithium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Lithium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Lithium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Lithium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Lithium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Lithium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Lithium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Lithium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Lithium.dapatNama() + " ? (Y/T)" );
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				besarKonduksi = Lithium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Lithium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
				panjangAkhir = (Lithium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Lithium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Lithium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
				
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
		}
		
		public void natrium() {
			data = "Nama unsur : " + Natrium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Natrium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Natrium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Natrium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Natrium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Natrium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Natrium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Natrium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Natrium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Natrium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Natrium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Natrium.dapatNama() + " ? (Y/T)" );
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				besarKonduksi = Natrium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Natrium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
				panjangAkhir = (Natrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Natrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Natrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
				
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
		}
		
		public void kalium() {
			data = "Nama unsur : " + Kalium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Kalium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Kalium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Kalium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Kalium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Kalium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Kalium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Kalium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Kalium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Kalium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Kalium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Kalium.dapatNama() + " ? (Y/T)" );
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				besarKonduksi = Kalium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Kalium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
				panjangAkhir = (Kalium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Kalium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Kalium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
				
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
		}
		
		public void rubidium() {
			data = "Nama unsur : " + Rubidium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Rubidium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Rubidium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Rubidium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Rubidium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Rubidium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Rubidium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Rubidium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Rubidium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Rubidium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Rubidium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Rubidium.dapatNama() + " ? (Y/T)" );
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				besarKonduksi = Rubidium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Rubidium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
				panjangAkhir = (Rubidium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Rubidium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Rubidium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
				
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
		}
		
		public void cesium() {
			data = "Nama unsur : " + Cesium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Cesium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Cesium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Cesium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Cesium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " +Cesium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Cesium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Cesium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Cesium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Cesium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Cesium.dapatMassaJenis() + " Kg/m3 \n";
	    	
		}
		
		public void fransium() {
			data = "Nama unsur : " + Fransium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Fransium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Fransium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Fransium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Fransium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Fransium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Fransium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Fransium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Fransium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Fransium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Fransium.dapatMassaJenis() + " Kg/m3 \n";
	    	
		}
		
				//Golongan II A
				//Hidrogen, Lithium, Natrium, Kalium, Rubidium, Cesium, Fransium
				public void berrilium() {
					data = "Nama unsur : " + Berrilium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Berrilium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Berrilium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Berrilium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Berrilium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " + Berrilium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Berrilium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Berrilium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Berrilium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Berrilium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Berrilium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Berrilium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Berrilium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
					String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Berrilium.dapatNama() + " ? (Y/T)");
					double volume = panjangUnsur * panjangUnsur * panjangUnsur;
					double panjangAkhir;
					double luasAkhir;
					double volumeAkhir;
					if (pilihan2.equalsIgnoreCase("Y")){
						panjangAkhir = (Berrilium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
						luasAkhir = (2 * Berrilium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
						volumeAkhir = (3 * Berrilium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
						
						data += "Panjang Akhir : " + panjangAkhir + " m \n";
						data += "Luas Akhir : " + luasAkhir + " m2 \n";
						data += "Volume Akhir : " + volumeAkhir + " m3 \n";
						data += "\n";
					}
			    	
				}
				
				public void magnesium() {
					data = "Nama unsur : " + Magnesium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Magnesium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Magnesium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Magnesium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Magnesium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " + Magnesium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Magnesium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Magnesium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Magnesium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Magnesium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Magnesium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Magnesium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Magnesium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
					String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Magnesium.dapatNama() + " ? (Y/T)");
					double volume = panjangUnsur * panjangUnsur * panjangUnsur;
					double panjangAkhir;
					double luasAkhir;
					double volumeAkhir;
					if (pilihan2.equalsIgnoreCase("Y")){
						panjangAkhir = (Magnesium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
						luasAkhir = (2 * Magnesium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
						volumeAkhir = (3 * Magnesium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
						
						data += "Panjang Akhir : " + panjangAkhir + " m \n";
						data += "Luas Akhir : " + luasAkhir + " m2 \n";
						data += "Volume Akhir : " + volumeAkhir + " m3 \n";
						data += "\n";
					}
				}
				
				public void kalsium() {
					data = "Nama unsur : " + Kalsium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Kalsium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Kalsium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Kalsium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Kalsium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " + Kalsium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Kalsium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Kalsium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Kalsium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Kalsium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Kalsium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Kalsium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Kalsium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
					String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Kalsium.dapatNama() + " ? (Y/T)");
					double volume = panjangUnsur * panjangUnsur * panjangUnsur;
					double panjangAkhir;
					double luasAkhir;
					double volumeAkhir;
					if (pilihan2.equalsIgnoreCase("Y")){
						panjangAkhir = (Kalsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
						luasAkhir = (2 * Kalsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
						volumeAkhir = (3 * Kalsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
						
						data += "Panjang Akhir : " + panjangAkhir + " m \n";
						data += "Luas Akhir : " + luasAkhir + " m2 \n";
						data += "Volume Akhir : " + volumeAkhir + " m3 \n";
						data += "\n";
					}
				}
				
				public void stronsium() {
					data = "Nama unsur : " + Stronsium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Stronsium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Stronsium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Stronsium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Stronsium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " + Stronsium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Stronsium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Stronsium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Stronsium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Stronsium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Kalium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Stronsium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Stronsium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
					String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Stronsium.dapatNama() + " ? (Y/T)");
					double volume = panjangUnsur * panjangUnsur * panjangUnsur;
					double panjangAkhir;
					double luasAkhir;
					double volumeAkhir;
					if (pilihan2.equalsIgnoreCase("Y")){
						panjangAkhir = (Stronsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
						luasAkhir = (2 * Stronsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
						volumeAkhir = (3 * Stronsium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
						
						data += "Panjang Akhir : " + panjangAkhir + " m \n";
						data += "Luas Akhir : " + luasAkhir + " m2 \n";
						data += "Volume Akhir : " + volumeAkhir + " m3 \n";
						data += "\n";
					}
				}
				
				public void barium() {
					data = "Nama unsur : " + Barium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Barium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Barium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Barium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Barium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " + Barium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Barium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Barium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Barium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Barium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Barium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Barium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Barium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
					String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Barium.dapatNama() + " ? (Y/T)");
					double volume = panjangUnsur * panjangUnsur * panjangUnsur;
					double panjangAkhir;
					double luasAkhir;
					double volumeAkhir;
					if (pilihan2.equalsIgnoreCase("Y")){
						panjangAkhir = (Barium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
						luasAkhir = (2 * Barium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
						volumeAkhir = (3 * Barium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
						
						data += "Panjang Akhir : " + panjangAkhir + " m \n";
						data += "Luas Akhir : " + luasAkhir + " m2 \n";
						data += "Volume Akhir : " + volumeAkhir + " m3 \n";
						data += "\n";
					}
				}
				
				public void radium() {
					data = "Nama unsur : " + Radium.dapatNama() + "\n";
			    	data += "Simbol Unsur : " + Radium.dapatSimbol() + "\n";
			    	data += "Nomor Atom : " + Radium.dapatNomorAtom() + "\n";
			    	data += "Massa Atom : " + Radium.dapatMassaAtom() + "\n";
			    	data += "Warna : " + Radium.dapatWarna() + "\n";
			    	data += "Jenis Unsur : " +Radium.dapatJenisUnsur() + "\n";
			    	data += "Sifat Fisika"  + "\n";
			    	data += "============" + "\n";
			    	data += "Titik Lebur : " + Radium.dapatTitikLebur() + " K \n";
			    	data += "Titik didih : " + Radium.dapatTitikDidih() + " K \n";
			    	data += "Konduktivitas termal : " + Radium.dapatKonduktivitasTermal()  + " w/m.K \n";
			    	data += "Koefisien Muai Panjang : " + Radium.dapatKoefisienMuai() + " /K \n";
			    	data += "Massa Jenis : " + Radium.dapatMassaJenis() + " Kg/m3 \n";
			    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Barium.dapatNama() + " ? (Y/T)" );
			    	double panjangUnsur = 0;
			    	double luasPermukaan = 0;
			    	double suhuPanas = 0;
			    	double suhuDingin = 0;
			    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						besarKonduksi = Barium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
			    	
				}
				
	
	//Gol IIIA
	//Boron, Aluminium, Gallium, Indium, Thallium, Ununtrium
	public void boron () {
		data = "Nama unsur : " + Boron.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Boron.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Boron.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Boron.dapatMassaAtom() + "\n";
    	data += "Warna : " + Boron.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Boron.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Boron.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Boron.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Boron.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Boron.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Boron.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Boron.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Boron.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
	String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Boron.dapatNama() + " ? (Y/T)");
	double volume = panjangUnsur * panjangUnsur * panjangUnsur;
	double panjangAkhir;
	double luasAkhir;
	double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
							
					panjangAkhir = (Boron.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Boron.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Boron.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
					
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";

				}
    		
	}
	
	public void aluminium () {
		data = "Nama unsur : " + Aluminium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Aluminium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Aluminium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Aluminium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Aluminium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Aluminium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Aluminium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Aluminium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Aluminium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Aluminium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Aluminium.dapatMassaJenis() + " Kg/m3 \n";
    	
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Aluminium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Aluminium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Aluminium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
						
			panjangAkhir = (Aluminium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
			luasAkhir = (2 * Aluminium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
			volumeAkhir = (3 * Aluminium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
			data += "Panjang Akhir : " + panjangAkhir + " m \n";
			data += "Luas Akhir : " + luasAkhir + " m2 \n";
			data += "Volume Akhir : " + volumeAkhir + " m3 \n";
			data += "\n";
					}
	}
	
	public void gallium () {
    	data = "Nama unsur : " + Gallium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Gallium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Gallium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Gallium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Gallium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Gallium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Gallium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Gallium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Gallium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Gallium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Emas.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Gallium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Gallium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Gallium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Gallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Gallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Gallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
	}
	
	public void indium () {
		data = "Nama unsur : " + Indium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Indium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Indium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Indium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Indium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Indium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Indium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Indium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Indium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Indium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Indium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Indium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi = 0;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Indium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Indium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Indium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Indium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Indium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
    		
	}
	
	public void thallium () {
		data = "Nama unsur : " + Thallium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Thallium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Thallium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Thallium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Thallium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Thallium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Thallium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Thallium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Thallium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Thallium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Thallium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Thallium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Thallium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}

		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Thallium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Thallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Thallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Thallium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
    		
	}
	
	public void ununtrium () {
		data = "Nama unsur : " + Ununtrium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Ununtrium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Ununtrium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Ununtrium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Ununtrium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Ununtrium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Ununtrium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Ununtrium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Ununtrium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Ununtrium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Ununtrium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Ununtrium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Ununtrium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Ununtrium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Ununtrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Ununtrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Ununtrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";

			}
    	
	}
	
	//Golongan IVA
	//Karbon, Silikon, Germanium, Kaleng, Timbal, Fleoporium
	public void karbon () {
		data = "Nama unsur : " + Karbon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Karbon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Karbon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Karbon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Karbon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Karbon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Karbon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Karbon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Karbon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Karbon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Karbon.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Karbon.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Karbon.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Karbon.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
								
				panjangAkhir = (Karbon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Karbon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Karbon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";

			}
    		
	}
	
	public void silikon () {
		data = "Nama unsur : " + Silikon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Silikon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Silikon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Silikon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Silikon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Silikon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Silikon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Silikon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Silikon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Silikon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Silikon.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Silikon.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Silikon.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Silikon.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Silikon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Silikon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Silikon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
				
			}
    		
	}
	
	public void germanium () {
		data = "Nama unsur : " + Germanium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Germanium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Germanium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Germanium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Germanium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Germanium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Germanium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Germanium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Germanium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Germanium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Germanium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Germanium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Germanium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Germanium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
								
				panjangAkhir = (Germanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Germanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Germanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";

			}
    		
	}
	
	public void kaleng () {
		data = "Nama unsur : " + Kaleng.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Kaleng.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Kaleng.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Kaleng.dapatMassaAtom() + "\n";
    	data += "Warna : " + Kaleng.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Kaleng.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Kaleng.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Kaleng.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Kaleng.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Kaleng.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Kaleng.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Kaleng.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Kaleng.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Kaleng.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Kaleng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Kaleng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Kaleng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
				
			}
    		
	}
	
	public void timbal () {
		data = "Nama unsur : " + Timbal.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Timbal.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Timbal.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Timbal.dapatMassaAtom() + "\n";
    	data += "Warna : " + Timbal.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Timbal.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Timbal.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Timbal.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Timbal.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Timbal.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Timbal.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Timbal.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Timbal.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Timbal.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
								
				panjangAkhir = (Timbal.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Timbal.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Timbal.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";

			}
    		
	}
	
	public void fleoporium () {
		data = "Nama unsur : " + Fleoporium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Fleoporium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Fleoporium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Fleoporium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Fleoporium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Fleoporium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Fleoporium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Fleoporium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Fleoporium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Fleoporium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Fleoporium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Fleoporium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Fleoporium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Fleoporium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Fleoporium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Fleoporium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Fleoporium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
				
			}
    		
	}
	
	
	//Gol VA
	//Nitrogen, Fosforus, Arsenik, Antimon, Bismut, Ununpentium
		
	public void nitrogen () {
			data = "Nama unsur : " + Nitrogen.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Nitrogen.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Nitrogen.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Nitrogen.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Nitrogen.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Nitrogen.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Nitrogen.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Nitrogen.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Nitrogen.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Nitrogen.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Nitrogen.dapatMassaJenis() + " Kg/m3 \n";

		}
			public void fosfor () {
				data = "Nama unsur : " + Fosfor.dapatNama() + "\n";
		    	data += "Simbol Unsur : " + Fosfor.dapatSimbol() + "\n";
		    	data += "Nomor Atom : " + Fosfor.dapatNomorAtom() + "\n";
		    	data += "Massa Atom : " + Fosfor.dapatMassaAtom() + "\n";
		    	data += "Warna : " + Fosfor.dapatWarna() + "\n";
		    	data += "Jenis Unsur : " + Fosfor.dapatJenisUnsur() + "\n";
		    	data += "Sifat Fisika"  + "\n";
		    	data += "============" + "\n";
		    	data += "Titik Lebur : " + Fosfor.dapatTitikLebur() + " K \n";
		    	data += "Titik didih : " + Fosfor.dapatTitikDidih() + " K \n";
		    	data += "Konduktivitas termal : " + Fosfor.dapatKonduktivitasTermal()  + " w/m.K \n";
		    	data += "Koefisien Muai Panjang : " + Fosfor.dapatKoefisienMuai() + " /K \n";
		    	data += "Massa Jenis : " + Fosfor.dapatMassaJenis() + " Kg/m3 \n";
		    		
			}
			
			public void arsenik () {
				data = "Nama unsur : " + Arsenik.dapatNama() + "\n";
		    	data += "Simbol Unsur : " + Arsenik.dapatSimbol() + "\n";
		    	data += "Nomor Atom : " + Arsenik.dapatNomorAtom() + "\n";
		    	data += "Massa Atom : " + Arsenik.dapatMassaAtom() + "\n";
		    	data += "Warna : " + Arsenik.dapatWarna() + "\n";
		    	data += "Jenis Unsur : " +Arsenik.dapatJenisUnsur() + "\n";
		    	data += "Sifat Fisika"  + "\n";
		    	data += "============" + "\n";
		    	data += "Titik Lebur : " + Arsenik.dapatTitikLebur() + " K \n";
		    	data += "Titik didih : " + Arsenik.dapatTitikDidih() + " K \n";
		    	data += "Konduktivitas termal : " + Arsenik.dapatKonduktivitasTermal()  + " w/m.K \n";
		    	data += "Koefisien Muai Panjang : " + Arsenik.dapatKoefisienMuai() + " /K \n";
		    	data += "Massa Jenis : " + Bromin.dapatMassaJenis() + " Kg/m3 \n";
		    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Arsenik.dapatNama() + " ? (Y/T)");
		    	double panjangUnsur = 0;
		    	double luasPermukaan = 0;
		    	double suhuPanas = 0;
		    	double suhuDingin = 0;
		    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						
						besarKonduksi = Arsenik.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
		    		
			}
			
			public void antimon () {
				data = "Nama unsur : " + Antimon.dapatNama() + "\n";
		    	data += "Simbol Unsur : " + Antimon.dapatSimbol() + "\n";
		    	data += "Nomor Atom : " + Antimon.dapatNomorAtom() + "\n";
		    	data += "Massa Atom : " + Antimon.dapatMassaAtom() + "\n";
		    	data += "Warna : " + Antimon.dapatWarna() + "\n";
		    	data += "Jenis Unsur : " + Antimon.dapatJenisUnsur() + "\n";
		    	data += "Sifat Fisika"  + "\n";
		    	data += "============" + "\n";
		    	data += "Titik Lebur : " + Antimon.dapatTitikLebur() + " K \n";
		    	data += "Titik didih : " + Antimon.dapatTitikDidih() + " K \n";
		    	data += "Konduktivitas termal : " + Antimon.dapatKonduktivitasTermal()  + " w/m.K \n";
		    	data += "Koefisien Muai Panjang : " + Antimon.dapatKoefisienMuai() + " /K \n";
		    	data += "Massa Jenis : " + Antimon.dapatMassaJenis() + " Kg/m3 \n";
		    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Antimon.dapatNama() + " ? (Y/T)");
		    	double panjangUnsur = 0;
		    	double luasPermukaan = 0;
		    	double suhuPanas = 0;
		    	double suhuDingin = 0;
		    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						
						besarKonduksi = Antimon.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Antimon.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
						if (pilihan2.equalsIgnoreCase("Y")){
									
							panjangAkhir = (Antimon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
							luasAkhir = (2 * Antimon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
							volumeAkhir = (3 * Antimon.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
							data += "Panjang Akhir : " + panjangAkhir + " m \n";
							data += "Luas Akhir : " + luasAkhir + " m2 \n";
							data += "Volume Akhir : " + volumeAkhir + " m3 \n";
							data += "\n";
		
						}
		    		
			}
			
			public void bismut () {
				data = "Nama unsur : " + Bismut.dapatNama() + "\n";
		    	data += "Simbol Unsur : " + Bismut.dapatSimbol() + "\n";
		    	data += "Nomor Atom : " + Bismut.dapatNomorAtom() + "\n";
		    	data += "Massa Atom : " + Bismut.dapatMassaAtom() + "\n";
		    	data += "Warna : " + Bismut.dapatWarna() + "\n";
		    	data += "Jenis Unsur : " + Bismut.dapatJenisUnsur() + "\n";
		    	data += "Sifat Fisika"  + "\n";
		    	data += "============" + "\n";
		    	data += "Titik Lebur : " + Bismut.dapatTitikLebur() + " K \n";
		    	data += "Titik didih : " + Bismut.dapatTitikDidih() + " K \n";
		    	data += "Konduktivitas termal : " + Bismut.dapatKonduktivitasTermal()  + " w/m.K \n";
		    	data += "Koefisien Muai Panjang : " + Bismut.dapatKoefisienMuai() + " /K \n";
		    	data += "Massa Jenis : " + Bismut.dapatMassaJenis() + " Kg/m3 \n";
		    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Bismut.dapatNama() + " ? (Y/T)");
		    	double panjangUnsur = 0;
		    	double luasPermukaan = 0;
		    	double suhuPanas = 0;
		    	double suhuDingin = 0;
		    	double besarKonduksi;
					if (pilihan.equalsIgnoreCase("Y")){
						
						panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
						luasPermukaan = panjangUnsur * panjangUnsur;
						suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
						suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
						
						besarKonduksi = Bismut.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
						
						data += "Besar Konduksi : " + besarKonduksi + " watt \n";
					}
					
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Bismut.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
						if (pilihan2.equalsIgnoreCase("Y")){
									
							panjangAkhir = (Bismut.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
							luasAkhir = (2 * Bismut.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
							volumeAkhir = (3 * Bismut.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
							data += "Panjang Akhir : " + panjangAkhir + " m \n";
							data += "Luas Akhir : " + luasAkhir + " m2 \n";
							data += "Volume Akhir : " + volumeAkhir + " m3 \n";
							data += "\n";
		
						}
		    		
			}
			
			public void ununpentium () {
				data = "Nama unsur : " + Ununpentium.dapatNama() + "\n";
		    	data += "Simbol Unsur : " + Ununpentium.dapatSimbol() + "\n";
		    	data += "Nomor Atom : " + Ununpentium.dapatNomorAtom() + "\n";
		    	data += "Massa Atom : " + Ununpentium.dapatMassaAtom() + "\n";
		    	data += "Warna : " + Ununpentium.dapatWarna() + "\n";
		    	data += "Jenis Unsur : " + Ununpentium.dapatJenisUnsur() + "\n";
		    	data += "Sifat Fisika"  + "\n";
		    	data += "============" + "\n";
		    	data += "Titik Lebur : " + Ununpentium.dapatTitikLebur() + " K \n";
		    	data += "Titik didih : " + Ununpentium.dapatTitikDidih() + " K \n";
		    	data += "Konduktivitas termal : " + Ununpentium.dapatKonduktivitasTermal()  + " w/m.K \n";
		    	data += "Koefisien Muai Panjang : " + Ununpentium.dapatKoefisienMuai() + " /K \n";
		    	data += "Massa Jenis : " + Ununpentium.dapatMassaJenis() + " Kg/m3 \n";
		    		
			}

		//Gol VIA
		//Oksigen, Belerang, Selenium, Tellurium, Polonium, Livermorium
		public void oksigen () {
			data = "Nama unsur : " + Oksigen.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Oksigen.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Oksigen.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Oksigen.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Oksigen.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Oksigen.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Oksigen.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Oksigen.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Oksigen.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Oksigen.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Oksigen.dapatMassaJenis() + " Kg/m3 \n";
		
		}
		
		public void belerang () {
			data = "Nama unsur : " + Sulfur.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Sulfur.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Sulfur.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Sulfur.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Sulfur.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " +Sulfur.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Sulfur.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Sulfur.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Sulfur.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Sulfur.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Neon.dapatMassaJenis() + " Kg/m3 \n";

	    		
		}
		
		public void selenium () {
			data = "Nama unsur : " + Selenium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Selenium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Selenium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Selenium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Selenium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Selenium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Selenium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Selenium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Selenium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Selenium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Selenium.dapatMassaJenis() + " Kg/m3 \n";
	    		
		}
		
		public void tellurium () {
			data = "Nama unsur : " + Tellurium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Tellurium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Tellurium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Tellurium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Tellurium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Tellurium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Tellurium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Tellurium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Tellurium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Tellurium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Tellurium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Tellurium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = panjangUnsur * panjangUnsur;
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
					
					besarKonduksi = Tellurium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt \n";
				}

		}
		
		public void polonium () {
			data = "Nama unsur : " + Polonium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Polonium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Polonium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Polonium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Polonium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Polonium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Polonium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Polonium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Polonium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Polonium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Polonium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Polonium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = panjangUnsur * panjangUnsur;
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
					
					besarKonduksi = Polonium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt \n";
				}

		}
		
		public void livermorium () {
			data = "Nama unsur : " + Livermorium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Livermorium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Livermorium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Livermorium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Livermorium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Livermorium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Livermorium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Livermorium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Livermorium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Livermorium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Livermorium.dapatMassaJenis() + " Kg/m3 \n";
		
		}
		
		//Gol VIIA
		//Fluorin, Clorin, Bromium, Iodium, Astatin
	
		public void fluorin () {
		data = "Nama unsur : " + Fluorin.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Fluorin.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Fluorin.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Fluorin.dapatMassaAtom() + "\n";
    	data += "Warna : " + Fluorin.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Fluorin.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Fluorin.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Fluorin.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Fluorin.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Fluorin.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Fluorin.dapatMassaJenis() + " Kg/m3 \n";

    		
	}
		public void klorin () {
			data = "Nama unsur : " + Klorin.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Klorin.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Klorin.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Klorin.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Klorin.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Klorin.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Klorin.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Klorin.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Klorin.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Klorin.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Klorin.dapatMassaJenis() + " Kg/m3 \n";

	    		
		}
		
		public void bromin () {
			data = "Nama unsur : " + Bromin.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Bromin.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Bromin.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Bromin.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Bromin.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " +Bromin.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Bromin.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Bromin.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Bromin.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Bromin.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Bromin.dapatMassaJenis() + " Kg/m3 \n";

		}
		
		public void iodine () {
			data = "Nama unsur : " + Iodine.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Iodine.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Iodine.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Iodine.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Iodine.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Iodine.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Iodine.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Iodine.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Iodine.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Iodine.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Iodine.dapatMassaJenis() + " Kg/m3 \n";

		}
		
		public void astatin () {
			data = "Nama unsur : " + Astatin.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Astatin.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Astatin.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Astatin.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Astatin.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Astatin.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Astatin.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Astatin.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Astatin.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Astatin.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Astatin.dapatMassaJenis() + " Kg/m3 \n";

		}
		
		public void ununseptium () {
			data = "Nama unsur : " + Ununseptium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Ununseptium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Ununseptium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Ununseptium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Ununseptium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Ununseptium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Ununseptium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Ununseptium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Ununseptium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Ununseptium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Ununseptium.dapatMassaJenis() + " Kg/m3 \n";

		}

	//Gol VIIIA
	//Helium, Neon, Argon, Krypton, Xenon, Radon
	public void helium () {
		data = "Nama unsur : " + Helium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Helium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Helium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Helium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Helium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Helium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Helium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Helium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Helium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Helium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Helium.dapatMassaJenis() + " Kg/m3 \n";

	}
	
	public void neon () {
		data = "Nama unsur : " + Neon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Neon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Neon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Neon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Neon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " +Neon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Neon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Neon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Neon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Neon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Neon.dapatMassaJenis() + " Kg/m3 \n";

	}
	
	public void argon () {
		data = "Nama unsur : " + Argon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Argon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Argon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Argon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Argon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Argon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Argon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Argon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Argon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Argon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Argon.dapatMassaJenis() + " Kg/m3 \n";

	}
	
	public void kripton () {
		data = "Nama unsur : " + Kripton.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Kripton.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Kripton.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Kripton.dapatMassaAtom() + "\n";
    	data += "Warna : " + Kripton.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Kripton.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Kripton.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Kripton.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Kripton.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Kripton.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Kripton.dapatMassaJenis() + " Kg/m3 \n";
	}
	
	public void xenon () {
		data = "Nama unsur : " + Xenon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Xenon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Xenon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Xenon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Xenon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Xenon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Xenon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Xenon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Xenon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Xenon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Xenon.dapatMassaJenis() + " Kg/m3 \n";
    		
	}
	
	public void radon () {
		data = "Nama unsur : " + Radon.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Radon.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Radon.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Radon.dapatMassaAtom() + "\n";
    	data += "Warna : " + Radon.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Radon.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Radon.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Radon.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Radon.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Radon.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Radon.dapatMassaJenis() + " Kg/m3 \n";
  		
	}
	
	public void ununoctium () {
		data = "Nama unsur : " + Ununoctium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Ununoctium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Ununoctium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Ununoctium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Ununoctium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Ununoctium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Ununoctium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Ununoctium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Ununoctium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Ununoctium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Ununoctium.dapatMassaJenis() + " Kg/m3 \n";

	}
	
	//Golongan 1B
	//Tembaga, Perak, Emas, Roentgenium
	public void tembaga () {
		data = "Nama unsur : " + Tembaga.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Tembaga.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Tembaga.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Tembaga.dapatMassaAtom() + "\n";
    	data += "Warna : " + Tembaga.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Tembaga.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Tembaga.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Tembaga.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Tembaga.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Tembaga.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Tembaga.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Tembaga.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Tembaga.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
	String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Tembaga.dapatNama() + " ? (Y/T)");
	double volume = panjangUnsur * panjangUnsur * panjangUnsur;
	double panjangAkhir;
	double luasAkhir;
	double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
							
					panjangAkhir = (Tembaga.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Tembaga.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Tembaga.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
					
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";

				}
    		
	}
	
	public void perak () {
		data = "Nama unsur : " + Perak.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Perak.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Perak.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Perak.dapatMassaAtom() + "\n";
    	data += "Warna : " + Perak.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Perak.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Perak.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Perak.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Perak.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Perak.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Perak.dapatMassaJenis() + " Kg/m3 \n";
    	
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Perak.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Perak.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Perak.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
						
			panjangAkhir = (Perak.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
			luasAkhir = (2 * Perak.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
			volumeAkhir = (3 * Perak.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
			data += "Panjang Akhir : " + panjangAkhir + " m \n";
			data += "Luas Akhir : " + luasAkhir + " m2 \n";
			data += "Volume Akhir : " + volumeAkhir + " m3 \n";
			data += "\n";
					}
	}
	
	public void emas () {
    	data = "Nama unsur : " + Emas.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Emas.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Emas.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Emas.dapatMassaAtom() + "\n";
    	data += "Warna : " + Emas.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Emas.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Emas.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Emas.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Emas.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Emas.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Emas.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Emas.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Emas.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Emas.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Emas.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Emas.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Emas.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
	}
	
	public void roentgenium () {
		data = "Nama unsur : " + Roentgenium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Roentgenium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Roentgenium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Roentgenium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Roentgenium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Roentgenium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Roentgenium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Roentgenium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Roentgenium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Roentgenium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Roentgenium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Roentgenium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi = 0;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Roentgenium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Roentgenium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Roentgenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Roentgenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Roentgenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
    		
	}
	
	//Golongan IIB
	//Seng, Cadmium, Raksa, Copernicium
	
	public void seng () {
		data = "Nama unsur : " + Seng.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Seng.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Seng.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Seng.dapatMassaAtom() + "\n";
    	data += "Warna : " + Seng.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Seng.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Seng.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Seng.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Seng.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Seng.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Seng.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Seng.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				
				besarKonduksi = Seng.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}

		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Seng.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Seng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Seng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Seng.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
			}
    		
	}
	
	public void cadmium () {
		data = "Nama unsur : " + Cadmium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Cadmium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Cadmium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Cadmium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Cadmium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Cadmium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Cadmium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Cadmium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Cadmium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Cadmium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Cadmium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Cadmium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Cadmium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Cadmium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Cadmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Cadmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Cadmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";

			}
    	
	}
	
	public void raksa () {
		data = "Nama unsur : " + Raksa.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Raksa.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Raksa.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Raksa.dapatMassaAtom() + "\n";
    	data += "Warna : " + Raksa.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Raksa.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Raksa.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Raksa.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Raksa.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Raksa.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Raksa.dapatMassaJenis() + " Kg/m3 \n";    		
	}
	
	public void copernicium () {
		data = "Nama unsur : " + Copernicium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Copernicium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Copernicium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Copernicium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Copernicium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Copernicium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Copernicium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Copernicium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Copernicium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Copernicium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Copernicium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Copernicium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Copernicium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Copernicium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
									
				panjangAkhir = (Copernicium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Copernicium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Copernicium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
							
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
				
			}
    		
	}
	
	//Golongan III B
	//Scandium, Yttrium, Lutetium, Lawrencium
	
	public void scandium () {
		data = "Nama unsur : " + Scandium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Scandium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Scandium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Scandium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Scandium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Scandium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Scandium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Scandium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Scandium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Scandium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Scandium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Scandium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Scandium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Scandium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
										
				panjangAkhir = (Scandium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Scandium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Scandium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
								
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";			
			}	
			
    		
	}
	
	public void yttrium () {
		data = "Nama unsur : " + Yttrium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Yttrium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Yttrium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Yttrium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Yttrium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Yttrium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Yttrium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Yttrium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Yttrium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Yttrium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Yttrium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Yttrium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Yttrium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Yttrium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
										
				panjangAkhir = (Yttrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Yttrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Yttrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
								
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
					
				}
    		
	}
	
	public void lutetium () {
		data = "Nama unsur : " + Lutetium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Lutetium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Lutetium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Lutetium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Lutetium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Lutetium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Lutetium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Lutetium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Lutetium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Lutetium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Lutetium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Lutetium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Lutetium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Lutetium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
										
				panjangAkhir = (Lutetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Lutetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Lutetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
								
			data += "Panjang Akhir : " + panjangAkhir + " m \n";
			data += "Luas Akhir : " + luasAkhir + " m2 \n";
			data += "Volume Akhir : " + volumeAkhir + " m3 \n";
			data += "\n";
					
			}
	}
	
	public void lawrencium () {
		data = "Nama unsur : " + Lawrencium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Lawrencium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Lawrencium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Lawrencium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Lawrencium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Lawrencium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Lawrencium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Lawrencium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Lawrencium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Lawrencium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Lawrencium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Lawrencium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Lawrencium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Lawrencium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
		if (pilihan2.equalsIgnoreCase("Y")){
													
			panjangAkhir = (Lawrencium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
			luasAkhir = (2 * Lawrencium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
			volumeAkhir = (3 * Lawrencium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
			data += "Panjang Akhir : " + panjangAkhir + " m \n";
			data += "Luas Akhir : " + luasAkhir + " m2 \n";
			data += "Volume Akhir : " + volumeAkhir + " m3 \n";
			data += "\n";
								
		}
    		
	}
	
	//Golongan IV B
	//Titanium, Zirconium, Hafnium, Rutherfordium
	public void titanium () {
		data = "Nama unsur : " + Titanium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Titanium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Titanium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Titanium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Titanium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Titanium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Titanium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Titanium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Titanium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Titanium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Titanium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Titanium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Titanium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Titanium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Titanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Titanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Titanium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}    		
	}
	
	public void zirconium () {
		data = "Nama unsur : " + Zirconium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Zirconium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Zirconium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Zirconium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Zirconium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Zirconium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Zirconium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Zirconium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Zirconium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Zirconium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Zirconium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Zirconium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Zirconium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Zirconium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Zirconium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Zirconium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Zirconium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
    		
	}
	
	public void hafnium () {
		data = "Nama unsur : " + Hafnium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Hafnium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Hafnium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Hafnium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Hafnium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Hafnium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Hafnium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Hafnium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Hafnium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Hafnium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Hafnium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Hafnium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur *panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Hafnium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Hafnium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Hafnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Hafnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Hafnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";				
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
							
			}
    		
	}
	
	public void rutherfordium () {
		data = "Nama unsur : " + Rutherfordium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Rutherfordium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Rutherfordium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Rutherfordium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Rutherfordium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Rutherfordium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Rutherfordium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Rutherfordium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Rutherfordium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Rutherfordium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Rutherfordium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Rutherfordium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Rutherfordium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Rutherfordium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Rutherfordium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Rutherfordium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Rutherfordium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";				
			}
    		
	}
	
	//Golongan VB
	//Vanadium, Niobium, Tantalum, Dubnium
	
	public void vanadium () {
		data = "Nama unsur : " + Vanadium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Vanadium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Vanadium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Vanadium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Vanadium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Vanadium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Vanadium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Vanadium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Vanadium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Vanadium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Vanadium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Vanadium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Vanadium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Vanadium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Vanadium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Vanadium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Vanadium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
										
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
	}
	
	public void niobium () {
		data = "Nama unsur : " + Niobium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Niobium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Niobium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Niobium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Niobium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Niobium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Niobium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Niobium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Niobium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Niobium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Niobium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Niobium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Niobium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Niobium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
				
				panjangAkhir = (Niobium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Niobium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Niobium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
    		
	}
	

	
	public void tantalum () {
		data = "Nama unsur : " + Tantalum.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Tantalum.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Tantalum.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Tantalum.dapatMassaAtom() + "\n";
    	data += "Warna : " + Tantalum.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Tantalum.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Tantalum.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Tantalum.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Tantalum.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Tantalum.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Tantalum.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Tantalum.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Tantalum.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Tantalum.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Tantalum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Tantalum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Tantalum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
							
			}
	}
	
	public void dubnium () {
		data = "Nama unsur : " + Dubnium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Dubnium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Dubnium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Dubnium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Dubnium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Dubnium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Dubnium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Dubnium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Dubnium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Dubnium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Dubnium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Dubnium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Dubnium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Dubnium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Dubnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Dubnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Dubnium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
	}
	
	//Golongan VIB
	//Kromium, Molybdenum, Tungsten, Seaborgium
	public void kromium () {
		data = "Nama unsur : " + Kromium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Kromium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Kromium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Kromium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Kromium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Kromium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Kromium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Kromium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Kromium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Kromium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Kromium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Kromium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Kromium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Kromium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Kromium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Kromium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Kromium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void molybdenum () {
		data = "Nama unsur : " + Molybdenum.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Molybdenum.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Molybdenum.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Molybdenum.dapatMassaAtom() + "\n";
    	data += "Warna : " + Molybdenum.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Molybdenum.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Molybdenum.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Molybdenum.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Molybdenum.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Molybdenum.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Molybdenum.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Molybdenum.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Molybdenum.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Molybdenum.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Molybdenum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Molybdenum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Molybdenum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
	}
	
	public void tungsten () {
		data = "Nama unsur : " + Tungsten.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Tungsten.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Tungsten.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Tungsten.dapatMassaAtom() + "\n";
    	data += "Warna : " + Tungsten.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Tungsten.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Tungsten.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Tungsten.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Tungsten.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Tungsten.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Tungsten.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Tungsten.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Tungsten.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Tungsten.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Tungsten.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Tungsten.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Tungsten.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
    		
	}
	
	public void seaborgium () {
		data = "Nama unsur : " + Seaborgium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Seaborgium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Seaborgium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Seaborgium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Seaborgium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Seaborgium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Seaborgium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Seaborgium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Seaborgium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Seaborgium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Seaborgium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Seaborgium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Seaborgium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Seaborgium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Seaborgium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Seaborgium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Seaborgium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	//Golongan VII B
	//Mangan, Technetium, Rhenium, Bohrium
	public void mangan () {
		data = "Nama unsur : " + Mangan.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Mangan.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Mangan.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Mangan.dapatMassaAtom() + "\n";
    	data += "Warna : " + Mangan.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Mangan.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Mangan.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Mangan.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Mangan.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Mangan.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Mangan.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Mangan.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi = 0;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Mangan.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Mangan.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Mangan.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Mangan.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Mangan.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void technetium () {
		data = "Nama unsur : " + Technetium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Technetium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Technetium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Technetium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Technetium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Technetium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Technetium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Technetium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Technetium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Technetium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Technetium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Technetium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Technetium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Technetium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Technetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Technetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Technetium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void rhenium () {
		data = "Nama unsur : " + Rhenium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Rhenium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Rhenium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Rhenium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Rhenium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Rhenium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Rhenium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Rhenium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Rhenium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Rhenium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Rhenium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Rhenium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Rhenium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Rhenium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Rhenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Rhenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Rhenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void bohrium () {
		data = "Nama unsur : " + Bohrium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Bohrium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Bohrium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Bohrium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Bohrium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Bohrium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Bohrium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Bohrium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Bohrium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Bohrium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Bohrium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Bohrium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));
				besarKonduksi = Bohrium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Bohrium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Bohrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Bohrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Bohrium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	
	//Golongan VIII B
	//Besi, Cobalt, Nikel, Ruthenium, Rhodium, Palladium, Osmium, Iridium, Platina, Hassium, Meiternerium, Darmstadtium
	public void besi () {
		data = "Nama unsur : " + Besi.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Besi.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Besi.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Besi.dapatMassaAtom() + "\n";
    	data += "Warna : " + Besi.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Besi.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Besi.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Besi.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Besi.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Besi.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Besi.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Besi.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Besi.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Besi.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Besi.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Besi.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Besi.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void cobalt () {
		data = "Nama unsur : " + Cobalt.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Cobalt.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Cobalt.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Cobalt.dapatMassaAtom() + "\n";
    	data += "Warna : " + Cobalt.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Cobalt.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Cobalt.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Cobalt.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Cobalt.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Cobalt.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Cobalt.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Cobalt.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Cobalt.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Cobalt.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Cobalt.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Cobalt.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Cobalt.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
	}
	
	public void nikel () {
		data = "Nama unsur : " + Nikel.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Nikel.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Nikel.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Nikel.dapatMassaAtom() + "\n";
    	data += "Warna : " + Nikel.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Nikel.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Nikel.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Nikel.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Nikel.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Nikel.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Nikel.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Nikel.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Nikel.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Nikel.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Nikel.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Nikel.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Nikel.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
							
			}
    		
	}
	
	public void ruthenium () {
		data = "Nama unsur : " + Ruthenium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Ruthenium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Ruthenium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Ruthenium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Ruthenium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Ruthenium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Ruthenium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Ruthenium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Ruthenium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Ruthenium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Ruthenium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Ruthenium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Ruthenium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Ruthenium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Ruthenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Ruthenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Ruthenium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
				}
	}
	
	public void rhodium () {
		data = "Nama unsur : " + Rhodium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Rhodium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Rhodium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Rhodium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Rhodium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Rhodium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Rhodium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Rhodium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Rhodium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Rhodium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Rhodium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Rhodium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Rhodium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Rhodium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Rhodium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Rhodium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Rhodium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void palladium () {
		data = "Nama unsur : " + Palladium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Palladium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Palladium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Palladium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Palladium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Palladium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Palladium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Palladium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Palladium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Palladium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Palladium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Palladium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Palladium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Palladium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Palladium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Palladium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Palladium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void osmium () {
		data = "Nama unsur : " + Osmium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Osmium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Osmium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Osmium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Osmium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Osmium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Osmium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Osmium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Osmium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Osmium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Osmium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Osmium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Osmium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
    		
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Osmium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
												
				panjangAkhir = (Osmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Osmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Osmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
	}
	
	public void iridium () {
		data = "Nama unsur : " + Iridium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Iridium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Iridium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Iridium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Iridium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Iridium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Iridium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Iridium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Iridium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Iridium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Iridium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Iridium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Iridium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Iridium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Iridium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Iridium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Iridium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void platina () {
		data = "Nama unsur : " + Platina.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Platina.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Platina.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Platina.dapatMassaAtom() + "\n";
    	data += "Warna : " + Platina.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Platina.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Platina.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Platina.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Platina.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Platina.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Platina.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Platina.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Platina.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Platina.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Platina.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Platina.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Platina.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void hassium () {
		data = "Nama unsur : " + Hassium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Hassium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Hassium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Hassium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Hassium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Hassium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Hassium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Hassium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Hassium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Hassium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Hassium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Hassium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Hassium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Hassium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Hassium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Hassium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Hassium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	public void meitnerium () {
		data = "Nama unsur : " + Meitnerium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Meitnerium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Meitnerium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Meitnerium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Meitnerium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Meitnerium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Meitnerium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Meitnerium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Meitnerium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Meitnerium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Meitnerium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Meitnerium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Meitnerium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Meitnerium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Meitnerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Meitnerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Meitnerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
							
			}
    		
	}
	
	public void darmstadtium () {
		data = "Nama unsur : " + Darmstadtium.dapatNama() + "\n";
    	data += "Simbol Unsur : " + Darmstadtium.dapatSimbol() + "\n";
    	data += "Nomor Atom : " + Darmstadtium.dapatNomorAtom() + "\n";
    	data += "Massa Atom : " + Darmstadtium.dapatMassaAtom() + "\n";
    	data += "Warna : " + Darmstadtium.dapatWarna() + "\n";
    	data += "Jenis Unsur : " + Darmstadtium.dapatJenisUnsur() + "\n";
    	data += "Sifat Fisika"  + "\n";
    	data += "============" + "\n";
    	data += "Titik Lebur : " + Darmstadtium.dapatTitikLebur() + " K \n";
    	data += "Titik didih : " + Darmstadtium.dapatTitikDidih() + " K \n";
    	data += "Konduktivitas termal : " + Darmstadtium.dapatKonduktivitasTermal()  + " w/m.K \n";
    	data += "Koefisien Muai Panjang : " + Darmstadtium.dapatKoefisienMuai() + " /K \n";
    	data += "Massa Jenis : " + Darmstadtium.dapatMassaJenis() + " Kg/m3 \n";
    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Darmstadtium.dapatNama() + " ? (Y/T)");
    	double panjangUnsur = 0;
    	double luasPermukaan = 0;
    	double suhuPanas = 0;
    	double suhuDingin = 0;
    	double besarKonduksi;
			if (pilihan.equalsIgnoreCase("Y")){
				
				panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
				luasPermukaan = panjangUnsur * panjangUnsur;
				suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
				suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

				besarKonduksi = Darmstadtium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
				
				data += "Besar Konduksi : " + besarKonduksi + " watt \n";
			}
			
		String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Darmstadtium.dapatNama() + " ? (Y/T)");
		double volume = panjangUnsur * panjangUnsur * panjangUnsur;
		double panjangAkhir;
		double luasAkhir;
		double volumeAkhir;
			if (pilihan2.equalsIgnoreCase("Y")){
													
				panjangAkhir = (Darmstadtium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
				luasAkhir = (2 * Darmstadtium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
				volumeAkhir = (3 * Darmstadtium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
											
				data += "Panjang Akhir : " + panjangAkhir + " m \n";
				data += "Luas Akhir : " + luasAkhir + " m2 \n";
				data += "Volume Akhir : " + volumeAkhir + " m3 \n";
				data += "\n";
								
			}
    		
	}
	
	// Golongan Lantanida
	
		public void lanthanum(){
			data = "Nama unsur : " + Lanthanum.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Lanthanum.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Lanthanum.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Lanthanum.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Lanthanum.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Lanthanum.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Lanthanum.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Lanthanum.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Lanthanum.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Lanthanum.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Lanthanum.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Lanthanum.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = panjangUnsur * panjangUnsur;
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

					besarKonduksi = Lanthanum.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt \n";
				}
				
			String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Lanthanum.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Lanthanum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Lanthanum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Lanthanum.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
									
				}
		}
	        
	    public void cerium(){
			data = "Nama unsur : " + Cerium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Cerium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Cerium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Cerium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Cerium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Cerium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Cerium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Cerium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Cerium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Cerium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Cerium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Cerium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = panjangUnsur * panjangUnsur;
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));

					besarKonduksi = Cerium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt \n";
				}
				
		    String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Cerium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Cerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Cerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Cerium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";				
				}
		}
		
		public void praseodymium(){
			data = "Nama unsur : " + Praseodymium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Praseodymium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Praseodymium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Praseodymium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Praseodymium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Praseodymium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Praseodymium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Praseodymium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Praseodymium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Praseodymium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Praseodymium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Praseodymium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Praseodymium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " + Praseodymium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Praseodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Praseodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Praseodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";				
				}
		}
	        
	    public void neodymium(){
			data = "Nama unsur : " + Neodymium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Neodymium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Neodymium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Neodymium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Neodymium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Neodymium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Neodymium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Neodymium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Neodymium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Neodymium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Neodymium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Neodymium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Neodymium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Neodymium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Neodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Neodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Neodymium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void promethium(){
			data = "Nama unsur : " + Promethium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Promethium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Promethium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Promethium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Promethium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Promethium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Promethium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Promethium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Promethium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Promethium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Promethium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Promethium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Promethium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Promethium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void samarium(){
			data = "Nama unsur : " + Samarium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Samarium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Samarium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Samarium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Samarium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Samarium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Samarium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Samarium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Samarium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Samarium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Samarium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Samarium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Samarium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Samarium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Samarium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Samarium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Samarium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void europium(){
			data = "Nama unsur : " + Europium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Europium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Europium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Europium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Europium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Europium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Europium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Europium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Europium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Europium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Europium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Europium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Europium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Europium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Europium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Europium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Europium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void gadolinium(){
			data = "Nama unsur : " + Gadolinium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Gadolinium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Gadolinium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Gadolinium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Gadolinium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Gadolinium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Gadolinium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Gadolinium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Gadolinium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Gadolinium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Gadolinium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Gadolinium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Gadolinium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Gadolinium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Gadolinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Gadolinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Gadolinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void terbium(){
			data = "Nama unsur : " + Terbium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Terbium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Terbium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Terbium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Terbium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Terbium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Terbium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Terbium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Terbium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Terbium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Terbium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Terbium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Terbium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Terbium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Terbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Terbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Terbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void dysprosium(){
			data = "Nama unsur : " + Dysprosium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Dysprosium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Dysprosium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Dysprosium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Dysprosium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Dysprosium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Dysprosium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Dysprosium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Dysprosium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Dysprosium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Dysprosium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Dysprosium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Dysprosium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Dysprosium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Dysprosium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Dysprosium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Dysprosium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	         
	    public void holmium(){
			data = "Nama unsur : " + Holmium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Holmium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Holmium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Holmium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Holmium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Holmium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Holmium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Holmium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Holmium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Holmium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Holmium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Holmium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Holmium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Holmium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Holmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Holmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Holmium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void erbium(){
			data = "Nama unsur : " + Erbium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Erbium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Erbium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Erbium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Erbium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Erbium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Erbium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Erbium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Erbium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Erbium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Erbium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Promethium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Promethium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Promethium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Promethium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void thulium(){
			data = "Nama unsur : " + Thulium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Thulium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Thulium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Thulium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Thulium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Thulium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Thulium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Thulium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Thulium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Thulium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Thulium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Thulium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Thulium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Thulium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Thulium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Thulium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Thulium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    public void ytterbium(){
			data = "Nama unsur : " + Ytterbium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Ytterbium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Ytterbium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Ytterbium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Ytterbium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Ytterbium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Ytterbium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Ytterbium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Ytterbium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Ytterbium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Ytterbium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Ytterbium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Ytterbium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Ytterbium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Ytterbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Ytterbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Ytterbium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    // Golongan Aktinida dengan sifat fisika yang lengkap
	      
	    public void thorium() {
			data = "Nama unsur : " + Thorium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Thorium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Thorium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Thorium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Thorium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Thorium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Thorium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Thorium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Thorium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Thorium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Thorium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Thorium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Thorium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Thorium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Thorium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Thorium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Thorium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	        public void protactinium() {
			data = "Nama unsur : " + Protactinium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Protactinium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Protactinium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Protactinium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Protactinium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Protactinium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Protactinium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Protactinium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Protactinium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Protactinium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Protactinium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Protactinium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Protactinium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Protactinium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Protactinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Protactinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Protactinium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	        public void uranium() {
			data = "Nama unsur : " + Uranium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Uranium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Uranium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Uranium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Uranium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Uranium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Uranium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Uranium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Uranium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Koefisien Muai Panjang : " + Uranium.dapatKoefisienMuai() + " /K \n";
	    	data += "Massa Jenis : " + Uranium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Uranium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Uranium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	         String pilihan2 = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung besar muai " +Uranium.dapatNama() + " ? (Y/T)");
			double volume = panjangUnsur * panjangUnsur * panjangUnsur;
			double panjangAkhir;
			double luasAkhir;
			double volumeAkhir;
				if (pilihan2.equalsIgnoreCase("Y")){
														
					panjangAkhir = (Uranium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * panjangUnsur) + panjangUnsur;
					luasAkhir = (2 * Uranium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * luasPermukaan) + luasPermukaan;
					volumeAkhir = (3 * Uranium.dapatKoefisienMuai() * (suhuPanas - suhuDingin) * volume) + volume;
												
					data += "Panjang Akhir : " + panjangAkhir + " m \n";
					data += "Luas Akhir : " + luasAkhir + " m2 \n";
					data += "Volume Akhir : " + volumeAkhir + " m3 \n";
					data += "\n";
				}
		}
	        
	    // Golongan Aktinida tanpa memiliki sifat fisika koefisien muai panjang
	        
	    public void actinium(){
			data = "Nama unsur : " + Actinium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Actinium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Actinium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Actinium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Actinium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Actinium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Actinium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Actinium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Actinium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Actinium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Actinium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Actinium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void neptunium(){
			data = "Nama unsur : " + Neptunium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Neptunium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Neptunium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Neptunium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Neptunium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Neptunium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Neptunium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Neptunium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Neptunium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Neptunium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Neptunium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Neptunium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void plutonium(){
			data = "Nama unsur : " + Plutonium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Plutonium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Plutonium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Plutonium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Plutonium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Plutonium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Plutonium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Plutonium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Plutonium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Plutonium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Plutonium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Plutonium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void americium(){
			data = "Nama unsur : " + Americium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Americium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Americium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Americium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Americium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Americium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Americium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Americium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Americium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Americium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Americium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Americium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void curium(){
			data = "Nama unsur : " + Curium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Curium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Curium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Curium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Curium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Curium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Curium.dapatTitikLebur() + " K \n";
	    	data += "Titik didih : " + Curium.dapatTitikDidih() + " K \n";
	    	data += "Konduktivitas termal : " + Curium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Curium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Curium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Curium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    // Golongan Aktinida tanpa memiliki sifat fisika koefisien muai panjang dan titik didih
	        
	    public void berkelium(){
			data = "Nama unsur : " + Berkelium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Berkelium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Berkelium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Berkelium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Berkelium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Berkelium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Berkelium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Berkelium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Berkelium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Berkelium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Berkelium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void californium(){
			data = "Nama unsur : " + Californium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Californium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Californium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Californium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Californium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Californium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Californium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Californium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Californium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Californium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Californium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
		}
	        
	    public void einsteinium(){
			data = "Nama unsur : " + Einsteinium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Einsteinium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Einsteinium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Einsteinium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Einsteinium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Einsteinium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Einsteinium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Einsteinium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	data += "Massa Jenis : " + Einsteinium.dapatMassaJenis() + " Kg/m3 \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Einsteinium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Einsteinium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	        }
	        
	    // Golongan Aktinida tanpa memiliki sifat fisika koefisien muai panjang, titik didih, dan massa jenis
	        
	    public void fermium(){
			data = "Nama unsur : " + Fermium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Fermium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Fermium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Fermium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Fermium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Fermium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Fermium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Fermium.dapatKonduktivitasTermal()  + " w/m.K \n";
	        String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Fermium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Fermium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	        }
	        
	    public void mendelevium(){
			data = "Nama unsur : " + Mendelevium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Mendelevium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Mendelevium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Mendelevium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Mendelevium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Mendelevium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Mendelevium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Mendelevium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Mendelevium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Mendelevium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	        }
	        
	    public void nobelium(){
			data = "Nama unsur : " + Nobelium.dapatNama() + "\n";
	    	data += "Simbol Unsur : " + Nobelium.dapatSimbol() + "\n";
	    	data += "Nomor Atom : " + Nobelium.dapatNomorAtom() + "\n";
	    	data += "Massa Atom : " + Nobelium.dapatMassaAtom() + "\n";
	    	data += "Warna : " + Nobelium.dapatWarna() + "\n";
	    	data += "Jenis Unsur : " + Nobelium.dapatJenisUnsur() + "\n";
	    	data += "Sifat Fisika"  + "\n";
	    	data += "============" + "\n";
	    	data += "Titik Lebur : " + Nobelium.dapatTitikLebur() + " K \n";
	    	data += "Konduktivitas termal : " + Nobelium.dapatKonduktivitasTermal()  + " w/m.K \n";
	    	String pilihan = JOptionPane.showInputDialog(null, "Apakah anda ingin menghitung nilai konduksi dari unsur " + Nobelium.dapatNama() + " ? (Y/T)");
	    	double panjangUnsur = 0;
	    	double luasPermukaan = 0;
	    	double suhuPanas = 0;
	    	double suhuDingin = 0;
	    	double besarKonduksi;
				if (pilihan.equalsIgnoreCase("Y")){
					
					panjangUnsur = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan panjang unsur : (m)"));
					luasPermukaan = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan luas permukaan unsur : (m)"));
					suhuPanas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu panas unsur : (K)"));
					suhuDingin = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan suhu dingin unsur : (K)"));	
					
					besarKonduksi = Nobelium.dapatKonduktivitasTermal() * luasPermukaan * (suhuPanas - suhuDingin) / panjangUnsur;
					
					data += "Besar Konduksi : " + besarKonduksi + " watt";
				}
	    }
	
	public void noData () {
		data = "Unsur yang biterdapat dalam data adalah seluruh  \n";
		data += "unsur kimia dengan nomor atom 1 - 118 \n";
		data += "\n";
        data += "Silahkan masukkan kembali input nomor atom yang semestinya... \n";
	}
	
}