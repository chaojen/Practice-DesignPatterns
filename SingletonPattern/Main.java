public class Main {

	public static void main(String[] args) {

		System.out.println("start");

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			
			System.out.println("obj1 和 obj2 是同一物件個體");
		} else {

			System.out.println("obj1 和 obj2 非同一物件個體");
		}

		System.out.println("end");
	}
}