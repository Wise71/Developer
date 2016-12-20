package demo.tool;

class MixFor5{
	public static void main(String[]args){
		int x = 0; // 6
		int y = 30; // 22
		for (int outer = 0; outer < 3; outer++){ // 1
			for (int inner = 4; inner > 1; inner--){
				x--;
				//y = y - 2;
				if (x == 6){
					break;
				}
				x = x + 3;	
			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}
}