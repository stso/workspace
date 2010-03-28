/**
 * 
 */
package scjp.chapter9;

/**
 * @author stso
 *
 */
public class BlockSynchronizationExercise {

	private static class ExerciseRunnable implements Runnable {

		private StringBuffer buf = null;
		private String increment = null;
		
		ExerciseRunnable() { }
		
		ExerciseRunnable(StringBuffer newBuf, String newInc) {
			buf = newBuf;
			increment = newInc;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				synchronized (buf) {
					System.out.println(Thread.currentThread().getName()
							+ " appending " + increment + " to " + buf);
					buf.append(increment);
				}
				//Thread.yield();
			}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer(300);
		Thread t1 = new Thread(new ExerciseRunnable(buf, "A"));
		Thread t2 = new Thread(new ExerciseRunnable(buf, "B"));
		Thread t3 = new Thread(new ExerciseRunnable(buf, "C"));
		t1.start();
		t2.start();
		t3.start();
		System.out.println(Thread.currentThread().getName() + " Done!");
	}

}
