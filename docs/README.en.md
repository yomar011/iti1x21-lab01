# ITI 1121 - Lab 01 - Introduction to Java

## Learning Objectives

*   **Learn** the basics of java programming, syntax, types and basic operations
*   **Understand** how to fix errors
*   **Create** simple programs

### Submission

Please read the [junit instructions](JUNIT.md) for help
running the tests for this lab.

Please read the [Submission Guidelines](SUBMISSION.en.md) carefully.
Errors in submitting will affect your grades.

Submit answers to Q3, Q5, and Q6.

* Q3_SquareArray.java
* Q3_AverageDemo.java
* Q3_ArrayInsertionDemo.java
* Q3_ReverseSortDemo.java
* Q5.java
* Q6.java

## 1. Introduction to Java

Many of you have taken ITI1120 in the fall, where you have used Python. Here is an overview of the main differences:

*   Java is an Object-Oriented language. All the code is within classes (as can be seen in the HelloWord program from the lab 0).
*   Every program must contain a main method, **public static void main(String[] args).**.
*   Java is a strongly typed language. You must declare the type of each variable.
*   Every instruction ends with a semi-colon “;”.
*   Instructions that belong to the same block must be between curly brackets “{…}”.

Here are some resources specifically designed to migrate from
Python to Java:

*   [From Python to Java by Ken Lambert](http://home.wlu.edu/%7Elambertk/pythontojava/)
*   [Java for Python Programmers by Brad Miller](http://interactivepython.org/courselib/static/java4python/Java4Python.html)
*   [Java Tutorials — Lesson: Language Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)

#### 1.1 Conventions

In order to make your code clear and easy to understand, you
must follow some conventions when it comes to naming your
class, methods, variables and constants. Whenever possible,
avoid names that are too vague, not representative of what
it is or names that are too long.


<table border="1">

<tbody>

<tr>

<th>Name</th>

<th>Conventions</th>

<th>Example</th>

</tr>

<tr>

<td>Class name</td>

<td>Starts with an uppercase letter, if it is composed of many words, the following words starts with a capital letter, the words are not separated by a space. Class name are usually common names.</td>

<td>Bouton, StudentSchedule, String</td>

</tr>

<tr>

<td>Method name</td>

<td>Starts with a lowercase letter, if it is composed of many words, the following words starts with a capital letter, the words are not separated by a space. Method name are usually verbs.</td>

<td>main(), println(), moveLeft()</td>

</tr>

<tr>

<td>Variable name</td>

<td>Starts with a lowercase letter, if it is composed of many words, the following words starts with a capital letter, the words are not separated by a space.</td>

<td>flag, firstName, result</td>

</tr>

<tr>

<td>Constant name</td>

<td>The entire name should be in uppercase letter, if it is composed of many words, the words separated by an underline (_).</td>

<td>MAX_NUMBER, RED</td>

</tr>

</tbody>

</table>

_**Reminder :** it is important to follow conventions. Points can be deducted from your mark if they are not respected. You can find many resources online about theses conventions. Don’t forget to consult them!_

*   [java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html](http://java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html).
*   [www.site.uottawa.ca/~turcotte/teaching/iti-1521/assignments/directives.html](http://www.site.uottawa.ca/%7Eturcotte/teaching/iti-1521/assignments/directives.html)

It is also important to add comments to your code as it will help other programmers to understand it. Comments in java start with two dash (//), if the comments are too long for one line, the first line starts with `/*` and ends with `*/`.

```java
/* this is the beginning of
the class HelloWorld
that prints "Hello World!" to the console */

public class HelloWorld {

  //this is the main method
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

Take a close look at the code above and how the different
conventions are implemented. You should also note the
**code indentation** which makes it easier to read and understand.

## 1.2 Introduction to the basic types

As mentioned above, Java is strongly typed, it is important to
understand the [primitive types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).
The most commonly used types are:

| Type | Definition | Example
| --- | --- | --- |
| **int** | An integer with a possible value between -2<sup>31</sup> and 2<sup>31</sup>-1 | int myInt = 3;
| **double** | The most common type to represent a decimal value | double myDouble = 1.213;
| **boolean** | Can have the value **true** or **false** | boolean myBool =  true;
| **char** | A character such as a letter, a number or a symbol | char myChar = 'x';
| **String** | An array of **char**, the content of a String is identified by the quote symbol `"` at the beginning and end of the String. Note that a String is not a primitive type but the reason is beyond the scope of this lab. | String myString = "Hello World!";

In java it is important to declare the **type** of each **variable** as well as the return **type** of each **method** (see **Section 3.1**).
In the following example we forget to declare the variable year before using it.

```java
public class Test {
  public static void main ( String[] args ) {
    year = 2017 ;
  }
}
```

We get an error while trying to compile this class. The error is
_error: cannot find symbol_

```java
Test.java:3: error: cannot find symbol
                year = 2017 ;
                ^
  symbol:   variable year
  location: class Test
1 error
```

This error is easily fixed by adding the declaration of the
variable of type **int** to line 3.

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     int year;
4     year = 2017 ;
5   }
6 }
```

## Exercises: declaration of types

Identify the error in the following codes

### Question 1.21 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     char hello = "hello";
4   }
5 }
```

### Question 1.22 :

```java
1 public class CourseCode {
2   public static void main ( String[] args ) {
3     String subjectArea = "ITI";
4     int catalogNumber = 1121;
5     int numCredits = 3.0;
6     System.out.print(subjectArea + catalogNumber + " : " + numCredits + " credits");
7   }
8 }
```

### Question 1.23 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     double a,b;
4     a = 24;
5     b = 8/9;
6     sum = a + b;
7   }
8 }
```

### Question 1.24 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     boolean winner, tie, loser;
4     winner = loser = tie = true;
5     System.out.println(winner + "  " +  tie + "  " + loser);
6   }
7 }
```

### Question 1.25 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     int numOfApples = 5;
4     numOfApples = numOfApples - 2;
5     double numOfApples = numOfApples - 1/2 ;
6   }
7 }
```

## 1.3 Basic operators

The operators are used to manipulate variables. Here is a list
of the operators that you need to know. You can find a more
complete list of operator and their priority
[here](https://www.tutorialspoint.com/java/java_basic_operators.htm).

**Arithmetic operators** :

* `+` (Addition)
* `-` (Subtraction)
* `*` (Multiplication)
* `/` (Division)
* `%` (Modulus) : Divides left-hand operand by right-hand operand and returns remainder.
* `++` (Increment) : Increases the value of operand by 1.
* `--` (Decrement) : Decreases the value of operand by 1.

**Relational Operators**:

_These operators return a Boolean (true or false)_

* `>` (greater than)
* `<` (less than)
* `>=` (greater than or equal to)
* `<=` (less than or equal to)
* `==` (equal to)
* `!=` (not equal to)

**Logical Operators** (From the highest to the lowest priority) :

_These operators return a Boolean (true or false)_

* `!` (logical NOT) : Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false and vice-versa
* `&&` (logical AND) : If both the operands are true, then the condition becomes true.
* `||` (logical OR) : If any of the two operands are true, then the condition becomes true.

## Exercises. Watch out for the priority of operation...

What will be printed if we replace the missing line by...?

```java
1 public class PrintLine {
2   public static void main(String[] args) {
3     //missing line
4   }
5 }
```

### Question 1.31 :

```java
System.out.println(4 + 2 > 6 == !(8 <= 8));
```

### Question 1.32 :

```java
System.out.println(27 % 4 == 0 && 500 / 100 != 5 || true);
```

### Question 1.33 :

```java
System.out.println(27 % 4 == 0 && (500 / 100 != 5 || true));
```

### Question 1.34 :

```java
System.out.println('o' >= 'j' && 'B' > 'A' && '&' == '&');
```

### Question 1.35 :

```java
char c = 'a';
System.out.println(c == 'c');
```

### Question 1.36 :

```java
double x = 17.24;
System.out.println((x + 32) < true);
```

## 2.1 **For** and **while** loop

Loops are efficient tools used to act on a range of values

The **for loop** is a loop that repeats itself until a condition is satisfied. It follows this form:

```java
for (_initialization_; _termination_; _increment_) {
  statement(s)
}
```

Where :

1.  The _Initialization_ expression initializes the loop; it's executed once, as the loop begins.
2.  _Termination_ : if it evaluates to false, the loop terminates.
3.  _Increment_: it is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value

Here is a simple class that uses a for loop:

```java
1 class ForDemo {
2     public static void main(String[] args){
3          for (int i=1; i<11; i++){
4               System.out.println("Count is: " + i);
5          }
6     }
7 }
```

If you compile and run this class, the output will be:

```java
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
```

Note that we added the variable "i" to the String "Count is: "
by using the operator **+**

The **while loop** is similar to the for loop. It takes a logical
expression as a parameter and execute itself as long as that
expression is true. A variation of the while loop is **do while**,
this form of the loop will always execute at least once.

Here is the same program as before using the while and do while
loop.

```java
1 class WhileDemo {
2    public static void main(String[] args){
3        int i = 1;
4        while (i < 11) {
5            System.out.println("Count is: " + i);
6            i++;
7        }
8    }
9 }
```

```java
1 class DoWhileDemo {
2    public static void main(String[] args){
3        int i = 1;
4        do {
5            System.out.println("Count is: " + i);
6            i++;
7        } while (i<11);
8    }
9 }
```

Note that the variable **i** was declared before the loop and
that we had to increment it inside the loop.

#### if, else and else if

The **if** and **else if** statements take a logical expression
as a parameter. If this expression is true, the following
operation will be executed, otherwise it will be skipped.
**Else** statements are used for code that will be executed
only if no **if** or **else if** statement was executed.
An **if** statement can be alone, an **else if** has to follow
an **if** or another **else if**. The **else** statement has
to follow an **if** or **else if** statement.

The use of these statement is as follows:

```java
if(/*expression*/){
  //do something
}
else if(/*boolean expression*/){
  //do something
}
else if(/*boolean expression*/){
  //do something
}
else {
  //do something
}
```

Only the first statement (if, else if or else) whose expression
evaluates to true will be executed. It is therefore important
to use the good statements in the right order and to use the
brackets properly. Using the right indentation helps to prevent
mistakes.

Here is a program that prints each number from 1 to 10 and
indicates if they are even or odd:

```java
1  class IfDemo{
2    public static void main(String[] args){
3      int i = 1;
4      while (i<11){
5        if(i % 2 == 0) {
6          System.out.println(i + " is even");
7        } else {
8          System.out.println(i + " is odd");
9        }
10       i++;
11     }
12   }
13 }
```

This program has a similar loop to the program from 2.1. At
line 5 we check if the modulus 2 of **i** is 0. If that is
true we know that the number is even and the program executes
the line 6. Otherwise we know that the number is odd and the
program execute the line 9.

Note that the **else** at line 8 could have been replaced by
**else if (i % 2 == 1)** to get the same result.

The output is:

```java
1 is odd
2 is even
3 is odd
4 is even
5 is odd
6 is even
7 is odd
8 is even
9 is odd
10 is even
```

## Exercice 2 : FizzBuzz

Make a class Q2 that goes throught the numbers from 1 to 30,
if the number is divisible by 3 print "Fizz", if it is divisible
by 5 print "Buzz". If the number is divisible by 15 print
"FizzBuzz".

```java
public class Q2 {

