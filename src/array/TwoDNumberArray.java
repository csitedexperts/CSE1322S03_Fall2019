package array;

public class TwoDNumberArray {

	public static void main(String[] args) {
		int number = 7;

		int count = 0; boolean flag = false;

		//		1, 2, 3, 10, 4, 5, 6, 11, 7, 8, 9, 12

		/*
		1, 2, 3, 10
		4, 5, 6, 11
		7, 8, 9, 12 

		3 x 5 Matrix

		 */


		int [ ][] myArray = new int [][] 
				{
			{1, 2, 3, 10},
			{4, 5, 6, 11},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12},
			{7, 8, 9, 12}
			
		}; 	






		System.out.println("myArray.length: " + myArray.length);

		My2DArrayClass2 o2 = new My2DArrayClass2();
		o2.my2DArrayMethod(number, count, flag);
		
		My2DArrayClass2.my2DArrayMethod(number, count, flag);
		
	}

		
}
