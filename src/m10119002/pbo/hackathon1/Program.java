package m10119002.pbo.hackathon1;

public class Program {
    private static Kubus kubus;
    
    public static void main(String[] args) {
        kubus = new Kubus();
        kubus.sisi = 5;
        kubus.massa_benda = 250;
        System.out.println("Massa Jenis Kubus : ".
                concat(kubus.getMassaJenis()).concat(" gr/cm^3"));
   }
}
