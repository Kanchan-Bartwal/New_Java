package unit1;

/*
 - Normally, an array is a collection of similar type of elements which has contiguous memory location
 - Java array is an object which contains elements of a similar data type
 - We can store only a fixed set of elements in a Java array
 - Size limit issue:
     - We can store only the fixed size of element in the array
     - It doesn't grows its size at runtime
     - To solve this problem, collection framework is used in Java which grows automatically 
     
 - There are two types of array
   -Single Dimensional array
   -Multidimensional array
   
 - Declare an array in java
   - DataType arrayRefVar[];
   OR
   - DataType[] arrayRefVar;
   OR
   - DataType []arrayRefVar;
   
 - Instantiation of an Array in Java
   - arrayRefVar=new Datatype[size];
          
 */
public class P6_Task01_ArraysInJava {
	 
	public static void main(String [] args) {
		
		//Declaration
		int array1[];
		
		int[] array2;
		int []array3;
		
		
		//can not do it as we have not provide it any memory/space yet!
		//array1[0] = 1;
		
		//Initialization, during initialization we have to provide the size of the 
		//array
		array1 = new int[6]; //{1,2,3,4};
		
		//assigning values to the java array
		for (int i=0; i < array1.length; i++) // length is the property of array
			array1[i] = i;
		
		int array4[] = {33, 3, 4, 5};// declaration, instantation and initialization
		
		//passing array to method
		arrayAsParameter(array4);
		
		//passing anonymous array in a method
		arrayAsParameter(new int[] { 33, 3, 4, 5});
		
		// Returning Array from the method
		int[] array5 = arrayAsReturnType();
		System.out.println(array5.toString());
		
		// ArrayIndexOutOfBoundsException
		int arr[] = { 50, 60, 70, 80};
		for (int i = 0;i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Multidimensional Array in Java
		int[][] arr6 = new int [3][3];//3 row and 3 column
		
		for (int i=0,j=0;i<3 && j<3; i++,j++) {
			System.out.println(arr6[i][j]);
		}
		int counter = 0;
		for (int i = 0, j= 0; i <3 && j <3; i++, j++) {
			counter++;
			arr6[i][j] = counter;
		}
		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
		System.out.println(arr6[i][j]);
	
	}

}

static void arrayAsParameter(int arr[]) { // declare empty arrray as parameter
	for(int i = 0; i < arr.length; i++)//length is the property of array
		System.out.println(arr[i]);
}

// returning array from the method
static int[] arrayAsReturnType() {
	int array4[]= {33, 3, 4, 5 };
	
	return array4;
  }
}