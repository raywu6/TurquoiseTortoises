//Turquoise Tortoises
//Alvin Ye, Raymond Wu, Jessica Wu
//APCS2 pd8
//2018-02-01

/*- This method takes an int[][] array and an int parameter (for the target).
  - Start at the element at the top-right corner.
  - Goes down last column until it hits a value greater than target
  - Goes left until it finds target
  - returns (r,c) coordinates if found, else returns (-1,-1)
  - this runs in O(n) time
*/

import java.lang.*;

public class MatrixFinder {

    public static String finder(int[][] matrix, int target)
    {
	int c = matrix.length - 1;
	int r = 0;
	int x = matrix[0][c];

	while ( x != target) 
	    {
		if ( x < target)   // if current elem is less than target
		    {
		    	if( r + 1 >= matrix.length){ //if it is currently at the last row, it has to iterate through the row

			    if(c == 0){ //if it is at column 0, it means that the value has not been found and doesn't exist in array
				return "(-1, -1)";
			    }

			    else{ // it iterates through the last row and updates x, using the while loop to check if x is equal to target
				c--;
				x = matrix[r][c]; //x is updated so the while loop can check to see if it found the target
			    }
			    
		    	}

			else{ // if it is not at the last row, it will just move down one row
			    r++;  
			    c = matrix.length - 1; //resets c to the last column
			    x = matrix[r][c]; //x is updated so the while loop can check to see if it found the target
			}
		    }

		else //if current element is not less than target, it means the value has to be in the current row, so it iterates through row
		    {
		    	if( c == 0){ //if it is at column 0, it means that the value has not been found and doesn't exist in array
			    return "(-1,-1)";
		    	}
		    	else{ // it iterates through the current  row and updates x, using the while loop to check if x is equal to target
			    c--;
			    x = matrix[r][c]; //x is updated so the while loop can check to see if it found the target
			}

		    }


	    } // end while loop

	
	return ("(" + r + "," +  c + ")"); // if it breaks out of the while loop, it means that the value has been found. Returns the row and column coordinates.
    } // end method finder



    
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
	finder(matrix, matrix[matrix.length - 1][0]);
   
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
	
	// 1000 trials for 2000*2000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(2000);
	    }
	
	
	// 1000 trials for 4000*4000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(4000);
	    }

	// 1000 trials for 6000*6000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(6000);
	    }

	// 1000 trials for 8000*8000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(8000);
	    }

	
	// 1000 trials for 10000*10000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(10000);
	    }

	// 1000 trials for 15000*15000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(15000);
	    }
	
	// 1000 trials for 20000*20000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(20000);
	    }

	 */
	
	// 1000 trials for 25000*25000 matrix
	for ( int counter = 0; counter < 100; counter++)
	    {
		runTest(25000);
	    }
	
	/* BOTTOM COMMENT-OUTER
	*/
    } // end main method


} // end class MatrixFinder
		
