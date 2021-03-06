package tugas.uts.pbo;

/**
 *
 * @author Phyton NF
 */
public class Komputer {
    private CPU cpu;    //CPU = kelas dan cpu = variabel
        
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    
    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU: "+this.cpu.getCPUData()+" GHz dipasang."); //isi/nilai pada this.cpu.getCPUData() yg sblumnya berisi nilai pd method Intel tergantikan dg nilai baru pd method AMD
    }
    
    public void mencabut(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU: "+this.cpu.getCPUData()+" GHz dicabut.");
    }
    
    public void cetakInfo(){
        System.out.println("Spesifikasi: CPU: "+this.cpu.getCPUData()+" GHz");
    }    
}
