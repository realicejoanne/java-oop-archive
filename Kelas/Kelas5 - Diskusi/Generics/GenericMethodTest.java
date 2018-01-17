public class GenericMethodTest {
	public static <Z> void printArray(Z[] inputArray){
		for(Z element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	public static Integer[] intArray = { 1, 2, 3, 4, 5 };
	public static Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	public static Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	
	/*
	public static void printArray(Integer[] inputArray){
		for (int element : inputArray){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public static void printArray(Character[] inputArray){
		for (char element : inputArray){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public static void printArray(Double[] inputArray){
		for (double element : inputArray){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}*/

	public static void main(String args[]){
		
		System.out.println("Array integerArray contains:");
		printArray(intArray);

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);

		System.out.println("\nArray characterArray contains:");
		printArray(charArray);
	}
}