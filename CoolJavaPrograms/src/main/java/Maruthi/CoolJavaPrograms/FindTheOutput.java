package Maruthi.CoolJavaPrograms;

public class FindTheOutput {
	
	public void outputProgram1() {
		int[] myArray = new int[]{ 0,1,2,3,4,5,6,7,8,9,10 };
		
		int n = 6;
		n = myArray[myArray[n]/2];
		System.out.println(n/2);
	}
	public static void main(String[] args) {
		FindTheOutput fo = new FindTheOutput();
		fo.outputProgram1();
	}

}
