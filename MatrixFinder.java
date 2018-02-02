//TurquoiseTortoises
//Jessica Wu, Raymond Wu, Alvin Ye
//APCS2 pd8
//2018-02-01

/*- This method takes an int[][] array and an int parameter (for the target).
  - Start at the element at the top-right corner.
  - Goes down last column until it hits a value greater than target
  - Goes left until it finds target
  - returns (r,c) coordinates if found, else returns (-1,-1)
  - this runs in O(n) time
*/

public class MatrixFinder {

    public static String finder(int[][] matrix, int target)
    {
	int c = matrix.length - 1;
	int r = 0;
	int x = matrix[0][c];

	while ( x != target) 
	    {
		if ( x < target)   // if current elem is less than index
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

		else
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

} // end class MatrixFinder
		
