
public class Assignment11 {

	public static void main(String[] args) {
		
	int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//setup my outer loop
		for (int i = 0; i < array1.length; i++){
			
			//start inner loop
			for (int j = 1; j <= 10; j++){
				int result = array1[i] * j;
				System.out.println("Result: " + result);
			}
		}
	}

}
