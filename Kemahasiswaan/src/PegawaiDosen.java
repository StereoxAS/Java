public class PegawaiDosen extends Pegawai
{
	private String idDosen;
	//private MataKuliah mataKuliah = new MataKuliah();
	private Pegawai dosen[] = new Pegawai[20];
		
	public PegawaiDosen() 
	{
		//this.setJabatan("Dosen");
		
		this.dosen[0] = new Pegawai("D001","Takdir S.ST.,M.T.","1998217391260");
		this.dosen[1] = new Pegawai("D002","Sukim S.ST.,M.Si.","1998217391261");
		this.dosen[2] = new Pegawai("D003","Siti Mariyah SST.,M.T.","1998217391262");
		this.dosen[3] = new Pegawai("D004","Dr. Azka Ubaidillah","1998217391263");
		this.dosen[4] = new Pegawai("D005","Dr. I Made Arcana S.Si.,M.Sc","1998217391264");
		this.dosen[5] = new Pegawai("D006","Yunarso Anang, Ph.D","1998217391265");
		this.dosen[6] = new Pegawai("D007","Metty Nurul Romadhona S.ST.,M.Si","1998217391266");
		this.dosen[7] = new Pegawai("D008","Rani Nooraeni S.St., M.Stat","1998217391267");
		this.dosen[8] = new Pegawai("D009","Drs. Sutarno, M.M.","1998217391268");
		this.dosen[9] = new Pegawai("D010","Dr. Timbang Sirait, S.Stat, M.Si.","1998217391269");
		this.dosen[10]= new Pegawai("D011","Robert Kurniawan S.ST.,M.Si.","1998217391268");
	}
	
	public Pegawai getDosen(int index)
	{
		//PegawaiDosen pegawaiDosen=(PegawaiDosen) this.dosen[index];
		return this.dosen[index];
	}

	public void setDosen(PegawaiDosen dosen, int index)
	{
		this.dosen[index] = dosen;
	}
	
	public String getIdDosen()
	{
		return idDosen;
	}

	public void setIdDosen(String idDosen)
	{
		this.idDosen = idDosen;
	}

	public PegawaiDosen(String idDosen, String namaPegawai, String nip) 
	{
		this.setIdDosen(idDosen);
		this.setNamaPegawai(namaPegawai);
		this.setNip(nip);
	}

	public void getAllPegawai() 
	{
		System.out.println("Daftar Dosen (" + dosen.length + "):");
		for(int index = 0; index<dosen.length;index++) {
			if(dosen[index] != null) 
			{
				System.out.println("ID Dosen    = " + dosen[index].getIdDosen());
				System.out.println("Nama Dosen  = " + dosen[index].getNamaPegawai());
				System.out.println("NIP         = " + dosen[index].getNip());
				//System.out.println("Posisi      = " + dosen[index].getPosisi());
			}
			System.out.println();
		}
		
	}
}