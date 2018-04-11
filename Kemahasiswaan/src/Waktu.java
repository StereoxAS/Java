import java.text.SimpleDateFormat;
import java.util.Date;

public class Waktu {
	//semua yang berhubungan dengan waktu dapat gunain method dari class ini
	
	public static final String inputFormat = "HH:mm";
	static SimpleDateFormat inputParser = new SimpleDateFormat(inputFormat);
	
	private String sesi;
	private Integer hari;
	private String hariStr;
	private Date sekarang;
	private Integer jam;
	private Integer menit;

	private Date date = new Date ();
	
	//bisa dijadiin konstanta
	Date sesi1mulai = parseDate("07:30");
	Date sesi2mulai = parseDate("10:15");
	Date sesi3mulai = parseDate("13:30");
	Date sesi4mulai = parseDate("16:15");

	Date sesi1akhir = parseDate("10:00");
	Date sesi2akhir = parseDate("12:45");
	Date sesi3akhir = parseDate("16:00");
	Date sesi4akhir = parseDate("18:45");
	
	Date pulang = parseDate("19:00");
	Date mulai = parseDate("06:00");
	
	
	public Waktu() {
		super();
		
	}
	

	public Waktu(String sesi, String hariStr, Date sekarang, Integer jam, Integer menit) {
		super();
		this.sesi = sesi;
		this.hariStr = hariStr;
		this.sekarang = sekarang;
		this.jam = jam;
		this.menit = menit;
	}

/*
	public SimpleDateFormat getInputParser() {
		return inputParser;
	}

	public void setInputParser(SimpleDateFormat inputParser) {
		this.inputParser = inputParser;
	}
*/
	public String getSesi() {
		if(this.getSekarang().after(mulai)) {
			if(this.getSekarang().after(sesi1akhir)) {
				if(this.getSekarang().after(sesi2akhir)) {
					if(this.getSekarang().after(sesi3akhir)) {
						if(this.getSekarang().after(sesi4akhir)) {
							System.out.println("Pulang dong bro udah jam "+this.getJam()+ ":" + this.getMenit() +" nih");
						}else {return this.sesi = "Sesi4";}
					}else {return sesi = "Sesi3";}
				}else {return sesi = "Sesi2";}		
			}else {return sesi = "Sesi1";}
		}else {
			System.out.println("Masih pagi bro, baru juga jam "+this.getJam()+":"+this.getMenit());
			}
		return "";
	}

/*	public void setSesi(String sesi) {
		this.sesi = sesi;
	}*/

	public Integer getHari() {
		hari = date.getDay();
		return hari;
	}

/*	public void setHari(Integer hari) {
		this.hari = hari;
	}*/
	
	public Integer getJam() {
		
		int jam = date.getHours();
		return jam;
	}

/*	public void setJam(Integer jam) {
		this.jam = jam;
	}*/

	public Integer getMenit() {
		int menit = date.getMinutes();
		return menit;
	}

/*	public void setMenit(Integer menit) {
		this.menit = menit;
	}*/

	public String getHariStr() {
		if(this.getHari() == 0) {
			hariStr = "Minggu";
		}else if(this.getHari() == 1) {
			hariStr = "Senin";
		}else if(this.getHari() == 2) {
			hariStr = "Selasa";
		}else if(this.getHari() == 3) {
			hariStr = "Rabu";
		}else if(this.getHari() == 4) {
			hariStr = "Kamis";
		}else if(this.getHari() == 5) {
			hariStr = "Jumat";
		}else if(this.getHari() == 6) {
			hariStr = "Sabtu";
		}else {
			System.out.println("ERROR: Tidak ada hari yang dimaksud");
		}
		return hariStr;
	}

/*	public void setHariStr(String hariStr) {
		this.hariStr = hariStr;
	}*/

	public Date getSekarang() {
		//yang digunakan baru jam dan menitnya saja ya.
		Date sekarang = parseDate(this.getJam() + ":" + this.getMenit());
		return sekarang;
	}

/*	public void setSekarang(Date sekarang) {
		this.sekarang = sekarang;
	}*/

	public static String getInputformat() {
		return inputFormat;
	}
	
	public static Date parseDate(String sekarang) {
		//Gunakan untuk mendefinikan jam bertipe Date, format HH:mm
		try {
	        return inputParser.parse(sekarang);
	    } catch (java.text.ParseException e) {
	        return new Date(0);
	    }
	}
	
	

}
