public class OperazioneServer implements Runnable{
	String nomeTask;
	int tempoEsecuzione;

	public OperazioneServer(String nomeTask,int tempoEsecuzione){
		this.nomeTask=nomeTask;
		this.tempoEsecuzione=tempoEsecuzione;
	}

	public void run(){
		System.out.println("["+nomeTask+"] inizio operazione");
		try{
			Thread.sleep(tempoEsecuzione*1000);
		}catch(InterruptedException e){}
		System.out.println("["+nomeTask+"] terminata con successo");
	}
}
