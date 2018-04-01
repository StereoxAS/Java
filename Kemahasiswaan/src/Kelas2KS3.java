
public class Kelas2KS3 extends Kelas{
	private Mahasiswa mahasiswa[] = new Mahasiswa[35];
	
	public Kelas2KS3() {
		this.setNamaKelas("2KS-3");
		this.setJurusan("KS");
		this.setJumlahOrang(35);
		
		mahasiswa[0] = new Mahasiswa("Agung Yuniarta Sosiawan", "16.8972", enumJenisKelamin.LAKILAKI);
		mahasiswa[1] = new Mahasiswa("Ahmad Irfansyah", "16.8977", enumJenisKelamin.LAKILAKI);
		mahasiswa[2] = new Mahasiswa("Aldo Leofiro Irfiansyah", "16.8988", enumJenisKelamin.LAKILAKI);
		mahasiswa[3] = new Mahasiswa("Ari Rismansyah", "16.9023", enumJenisKelamin.LAKILAKI);
		mahasiswa[4] = new Mahasiswa("Cendikia Rahman Maulana", "16.9050", enumJenisKelamin.LAKILAKI);
		mahasiswa[5] = new Mahasiswa("Dayanti Kharisma Nur Amalia", "16.9066", enumJenisKelamin.PEREMPUAN);
		mahasiswa[6] = new Mahasiswa("Dynta Masyita Adiasa", "16.9098", enumJenisKelamin.PEREMPUAN);
		mahasiswa[7] = new Mahasiswa("Fachri Izzudin Lazuardi", "16.9109", enumJenisKelamin.LAKILAKI);
		mahasiswa[8] = new Mahasiswa("Farhan Abdurrahman Musa", "16.9123", enumJenisKelamin.LAKILAKI);
		mahasiswa[9] = new Mahasiswa("Fella Ulandari", "16.9134", enumJenisKelamin.PEREMPUAN);
		
		mahasiswa[10] = new Mahasiswa("Fitrianto Nurma'Arif", "16.9141", enumJenisKelamin.LAKILAKI);
		mahasiswa[11] = new Mahasiswa("Handigo", "16.9161", enumJenisKelamin.LAKILAKI);
		mahasiswa[12] = new Mahasiswa("I Nyoman Setiawan", "16.9186", enumJenisKelamin.LAKILAKI);
		mahasiswa[13] = new Mahasiswa("Ilmi Aulia Akbar", "16.9193", enumJenisKelamin.PEREMPUAN);
		mahasiswa[14] = new Mahasiswa("Ivan Robi Pratama", "16.9205", enumJenisKelamin.LAKILAKI);
		mahasiswa[15] = new Mahasiswa("Izza Indi Cantika", "16.9206", enumJenisKelamin.PEREMPUAN);
		mahasiswa[16] = new Mahasiswa("Luqman Ismail Abdurrahim", "16.9241", enumJenisKelamin.PEREMPUAN);
		mahasiswa[17] = new Mahasiswa("M. Rizqi Bahar", "16.9249", enumJenisKelamin.LAKILAKI);
		mahasiswa[18] = new Mahasiswa("Meidian Rinaldi", "16.9268", enumJenisKelamin.LAKILAKI);
		mahasiswa[19] = new Mahasiswa("Muarrikh Yazka Ginang P.", "16.9281", enumJenisKelamin.LAKILAKI);
		                                  
		mahasiswa[20] = new Mahasiswa("Muhammad Alifunnas", "16.9289", enumJenisKelamin.LAKILAKI);
		mahasiswa[21] = new Mahasiswa("Muhammad Hadid", "16.9294", enumJenisKelamin.LAKILAKI);
		mahasiswa[22] = new Mahasiswa("Muhammad Haidar Fikri Januar", "16.9297", enumJenisKelamin.LAKILAKI);
		mahasiswa[23] = new Mahasiswa("Muhammad Wildan Bayu P.", "16.9308", enumJenisKelamin.PEREMPUAN);
		mahasiswa[24] = new Mahasiswa("Nashir Wahyudi", "16.9325", enumJenisKelamin.LAKILAKI);
		mahasiswa[25] = new Mahasiswa("Novia Permatasari", "16.9335", enumJenisKelamin.PEREMPUAN);
		mahasiswa[26] = new Mahasiswa("Ponimin", "16.9351", enumJenisKelamin.PEREMPUAN);
		mahasiswa[27] = new Mahasiswa("Rama Gusti Anuga", "16.9373", enumJenisKelamin.LAKILAKI);
		mahasiswa[28] = new Mahasiswa("Ririn Yustika Putri", "16.9386", enumJenisKelamin.PEREMPUAN);
		mahasiswa[29] = new Mahasiswa("Rizki Ananda Fauziah", "16.9396", enumJenisKelamin.PEREMPUAN);
				                          
		mahasiswa[30] = new Mahasiswa("Septri Sando Lumban Gaol", "16.9416", enumJenisKelamin.LAKILAKI);
		mahasiswa[31] = new Mahasiswa("Stenly Frans", "16.9435", enumJenisKelamin.LAKILAKI);
		mahasiswa[32] = new Mahasiswa("Subekti", "16.9436", enumJenisKelamin.LAKILAKI);
		mahasiswa[33] = new Mahasiswa("Tri Rahmat Siyamto", "16.9451", enumJenisKelamin.LAKILAKI);
		mahasiswa[34] = new Mahasiswa("Yulia Mahmudah", "16.9475", enumJenisKelamin.PEREMPUAN);
		
		
	}
	
	
	public void getAllMahasiswa()
	{
		System.out.println("\nDaftar mahasiswa " + this.toString() + "\n");
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("| NO |\tNama\t\t\t\t|   NIM\t\t| Jenis Kelamin |");
		System.out.println("-------------------------------------------------------------------------");
		
		for (int index = 0; index < mahasiswa.length; index++)
		{	
			int a=index+1;
			
			if(index<9) {
				System.out.print("|  " + a + " | ");
			} else {
				System.out.print("| " + a + " | ");
			}
			
			if(mahasiswa[index] != null)
			{
				if(mahasiswa[index].getNamaMahasiswa().length()>=25) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=17) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=9) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t\t");
				}else if (mahasiswa[index].getNamaMahasiswa().length()>=4) {
					System.out.print(mahasiswa[index].getNamaMahasiswa()+ "\t\t\t\t");
				}
				
				System.out.println("|  "+ mahasiswa[index].getNim() + "\t| "
								+  mahasiswa[index].getJenisKelamin()+"\t|" );
				
			}
			else
			{
				System.out.println("\nEnd of line.");
			}
			
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public Mahasiswa getMahasiswa(int index)
	{
		if(index>0 && index<=mahasiswa.length)
		{
			return mahasiswa[index-1];
		}
		else
		{
			return mahasiswa[0];
		}
		
	}

	public void setMahasiswa(Mahasiswa mahasiswa, int index)
	{
		this.mahasiswa[index] = mahasiswa;
	}

}