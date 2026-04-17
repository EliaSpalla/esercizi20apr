public class CentroControllo {
    public static void main(String[] args) throws InterruptedException {
        String[] operazioni = {"alpha", "beta"};
        
        for (String op : operazioni) {
	    System.out.println("**Operazione "+op+"**");
            FaseLancio[] fasi = {
                new FaseLancio("Controllo sistemi", 3),
                new FaseLancio("Rifornimento carburante", 4),
                new FaseLancio("Accensione motori", 2)
            };

            for (FaseLancio f : fasi) {
		Thread t=new Thread(f);
                t.start();
                t.join();
            }
            
            System.out.println("**Decollo operazione " + op + " avvenuto**");
        }
    }
}
