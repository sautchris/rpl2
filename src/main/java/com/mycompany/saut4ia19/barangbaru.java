package com.mycompany.saut4ia19;
public class barangbaru {
    private final String namabrg;
    private final int jmlhbrg;
    private final int hrgbrg;
    
    public barangbaru(String namabrg, int jmlhbrg, int hrgbrg){
        this.namabrg = namabrg;
        this.jmlhbrg = jmlhbrg;
        this.hrgbrg = hrgbrg;
    }
    
    public String getNama(){
        return namabrg;
    }
    
    public int getJmlh(){
        return jmlhbrg;
    }
    
    public int getHrg(){
        return hrgbrg;
    }
    
    @Override
    public String toString(){
        return "Nama: "+namabrg+", Jumlah: "+jmlhbrg+", Harga: "+hrgbrg;
    }
}

