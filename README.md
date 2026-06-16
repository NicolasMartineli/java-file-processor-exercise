# Java File Processor Exercise

 **Note:** This repository is a personal training project developed to practice File I/O operations, Scanner inputs, and Exception handling (`try-with-resources`) in Java.

---

##  Exercise Description

Write a program to read the file path of a `.csv` file containing data of sold items. Each item has a name, unit price, and quantity, separated by commas.

You must generate a new file named `"summary.csv"`, located in a subfolder named `"out"` created inside the original folder of the source file. This new file should contain only the name and the total value for that item (unit price multiplied by quantity).

---

##  Technologies Used

* **Java**
* **IntelliJ IDEA**

##  Key Concepts Practiced

* **File Handling:** Using `BufferedReader`, `BufferedWriter`, `FileReader`, and `FileWriter`.
* **Try-with-resources:** For automatic resource management and safe closing of file streams.
* **String Manipulation:** Using `.split(",")` to parse data from CSV rows.
* **OOP Concepts:** Encapsulating data into a `Product` entity with proper methods and behaviors.
* **Enhanced For Loop:** Using the `for-each` syntax to cleanly iterate through collections.
