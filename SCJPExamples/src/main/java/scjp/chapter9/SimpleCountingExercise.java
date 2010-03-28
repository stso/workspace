/**
 * 
 */
package scjp.chapter9;

/**
 * @author stso
 *
 */
public class SimpleCountingExercise {

	static class CountingRunnable implements Runnable {
		private String name;
		
		CountingRunnable() {
			name = null;
		}
		
		CountingRunnable(String newName) {
			this.name = newName;
		}

		@Override
		public void run() {
			for (int i = 1; i <= 100; i++) {
				if (i % 10 == 0) {
					System.out.format("%s:  I just hit a 10th number\n", name);
				}
				try {
					Thread.sleep(1000); // Sleep every one second
				} catch (InterruptedException e) {
					System.out.format("%s:  Oops, I was interrupted\n", name);
				}
			}
			System.out.format("%s:  I'm done!\n", name);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		System.out.println("SimpleCountingExercise just started!");
		Thread t1 = new Thread(new CountingRunnable("Chrissy"));
		Thread t2 = new Thread(new CountingRunnable("Cheryl"));
		t1.start();
		t2.start();
	}

}
