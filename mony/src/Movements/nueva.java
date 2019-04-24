package Movements;

public class nueva implements Runnable {

	int c=0;
	Thread hilo = new Thread(this);
	public nueva(){
		hilo.start();
}

	public void run() {
		while(c<=10) {
			c++;
			System.out.println("c = "+c);
			try {
				hilo.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
