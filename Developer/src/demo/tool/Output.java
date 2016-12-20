package demo.tool;

public class Output {

	public static void main(String[] args) {
		Output o = new Output();
		o.go();
	}
	
	void go() {
		int y = 7;
		for(int x = 1; x < 8; x++) { // 15 6
			y++;
			if (x > 4) {
				System.out.print(++y + " "); // 13 15
			}
			if (y > 14) {
				System.out.println(" x = " + x); // 6
				break;
			}
		}
	}

}