class Bird {
	public void sing() {
		System.out.println("keeee keeee");
	}
}

class Robin extends Bird {
	public void sing() {
		System.out.println("twiddle");
	}

}
/*
 * class pelican extends Bird{ public void sing(String song) {
 * System.out.println("rrrrrrrrrr"); } }
 */

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robin b = new Robin();
		b.sing();
		Bird d = new Bird();
		d.sing();

	}

}
