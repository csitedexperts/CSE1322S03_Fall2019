package array;

public class My2DArrayClass2 {

	protected static void my2DArrayMethod(int number, int count, boolean flag) {
		int [][]grid= new int[][] {{5, 7, 4, 7}, {5, 7, 7, 7}, {3, 1, 3, 0}} ;

		System.out.println("grid.length: " + grid.length);

		for (int i = 0; i < grid.length; i++){
			for(int j = 0 ; j <grid[i].length; j++)
				if(grid[i][j] == number && grid[i][j] %2 == 1) {
					flag = true; 
					count= count + 1;
				}
		}
		//		if (count >=1)
		if(flag == true) /// Means if flag == true
			System.out.println("My number " + number + " is found " + count + " times");
		else
			System.out.println("My number " + number + " is NOT found");
	}
	

}