  public static void main(String[] args){
    // Your code here
  }

}
```

The output should look like this:

```java
3  Fizz
5  Buzz
6  Fizz
9  Fizz
10 Buzz
12 Fizz
15 FizzBuzz
18 Fizz
20 Buzz
21 Fizz
24 Fizz
25 Buzz
27 Fizz
30 FizzBuzz
```

## 3. Methods, array and solving errors

### 3.1 Methods

Up to this point we have only used the **main method**. In order
to write efficient programs, you will need to divide you code
in different **methods** according to the functionality of the
code. A method had to indicate the **type** of value it will
return or **void** if it returns nothing. To return a value,
use the keyword **return** followed by the value to return.
A method takes zero to many **parameters**, parameters are
variables that are passed to the methods when it is called.
A method finishes its execution when it encounters the keyword
return or if it reaches its closing bracket **}**. The syntax
of a method is as follows:

```java
public static int addition(int a, int b){
  int result = a + b;
  return result;
}
```

Where...

*   **public static** : Method modifiers
*   **int** : Return type
*   **addition** : Name of the method
*   **int a, int b** : List of parameters ("int" is the type, "a" and "b" are the name of the variables)
*   **return** : Keyword preceding the value to return

If we want to use that method, we need to call it from the main method like this:

```java
class MethodDemo {
  public static void main(String[] args) {
    System.out.println("1 + 2 = " + addition(1,2));
  }

