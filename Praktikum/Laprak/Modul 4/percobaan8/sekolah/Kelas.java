package sekolah;

public class Kelas { 
	private int kodekelas; 
	private String namakelas;
	private Mahasiswa mahasiswa;

	public Kelas(int kode, String nama) {
		this.kodekelas=kode;
		this.namakelas=nama;
	}
	public void setMhs(Mahasiswa mhs){ 
		this.mahasiswa=mhs;
	}
	public void cetakMhs(){
		System.out.println("Patricia Joanne 140810160065");
		System.out.println("Nama : " + this.mahasiswa.getNama());
		System.out.println("Npm : " + this.mahasiswa.getNpm());
	}
}