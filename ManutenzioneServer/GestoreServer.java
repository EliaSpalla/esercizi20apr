public class GestoreServer {

	public static void main(String[] args) throws InterruptedException{
		char[] server={'A','B','C'};

		for(char s:server){

			System.out.println("**server "+s+"**");
			OperazioneServer[] operazioni={
				new OperazioneServer("backup dati",4),
				new OperazioneServer("scansione antivirus",2),
				new OperazioneServer("ottimizzazone database",1),
			};

			for(OperazioneServer op:operazioni){
				Thread t=new Thread(op);
				t.start();
				t.join();
			}
		}
	}
}
