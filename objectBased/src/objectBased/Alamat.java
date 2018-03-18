package objectBased;

public class Alamat 
{
	String provinsi;
	String kabKota;
	String kec;
	String kel;
	int rt;
	int rw;
	String namaJalan;
	String nomor;
	
	public String getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}

	public String getKabKota() {
		return kabKota;
	}

	public void setKabKota(String kabKota) {
		this.kabKota = kabKota;
	}

	public String getKec() {
		return kec;
	}

	public void setKec(String kec) {
		this.kec = kec;
	}

	public String getKel() {
		return kel;
	}

	public void setKel(String kel) {
		this.kel = kel;
	}

	public int getRt() {
		return rt;
	}

	public void setRt(int rt) {
		this.rt = rt;
	}

	public int getRw() {
		return rw;
	}

	public void setRw(int rw) {
		this.rw = rw;
	}

	public String getNamaJalan() {
		return namaJalan;
	}

	public void setNamaJalan(String namaJalan) {
		this.namaJalan = namaJalan;
	}

	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	public String getAlamatLengkap()
	{
		return namaJalan+" "+nomor+" RT"+rt+"/RW"+rw+", "+kel+", "+kec+", "+kabKota+", "+provinsi;
	}
}
