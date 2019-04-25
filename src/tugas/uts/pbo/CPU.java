/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.uts.pbo;

/**
 *
 * @author Phyton NF
 */
public class CPU {  //punya turunan class, yaitu Intel dan AMD
    protected String nama;
    protected int kecepatan;
    
    public CPU(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;        
    }
    
    public String getCPUData(){
        return(this.nama+""+this.kecepatan);
    }    
}
