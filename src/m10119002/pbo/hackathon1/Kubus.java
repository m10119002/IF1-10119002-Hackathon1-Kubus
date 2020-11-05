package m10119002.pbo.hackathon1;

public class Kubus {
    public int sisi;
    public int massa_benda;
    
    public String getMassaJenis() {
        int volume = sisi*sisi*sisi;
        double massa_jenis = (double)massa_benda / (double)volume;
        return Double.toString(massa_jenis);
    }
}
