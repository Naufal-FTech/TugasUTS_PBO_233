package tugas.uts.pbo;



public class MainClass {
    public static void main(String[] args) {
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD(3);
        Komputer komputer1 = new Komputer(intel1);  //parameter constructor berisi objek "intel1" yang telah diset bernilai 2
        
        komputer1.cetakInfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo();
    }
    
}
