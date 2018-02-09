//Turquoise Tortoises
//Alvin Ye, Raymond Wu, Jessica Wu
//APCS2 pd8
//2018-02-01


import java.lang.*;

public class MFDriver {

    
    public static int[][] randomMatrix(int n){ //creates a random matrix with a different value in the bottom left in order to allow for a "worst value" test
    	int[][] matrix = new int[n][n];
    	int increment = (int) (Math.random() * 11) + 2; //sets the increment from 2 to 10
    	matrix[0][0] = (int) (Math.random() * 101); //sets a random int in the top left row from 0 to 100

    	for(int c = 1; c < n; c ++){ //iterates through the first row to set the values
    		matrix[0][c] = ( matrix[0][c - 1] + increment ); //increases by the increment
    	}

    	for(int r = 1; r < n; r ++){ //iterates through all the other rows to set the values
    		matrix[r][0] = ( matrix[r - 1][0] + increment); //sets the first value of each row by adding the increment to the number right above it
    		for(int c = 1; c < n; c++){
    			matrix[r][c] = ( matrix[r][c - 1] + increment); //increases each successive value by the increment
    		}
    	}

    	matrix[n - 1][0] = (matrix[n - 1][1] - 1); //alters the value of the element at the bottom left of matrix
    	return matrix;
    }




    public static void runTest( int matrixSize)
    {
	int[][] matrix = randomMatrix( matrixSize);

	long beforeTime = System.currentTimeMillis();

	//finding element in worst case position
	MatrixFinder.finder(matrix, matrix[matrix.length - 1][0]);
   
	long afterTime = System.currentTimeMillis();

	/*
	System.out.print("\nTime Before: ");
	System.out.println(beforeTime);

	System.out.print("\nTime After: ");
	System.out.println(afterTime);

	System.out.println("\nMilliseconds Elapsed: ");
	*/

	
	// keeping in mind csv format . . .
	System.out.println(matrixSize + "," + (afterTime-beforeTime) );

    }



    
    public static void main(String[] args)
    {
	/* TOP COMMENT-OUTER

	
	// 100 trials for 2000*2000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(2000);
	    }
		 */
	
	
	/* BOTTOM COMMENT-OUTER
	// 100 trials for 4000*4000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(4000);
	    }

	// 100 trials for 6000*6000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(6000);
	    }

	// 100 trials for 8000*8000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(8000);
	    }

	
	// 100 trials for 10000*10000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(10000);
	    }

	// 100 trials for 12500*12500 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(12500);
	    }	    

	// 100 trials for 15000*15000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(15000);
	    }

	// 100 trials for 17500*17500 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(17500);
	    }
	    
	// 100 trials for 20000*20000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(20000);
	    }

	
	// 100 trials for 25000*25000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(25000);
	    }
	*/



	// 100 trials for 22500*22500 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(22500);
	    }

    } // end main method


} // end class MFDriver
		
