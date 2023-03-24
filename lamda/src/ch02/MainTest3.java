package ch02;

public class MainTest3 {

	public static void main(String[] args) {

		ILambda lambda = (a, b) -> {
			return a * b;
		};
		System.out.println(lambda.cal(1234, 1234));

		System.out.println("----------------------");

		new Thread(() -> {
			for (int i = 1; i < 10; i++) {
				for (int k = 1; k < 10; k++) {
					System.out.println(i + " x " + k + " = " + i * k);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
