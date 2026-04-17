public class BraccioMeccanico implements Runnable{
	String nomeFase;
	int durata;

	public BraccioMeccanico(String nomeFase, int durata){
		this.nomeFase=nomeFase;
		this.durata=durata;
	}

	public void run(){
		System.out.println("["+nomeFase+"] avviata");
		try{
			Thread.sleep(durata*1000);
		}catch(InterruptedException e){}
		System.out.println("["+nomeFase+"] completata");
	}
}
