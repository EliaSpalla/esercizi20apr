public class FaseLancio implements Runnable {
	String operazione;
	int durataSecondi;

	public FaseLancio (String operazione,int durata){
		this.operazione=operazione;
		this.durataSecondi=durata;
	}

	public void run(){
		System.out.println("["+operazione+"] inizio");
		try{
			Thread.sleep(durataSecondi*1000);
		}catch(InterruptedException e){}
		System.out.println("["+operazione+"] completata");
	}
}
