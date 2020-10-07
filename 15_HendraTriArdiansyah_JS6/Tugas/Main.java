package Tugas;
public class Main {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setNama("Rio");
        dsn.setSKS(11);
        
        Pegawai pgw = new Pegawai();
        pgw.setNama("Rumi");
        
        DaftarGaji daf_gaji = new DaftarGaji(2);
        daf_gaji.addPegawai(dsn);
        daf_gaji.addPegawai(pgw);
        daf_gaji.printSemuaGaji();
    }
}
