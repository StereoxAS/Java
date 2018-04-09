import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;


public class Dashboard {
public static final String inputFormat = "HH:mm";
SimpleDateFormat inputParser = new SimpleDateFormat(inputFormat);
	
	
Date date = new Date ();
//Date sekarang;
Date sesi1mulai = parseDate("07:30");
Date sesi2mulai = parseDate("10:15");
Date sesi3mulai = parseDate("13:30");
Date sesi4mulai = parseDate("16:15");

Date sesi1akhir = parseDate("10:00");
Date sesi2akhir = parseDate("12:45");
Date sesi3akhir = parseDate("16:00");
Date sesi4akhir = parseDate("18:45");

String sesi;

//Kelas2KS1 k2ks1 = new Kelas2KS1();

	
void Dashboard() {
	int jam = date.getHours();
	int menit = date.getMinutes();
	int hari = date.getDay();
	
	Date sekarang = parseDate(jam + ":" + menit);
	//Date sekarang = parseDate("8:30");
	Date pulang = parseDate("19:00");
	Date mulai = parseDate("06:00");
	
	if(sekarang.after(mulai)) {
		if(sekarang.after(sesi1akhir)) {
			if(sekarang.after(sesi2akhir)) {
				if(sekarang.after(sesi3akhir)) {
					if(sekarang.after(sesi4akhir)) {
						System.out.println("Pulang dong bro udah jam "+jam + ":" + menit+" nih");
						System.out.println(hari);
					}else {this.getSesi4();}
				}else {this.getSesi3();}
			}else {this.getSesi2();}		
		}else {this.getSesi1();}
	}else {System.out.println("Masih pagi bro, baru juga jam "+sekarang);}
	
		
		
	}

private void getSesi1() {
	System.out.println("ini sesi 1");
	this.sesi = "sesi1";
}

private void getSesi2() {
	System.out.println("ini sesi 2");
	this.sesi = "sesi2";
}

private void getSesi3() {
	System.out.println("ini sesi 3");
	this.sesi = "sesi3";
}

private void getSesi4() {
	System.out.println("ini sesi 4");
	this.sesi = "sesi4";
}

private Date parseDate(String sekarang) {
	try {
        return inputParser.parse(sekarang);
    } catch (java.text.ParseException e) {
        return new Date(0);
    }
}


}
