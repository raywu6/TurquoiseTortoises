 TurquoiseTortoises (Jessica Wu, Raymond Wu, Alvin Ye) <br />
 APCS2 pd8 <br />
 Lab00 -- But What Does the Data Say? <br />
 2018-02-07 <br />

# The Effect of the Length of a Matrix (n) on Runtime (milliseconds)

## Hypothesis
Our finder method will run in O(n) time, where n is the length of the n*n array. This is because our method iterates through one column and one row, making it run in O(2n), or O(n).

## Background

- There is an n*n (square) 2D array such that the numbers across any row from left to right increase, and the numbers down any column increase. This is generated using a random matrix generator which we devised.
- The random matrix generator takes an ``int n`` argument and creates an n*n matrix that follows the guidelines above. It also alters the element in the bottom left of the matrix so that it is the worst-case scenario when we run the finder method to find that element.


## Methodology
- Using a runTest() method, run the finder method on a randomly-generated 2000 x 2000, 4000 x 4000, 6000 x 6000, 8000 x 8000, 10000 x 10000, 15000 x 15000, 20000 x 20000, and 25000 x 25000 matrix. <br />
	Note: We ran the finder method 100 times on each of these arrays to gather sizable data for the scatterplot.
- Store the time before running finder method using ``System.currentTimeMillis()`` in a ``long`` variable.
- Store the time after  running finder method using ``System.currentTimeMillis()`` in a ``long`` variable.
- Print the length of the matrix being tested, followed by a comma, followed by the difference in time. This is so that it is in `.csv` file format.
- Use command line redirection to copy printed times into a .csv file.
- Import the `.csv` file into Google Sheets.
- Use Google Sheets to generate a scatterplot using the raw data.

## Results

![TurquoiseTortoise Scatterplot](https://github.com/raywu6/TurquoiseTortoises/blob/master/ScatterPlot.pdf).

## Conclusions
- In our Google scatterplot, we saw that the data was more or less linear, but it seemed to have a slight parabolic curve. Considering that the n value ranged from 0 to 25000 and that the curve was so insignificant, we concluded that our code ran in more or less O(n) time.
- Our hypothesis did seem to be correct.