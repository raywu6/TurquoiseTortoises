##### TurquoiseTortoises (Alvin Ye, Jessica Wu, Raymond Wu )
##### APCS2 pd8
##### Lab00 -- But What Does the Data Say?
##### 2018-02-07

# The Effect of the Length of a Matrix (n) on RunTime (ms)

## Hypothesis
Our finder method will run in O(n) time, where n is the length of the nxn array. This is because our method iterates through one column and one row, making it run in O(2n), or O(n).

## Background

- There is an n*n (square) 2D array such that the numbers across any row from left to right increase, and the numbers down any column increase. This is generated using a random matrix generator which we devised.
- The random matrix generator takes an int n argument and creates an n*n matrix that follows the guidelines above. It also alters the element in the bottom left of the matrix so that it is the worst-case scenario when we run the finder method to find that element.


## Methodology
- Using a runTest() method, run the finder method on a randomly-generated 2000x2000, 4000x4000, 6000x6000, 8000x8000, 10000x10000, 15000x15000, 20000x20000, and 25000x25000 matrix.
	Note: We ran the finder method 1000 times on each of these arrays to gather sizable data for the scatterplot.
- Store the time before running finder method using System.currentTimeMillis() in a long variable.
- Store the time after  running finder method using System.currentTimeMillis() in a long variable.
- Print the n value, followed by a comma, followed by the difference in time. This is so that it is in csv file format.
- Use command line redirection to copy printed times into a .csv file.
- Copy times from csv file to a column in Google Sheets.
- Use Google Sheets to generate scatterplot using the csv file.

## Results

![TurquoiseTortoise Scatterplot](https://i.imgur.com/KPMxVws.png).

## Conclusions
- In our google scatterplot, we saw that the data was more or less linear, but it seemed to have a slight parabolic curve. But considering that the n value ranged from 0 to 25000 yet the curve was so insignificant, we concluded that our code ran in more or less O(n) time.
- Our hypothesis did seem to be correct