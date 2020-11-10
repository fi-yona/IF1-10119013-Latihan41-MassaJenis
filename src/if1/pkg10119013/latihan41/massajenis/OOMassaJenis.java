/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan41.massajenis;

/**
 *
 * @author Fiona Avila
 */


public class OOMassaJenis {
    
    private int sisi = 5;
    private int massa = 250;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        parSisi = getSisi();
        int volume = parSisi * parSisi * parSisi;
        return volume;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        parMassa = getMassa();
        int massaJenis = parMassa/volume;
        return massaJenis;
    }
    
    public static void main(String[] args) {
        
        OOMassaJenis oo = new OOMassaJenis();
        int sisi = oo.getSisi();
        int massa = oo.getMassa();
        int parSisi = 0;
        int volume = oo.hitungVolume(parSisi);
        int parMassa = 0;
        int massaJenis = oo.hitungMassaJenis(parMassa,volume);
        
        System.out.println("=====MASSA JENIS KUBUS=====");
        System.out.println("Sisi\t: " + sisi);
        System.out.println("Massa\t: " + massa);
        System.out.println();
        System.out.println("=====HASIL PERHITUNGAN=====");
        System.out.println("Volume\t\t: " + volume);
        System.out.println("Massa Jenis\t: " + massaJenis);
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
