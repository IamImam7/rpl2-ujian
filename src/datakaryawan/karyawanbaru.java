package datakaryawan;

public class karyawanbaru{
	private final String nama;
	private final String idKaryawan;
	private final String kehadiran;
        private String alasan;
	
       
	public karyawanbaru(String nama, String idKaryawan, String kehadiran, String alasan) {
		this.nama = nama;
		this.idKaryawan = idKaryawan;
		this.kehadiran = kehadiran;
                this.alasan = alasan;
	}
        public karyawanbaru(String nama, String idKaryawan, String kehadiran) {
		this.nama = nama;
		this.idKaryawan = idKaryawan;
		this.kehadiran = kehadiran;
                this.alasan = "";
       
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getID(){
		return idKaryawan;
	}
	
	public String getKehadiran(){
		return kehadiran;
	}
	
        public String getAlasan(){
                return alasan;
        }
	
        @Override
	public String toString(){
		 String result = "Nama: " + nama + "\nId karyawan: " + idKaryawan + "\nKehadiran: " + kehadiran ;
                 if (kehadiran.equalsIgnoreCase("Tidak")) {
                result += "\nAlasan: " + alasan;
        }
                 result += "\n=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-="; 
                 return result;
	}
}