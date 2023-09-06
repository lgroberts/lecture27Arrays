package lecture27Arrays;

import java.util.Arrays;

public class ArraySum {

	static int [] lottoNums = {34, 36, 8, 2, 99};
	static double[] exampleArray = {1,5,6,5,4,1};
    static double maximum = exampleArray[0];
    static int index = 0;
	
	public static Integer sum(int[] lottoNums) {
		int sum = 0;
		for (int i : lottoNums) {
			sum += i;
		}
		
		return sum;
	}
	
	public static int[] toPower(int size, int power) {
		int [] result = new int[size];
		int j = 0;
		for (int i = 0; i < size; i++) {
			result[j] = (int) Math.pow(i, power);
			j++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    for (int i = 1; i < exampleArray.length; i++){
	         if (exampleArray[ i ] > maximum) {
	              maximum = exampleArray[ i ];
	              index = i;
	         }
	    }
	    
	    System.out.println(sum(lottoNums));
	    System.out.println(index);
	    System.out.println(Arrays.toString(toPower(4, 2)));
	    
	    
	}

}
