public class Fabbrica{
	public static void main(String[] args)throws InterruptedException{
		int[] prodotto={1,2,3,4,5};

		for(int p:prodotto){
			System.out.println("**Prodotto "+p+"**");
			BraccioMeccanico[] task={
				new BraccioMeccanico("saldatura",3),
				new BraccioMeccanico("verniciatura",2),
				new BraccioMeccanico("controllo",1)
			};
			for(BraccioMeccanico b:task){
				Thread t=new Thread(b);
				t.start();
				t.join();
			}
		}
	}
}