  public static int addition(int a, int b) {
    int result = a + b;
    return result;
  }
}
```

Running this program outputs:

```java
1 + 2 = 3
```

### Array and errors

**Arrays** are tables of fixed size that contain one type of data.
The size is determined during initialization.
Every “thing” in an array is called an **element**; each element
is accessible via its **index**. The index of an element is its
position the array.
**The first element of an array is at the index 0.**.

An array is declared by indicating the type follow by two
square brackets [] and the name of the variable. To initialise
an array you need to use the keyword **new** followed by the
size of the array within square brackets.

Example :

```java
int[] anArray;
anArray = new int[10];
```

Now let’s try to create a method that creates an array of a size
passed in parameter that will fill the array with an integer
equal to the index of the element * 100.

Let’s start with this code. Try to compile and then run this code:

```java
1  class ArrayDemo{
2    public static void main(String[] args) {
3      populateArray(10);
4    }
5
6    //methode that populates the array with the index of the element*100
7    public static int[] populateArray(int size) {
8      int[] anArray;
9      anArray = new int[size];
10     for(int i = 1; i <= anArray.length; i++) {
11       anArray[i] = i * 100;
12     }
13     return anArray;
14   }
15 }
```

When we try to run the code we get the following error message:

```java
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at ArrayDemo.populateArray(ArrayDemo.java:11)
        at ArrayDemo.main(ArrayDemo.java:3)
