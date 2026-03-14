# Lab 5: Java File I/O - Grade Processing

This program reads raw student test scores from a text file, calculates the grade distribution, and writes the final statistics to a brand new text file. 

### How the File I/O works:

* **The Input (`input.txt`):** This is a simple text file placed in the exact same folder as the Java program. It acts as the data source, containing rows of raw integer grades. The program uses a `Scanner` to read these numbers line by line until it hits a `-1` (the sentinel value), which tells the loop that the current set of grades is finished. 
* **The Output (e.g., `out.txt`):** Instead of just printing the math results to the console screen, the program uses `PrintWriter` to generate a brand new text file. It takes all the final calculated data—like the total number of As, Bs, Cs, the highest and lowest scores, and the exact class average—and writes it directly into this newly created file.
