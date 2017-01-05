package demo.tool;

class Rowboat extends Boat {
	public void rowTheBoat() {
		System.out.print("Давай, Наташа!");
	}
}

class Boat {
	//public void bark(){};
	private int length;
	public void setLength (int len) {
		length = len;
	}
	public int getLength() {
		return length;
	}
	public void move() {
		System.out.print("Дрейф");
		System.out.print(" ");
	}
}

class TestBoats {
	public static void main(String[]args) {
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b3 = new Rowboat();
		//Boat b4 = new Botik();
		//b4.bark();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}
}

/*class Botik extends Boat {
	public void bark() {
		System.out.println("Давай Финка!");
	}
}
*/
class Sailboat extends Boat {
	public void move() {
		System.out.print("Поднять паруса!");
	}
}