```

This program returns an error when we try to run it.
**The first line of the message indicates the type of error.**
The following line indicates where the error occurred. In this
case the error is of type “ArrayIndexOutOfBoundsException”
with the additional information “10”, this indicates that we
tried to access the index 10 of the array but that the array
does not contain an index 10\. While the size of the array is
in fact 10, since the index start at 0 the array contains the
index from 0 to 9\. In the previous example we tried to access
the index 1 to 10, which is why we got an error.

It is possible to fix the error by modifying the code like this
(**Identify the 2 changes to the line 10**) :

```java
1  class ArrayDemo{
2    public static void main(String[] args){
3      populateArray(10);
4    }
5
6    //methode that populates the array with the index of the element*100
7    public static int[] populateArray(int size){
8      int[] anArray;
9      anArray = new int[size];
10     for(int i = 0; i < anArray.length;i++){
11       anArray[i] = i * 100;
12     }
13     return anArray;
14   }
15 }
```

Now that the method populateArray does not cause any error,
we can print the array to make sure that the method does the
right operation to the array.

Verifying the logic of every method as soon as it is completed is a good practice that helps prevent future errors.

```java
1  class ArrayDemo{
2    public static void main(String[] args){
3      int[] arrayToPrint = populateArray(10);
4      for(int i = 0; i < arrayToPrint.length; i++){
5        System.out.println("value for index " + i + " is: " + arrayToPrint[i]);
6      }
7    }
8
9    //methode that populates the array with the index of the element*100
10   public static int[] populateArray(int size){
11     int[] anArray;
12     anArray = new int[size];
13     for(int i = 0; i < anArray.length; i++){
14       anArray[i] = i * 100;
15     }
16     return anArray;
17   }
18 }
```

The output is:

```java
value for index 0 is: 0
value for index 1 is: 100
value for index 2 is: 200
value for index 3 is: 300
value for index 4 is: 400
value for index 5 is: 500
value for index 6 is: 600
value for index 7 is: 700
value for index 8 is: 800
value for index 9 is: 900
```

## Selection Sort

Let’s use a selection-sort algorithm to review what we learned. This sorting algorithm first identified the location of smallest element in an array, and exchange the value at this location with the value at the location 0\. Then, it identifies the second smallest value in the array, and exchange the value at this location with the value at location 1\. The algorithm keeps on going iteratively until the values are sorted in increasing order.

*   The method sort declared at line 3 implements our algorithm. This method has one parameter, called xs. This parameter is of type reference, a reference to an array of integers **int[]**.
*   Line 5, we declare four variables of type integer **(int)**.
*   Line 7, we have the outermost for loop. A for loop test contains three parts: initialization, halting criteria and incrementation. Here, in the initialization part we initialize the variable i to the value. The loop will stop (halting criteria) once the value of i is more than or equal to the length of the array referenced by the (reference) variable xs. Finally, at each iteration, the value of i is incremented by 1 (i++, which is a short cut for i=i+1).
*   Line 8, we assign the value of i to the variable argMin. The value of variable argMin is going to be used to record the position of the smallest entry in the array between i and xs.length-1.
*   Line 9, we have a nested for loop. This loop is used to traverse positions from i+1 to xs.length-1 of the array: the value of j is initialized with the value of i+1 and the loop finishes once j is larger than or equal to the length of the array. At each iteration, the value of j is incremented by 1.
*   Line 10, we have an if statement. Note that the test is between parentheses. Here, we compare the values of the positions j and argMin in the array. If the value at position j is less than the value at position argMin, we store the value at position j in the variable argMin (line 11). It’s the smaller value so far.
*   Lines 15, 16 and 17\. Once the nested loop is finished, argMin contains the location of the smallest value for the part of the array between locations i and xs.length-1\. We exchange the values at location i and argMin.
*   At line 18 we have the closing bracket for the block starting at line 7.
*   At line 20 we have the closing bracket for the block starting at line 3.
*   The main method is declared at line 22\. This method has one parameter, called args, a reference to an array of Strings.
*   At line 24, we define a reference variable, which points at an array of integers. This variable is called marks.
*   At line 25\. The right hand side of the statement created an array of integers. The reference of the array is stored in a variable called **marks**.
*   At line 27\. Call to the method sort. The value of the actual parameter marks is copied into the formal parameter **xs**.
*   In lines 29 35\. Printing of the array referenced by the variable marks. Note the declaration and initialization of a new variable and its type (int i=0) right inside the initialization of the for loop..

```java
1  public class Sort {
2
3    public static void sort(int[] xs){
4
5      int i, j, argMin, tmp;
6
7      for (i = 0; i < xs.length - 1; i++) {
8        argMin = i;
9        for (j = i + 1; j < xs.length; j++) {
10         if (xs[j] < xs[argMin]) {
11           argMin = j;
12         }
13       }
14
15       tmp = xs[argMin];
16       xs[argMin] = xs[i];
17       xs[i] = tmp;
18     }
19
20   }
21
22   public static void main(String[] args) {
23
24     int[] marks;
25     marks = new int[]{100,34,72,56,82,67,94};
26
27     sort(marks);
28
29     for(int i=0; i< marks.length; i++) {
30       if (i>0) {
31         System.out.print(", ");
32       }
33       System.out.print(marks[i]);
34     }
35
36     System.out.println();
37   }
38
39 }
```

## Exercices!

### Question 3.1

Create a class containing a method name **createArray** and a
main method. The method createArray creates an array where
each element contains the square of its index. The size of
the array is determined by the method’s parameter. createArray
then returns this array.

The main methods calls createArray with the right parameter
to get the squares of the numbers from 0 to 12, it then prints
the values of the array.

```java
public class Q3_SquareArray{

