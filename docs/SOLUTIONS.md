## Question 1.21 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     char hello = "hello";
4   }
5 }
```

### Solutions

```java
    Test.java:3: error: incompatible types: String cannot be converted to char
                    char hello = "Hello!";
                                 ^
    1 error
```

We try to assign a **String** "Hello!" to a variable of type **char**. Don’t forget that a char is a single character (i.e.: 'H', '!', '2', etc), while a String contains multiple character.


## Question 1.22 :

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

### Solutions

```java
Test.java:5: error: incompatible types: possible lossy conversion from double to int
                int numCredits = 3.0;
                                 ^
1 error
```

Here we try to assign a **double** to a variable of type **int**. 3.0 is in fact not an integer even if its numerical value is equal to the integer 3\. We can fix the problem by using **int numCredit = 3;** at line 5

## Question 1.23 :

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

### Solutions

```java
Test.java:6: error: cannot find symbol
                sum = a + b;
                ^
  symbol:   variable sum
  location: class Test
1 error
```
The variable sum was never declared. This error can be fix by changing the line 6 like this:

    double sum = a + b;

## Question 1.24 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     boolean winner, tie, loser;
4     winner = loser = tie = true;
5     System.out.println(winner + "  " +  tie + "  " + loser);
6   }
7 }
```

### Solutions

The code compiles without any error! We get the following result after running the program.

```java
true  true  true
```

## Question 1.25 :

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     int numOfApples = 5;
4     numOfApples = numOfApples - 2;
5     double numOfApples = numOfApples - 1/2 ;
6   }
7 }
```

### Solutions

```java
Test.java:5: error: variable numOfApples is already defined in method main(String[])
                double numOfApples = numOfApples - 1/2 ;
                       ^
1 error
```

In this example, we try to declare the variable “numOfApples” at the line 5\. It is impossible to declare the same variable more than once. If we want to get another type of value we should use another variable.

## Question 1.31 :

```java
System.out.println(4 + 2 > 6 == !(8 <= 8));
```

### Solutions

```java
true
```

## Question 1.32 :

```java
System.out.println(27 % 4 == 0 && 500 / 100 != 5 || true);
```

### Solutions

    true


## Question 1.33 :

```java
System.out.println(27 % 4 == 0 && (500 / 100 != 5 || true));
```

### Solutions

```java
false
```

Adding parenthesis to the expression makes it easier to read and helps to prevent error caused by the priority of the operators.

## Question 1.34 :

```java
System.out.println('o' >= 'j' && 'B' > 'A' && '&' == '&');
```

### Solutions

```java
true
```

## Question 1.35 :

```java
char c = 'a';
System.out.println(c == 'c');
```

### Solutions

```java
false
```

Note that we compare the content of the variable of **type char**, in this case 'a', with 'c'.


## Question 1.36 :

```java
double x = 17.24;
System.out.println((x + 32) < true);
```

### Solutions

```java
Test.java:4: error: bad operand types for binary operator '<'
                System.out.println((x + 32) < true);
                                            ^
  first type:  double
  second type: boolean
1 error
```

Watch the types! You cannot compare a **double** with a **boolean**. We get _error: bad operand types for binary operator '<'_. This show once more the importance of **types** in Java!