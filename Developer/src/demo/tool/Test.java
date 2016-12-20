package demo.tool;

class GS{
	private GS[] myDog = new GS[10];
	//
	
	public void setMyDog(int y) {
		myDog[7] = new GS();
		myDog[7] = y;
	}
	public int getMyDog(){
		return myDog[7];
	}
	//
	private int[] tester = new int[5];
	public void setTester(int x) {
		tester[3] = x;
	}
	public int getTester() {
		return tester[3];
	}
	//
}

public class Test {

	public static void main(String[] args) {
		GS one = new GS();
		GS two = new GS();
		two.setMyDog(66);
		one.setTester(28);
		System.out.println(two.getMyDog());
		System.out.println(one.getTester());
	}

}