  public static int[] createArray(int size) {
    // Your code here
  }

  public static void main(String[] args){
    // Your code here
  }
}
```

The output should be similar to this:

```java
The square of 0 is: 0
The square of 1 is: 1
The square of 2 is: 4
The square of 3 is: 9
The square of 4 is: 16
The square of 5 is: 25
The square of 6 is: 36
The square of 7 is: 49
The square of 8 is: 64
The square of 9 is: 81
The square of 10 is: 100
The square of 11 is: 121
The square of 12 is: 144
```

### Question 3.2

Complete this code so that it calculates the average of the 7
numbers passed via the array **valuesArray**:

```java
public class Q3_AverageDemo {

  public static void main(String[] args){
    double[] valuesArray;
    valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0};
    System.out.println("The average is: " + calculateAverage(valuesArray));
  }

  //method that calculates the average of the numbers in an array
  public static double calculateAverage(double[] values){
    double result;
    //your code here
    return result;
  }
}
```

### Question 3.3

Create a method that inserts an element to a specific index of
an array. This method has **three parameters**: an array, an
index and a number to insert. Use the main method to print the
array **before and after** the insertion. _(Hint: arrays
have fixed size; you must create a second array that is
bigger than the first)_

```java
public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    // Your code here
  }

  public static void main(String[] args){
    // Your code here
  }
}
```

Example of the output:

```java
Array before insertion:
1
5
4
7
9
6
Array after insertion of 15 at position 3:
1
5
4
15
7
9
6
```

### Question 3.4

Complete this code so that it prints the letters from the
char array **unorderedLetter** in decreasing order:

```java
public class Q3_ReverseSortDemo {

