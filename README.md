# TurquoiseTortoises (Jessica Wu, Raymond Wu, Alvin Ye)
# APCS2 pd8
# L00 -- But What Does the Data Say?
# 2018-02-07

# Guidelines
There is an n*n (square) 2D array such that the numbers across any row from left to right increase, and the numbers down any column increase.

# Methodology
- Create a random matrix generator method that takes an int n argument and creates an n*n matrix that follows the guidelines above.
- Run the finder method on a 2000*2000 matrix. Repeat for 4000*4000, 6000*6000, 8000*8000, and 10000*10000 matricies.
- Store the time before running finder method using System.currentTimeMillis() in a long variable.
- Store the time after  running finder method using System.currentTimeMillis() in a long variable.
- Print the difference in time.
- Use command line redirection to copy printed times into a .csv file.
- Copy times from text file to a column in Google Sheets.
- Use Google Sheets to generate scatterplot.