  public static void main(String[] args){
    char[] unorderedLetters;
    unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
    reverseSort(unorderedLetters);
    for (int i = 0 ; i < unorderedLetters.length; i++ )
      System.out.print(unorderedLetters[i]);
  }

  //method that sorts a char array into its reverse alphabetical order
  public static void reverseSort(char[] values){

    //your code here
  }

}
```

## 4. Java Scanner

In Java there is a class named **Scanner**. It is the quickest
way of obtaining data from the user. To use this class, you
must first import it using **import java.util.Scanner;**.
To create a Scanner, we use this line:

```java
Scanner sc = new Scanner(System.in);
```

The creation of an object of type Scanner take the argument
**in** which is a variable from the class System. (similar
to System.out use to get the method println). You will
further explore the creation of objects in another lab.

To read the values entered by a user, we need to know what
kind of value we expect to get.

For an **int**, we use :

```java
int myInt = scanNum.nextInt();
```

For a **double**, we use:

```java
double myDouble = scanName.nextDouble();
```

**Note:** Depending on your system, the Locale setting of the Scanner class might be different for the number format i.e. using "1.2" or "1,2". To fix the `InputMismatchException`, you can set the Locale by adding the following line of code:

```java
scan.useLocale(Locale.US);
```

For a **String**, we use:

```java
String myString = scanName.nextLine();
```

Compile and run the following code:

```java
import java.util.Scanner;

class ScannerDemo{
  public static void main(String[] args){

    System.out.print("What is your name? ");
    Scanner scan = new Scanner(System.in);
    String myString = scan.nextLine();

    System.out.print("How many countries have you visited? ");
    int myInt = scan.nextInt();

    System.out.println(myString + " has visited " + myInt + " countries.");

  }
}
```

### Question 4 : My first Scanner:

Create a small program named **VotingRight** that asks the
user to enter his age. If the user is not old enough to vote,
the program needs to print the number of years until the
person is allowed to vote.

Example of the output:

```bash
How old are you? 11
You will be allowed to vote in 7 years.

How old are you? 24
You have the right to vote!
```

## Exercices : Test and error correction!

### Question 5

For this section, many methods are given. They however contain
errors. Some errors are syntax error while others are logical
error. The main method contains test that will execute the
two other methods and verify if they work properly.

The method isPrime checks if the number received as an argument
is a prime number. A prime number is a number bigger then 1
that can only be divided by 1 or itself.

The **Fibonacci** method takes a number as argument and
returns the value at this position in the Fibonacci series.
In the Fibonacci series, each number is the sum of the
two preceding position in the series. The position 0 has
the value 0 and the position 1 has the value 1\. This
table describes the series:

| position | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| value | 0 | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 |


```java
public class Q5 {

  public static void main(String[] args){
    boolean[] test = new boolean[8];

    //test for isPrime
    test[0]  = (isPrime(0) == false);
    test[1] = (isPrime(2) == true);
    test[2] = (isPrime(7) == true);
    test[3] = (isPrime(15) == false);

    test[4]  = (getFibonacci(1) == 1);
    test[5]  = (getFibonacci(3) == 2);
    test[6]  = (getFibonacci(5) == 5);
    test[7]  = (getFibonacci(8) == 21);

    boolean testFlag=true;
    for (int i = 0; i < test.length; i++){
      if(test[i]){
        System.out.println("test " + i + " passed");
      } else {
        System.out.println("test " + i + " failed");
        testFlag = false;
      }
    }

    if(testFlag ){
      System.out.println("All tests are successful");
    } else {
      System.out.println("Not all tests are successful");
    }

  }

  //method that determines if the number x is prime
  public static boolean isPrime(int x){
    boolean prime = true;
    if(x < ){
      prime = ;
    }
    if(x== ){
      prime = ;
    }
    int i = 2;
    while(prime && x < i){
      if(x % i == 0){
        prime = false;
      }
      i++;
    }
    return prime;
  }

  //returns the fibonacci number at the position in parameter
  public static int getFibonacci(int position) {

    int num = 0;
    int num2 = 1;
    int fibonacci = 0;

    if (position == ) {
      fibonacci = 0;
    } else if (position == 1) {
      fibonacci = ;
    } else {
      for (int i = 2; ; ) {
        fibonacci = ;
        num = num2;
        num2 = fibonacci;
      }
    }
    return num;
  }

}
```

You need to correct the code above until all tests pass successfully and that you get the following output message:

```java
test 0 passed
test 1 passed
test 2 passed
test 3 passed
test 4 passed
test 5 passed
test 6 passed
test 7 passed
All tests are successful
```

### Question 6

For this exercice, you will need to write a method that asks
for 10 numbers from the user in the **main** method. These
numbers represent 10 students' grade. Once the 10 numbers
are obtained, you will need to call the four other methods
passing the 10 numbers as an argument and print the results
from the main. The method **calculateAverage** needs to
calculate and then return the average of the grades. The
method **calculateMedian** calculates and returns the
[median](https://en.wikipedia.org/wiki/Median) of the grades.
The method **calculateNumberFailed** calculates and returns
the number of students that failed and **calculateNumberPassed**
calculates and returns the number of students that passes.
Grades are numbers between 0.0 and 100.0\. The passing grade
is 50%.

```java
public class Q6 {
  public static void main(String[] args){

    //your code here

  }

  public static double calculateAverage(double[] notes){
    //your code here
  }

  public static double calculateMedian(double[] notes){
    //your code here
  }

  public static int calculateNumberFailed(double[] notes){
    //your code here
  }

  public static int calculateNumberPassed(double[] notes){
    //your code here
  }

}
```

## Resources

*   [https://docs.oracle.com/javase/tutorial/getStarted/application/index.html](https://docs.oracle.com/javase/tutorial/getStarted/application/index.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html](https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html)
