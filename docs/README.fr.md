# ITI 1521 - Lab 01 - Introduction à Java et aux concepts de base


## Objectifs d'apprentissage

*   **Apprendre** les concepts de base en java, la syntaxe, les types et opération de base.
*   **Comprendre** le processus de résolution d’erreur.
*   **Créer** de simples programmes.

### Soumission

Veuillez lire les [instructions junit](JUNIT.md) pour obtenir
de l'aide avec l'exécution des tests pour ce laboratoire.

Veuillez lire attentivement les [Directives de soumission](SUBMISSION.fr.md).
Les erreurs de soumission affecteront vos notes.

Soumettez les réponses aux Q3, Q5 et Q6.

* Q3_SquareArray.java
* Q3_AverageDemo.java
* Q3_ArrayInsertionDemo.java
* Q3_ReverseSortDemo.java
* Q5.java
* Q6.java


## 1. Introduction à Java

Plusieurs d'entre vous ont suivi ITI1520 à l'automne. Votre
introduction à l'informatique s'est faite avec Python. Voici
un résumé des différences majeures :

*   Java est un langage orienté objet. Tout code Java est inséré dans une classe (voir HelloWorld du laboratoire 0).
*   Tout programme doit posséder une méthode principale **public static void main(String[] args)**.
*   Java est un langage fortement typé. Il faut explicitement déclarer le type de chaque variable.
*   Chaque énoncé est terminé par un point-virgule.
*   Il faut mettre entre accolades les instructions d'un bloc de code.

Voici des ressources spécifiquement conçues pour faire la transition de Python à Java.

*   [From Python to Java by Ken Lambert](http://home.wlu.edu/%7Elambertk/pythontojava/)
*   [Java for Python Programmers by Brad Miller](http://interactivepython.org/runestone/static/java4python/index.html)
*   [Java Tutorials — Lesson: Language Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)

#### 1.1 Conventions

Afin d’avoir un code facile et rapide à lire, il existe des
conventions sur l’écriture des noms utilisés pour identifier
les classes, méthodes, variables et constantes. Les noms
devraient toujours être représentatifs et concis.

<table border="1">

<tbody>

<tr>

<th>Nom</th>

<th>Convention</th>

<th>Exemple</th>

</tr>

<tr>

<td>Nom de classes</td>

<td>Commence avec une **majuscule**, si c’est un nom composé de plusieurs mots, les mots subséquents commencent par une majuscule, mais les mots ne sont pas séparés par un espace
Il s'agit habituellement de noms communs.</td>

<td>Bouton, StudentSchedule, String</td>

</tr>

<tr>

<td>Nom de méthodes</td>

<td>Commence avec une **minuscule**, si c’est un nom composé de plusieurs mots, les mots subséquents commencent par une majuscule, mais les mots ne sont pas séparés par un espace
Le premier mot est habituellement un verbe à l'infinitif présent.</td>

<td>main(), println(), moveLeft()</td>

</tr>

<tr>

<td>Nom de variable</td>

<td>Commence avec une **minuscule**, si c’est un nom composé de plusieurs mots, les mots subséquents commencent par une majuscule, mais les mots ne sont pas séparés par un espace</td>

<td>flag, firstName, result</td>

</tr>

<tr>

<td>Nom de constante</td>

<td>**Tout** doit être en **majuscules**, si c’est un nom composé de plusieurs mots, les mots sont séparés par un tiret bas (_)</td>

<td>MAX_NUMBER, RED</td>

</tr>

</tbody>

</table>

_**Rappel :** Il est important de suivre les conventions, des points peuvent être déduits si elles ne sont pas respectées. Il existe de nombreuses ressources en ligne concernant ces conventions. N'oubliez pas de les consulter!_

*   [java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html](http://java.sun.com/docs/codeconv/html/CodeConvTOC.doc.html).
*   [www.site.uottawa.ca/~turcotte/teaching/iti-1521/assignments/directives.html](http://www.site.uottawa.ca/%7Eturcotte/teaching/iti-1521/assignments/directives.html)

Il est aussi important d’ajouter des commentaires au code afin d’aider les autres programmeurs à le comprendre. Les commentaires en java commencent par deux barres obliques (//), si les commentaires sont répartis sur plus d’une ligne, la première ligne commence par `/*` et la dernière se termine par `*/`.

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

Portez une attention particulière au programme ci-haut et
**identifiez** les éléments propres aux différentes conventions.
Vous remarquerez aussi l’importance de l’**indentation du code**
qui en facilite la lecture et la compréhension.

## 1.2 Introduction aux types prédéfinis

Comme mentionné plus haut, java est un langage fortement typé.
Il est donc important de comprendre les
[types primitifs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).
Les types les plus utilisés sont :

| Type | Definition | Example
| --- | --- | --- |
| **int** | un entier, avec une valeur entre -2<sup>31</sup> et 2<sup>31</sup>-1 | int myInt = 3;
| **double** | le type normalement utilisé pour représenter des nombres avec des décimales | double myDouble = 1.213;
| **boolean** | peut avoir la valeur **true** ou **false** | boolean myBool =  true;
| **char** | un caractère, soit une lettre, un numéro ou un symbole | char myChar = 'x';
| **String** | une chaîne de caractères, le contenu doit être mis entre deux symboles `"`. Notez que String n’est pas un type primitif, mais la raison est hors de la portée de ce laboratoire. | String myString = "Hello World!";

En Java, il est essentiel de déclarer le **type** de chaque **variable** ainsi que le **type** de la **valeur de retour** des méthodes (voir [Section 3.1](#method)).
Dans l'exemple suivant, nous omettons de déclarer la variable « year » avant de l'utiliser.

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     year = 2017 ;
4   }
5 }
```

Nous obtenons alors une erreur lors de la compilation, soit
_error: cannot find symbol_

```java
Test.java:3: error: cannot find symbol
                year = 2017 ;
                ^
  symbol:   variable year
  location: class Test
1 error
```

Cette erreur peut facilement être corrigée par l'ajout de la
déclaration de la variable de type **int** à la ligne 3.

```java
1 public class Test {
2   public static void main ( String[] args ) {
3     int year;
4     year = 2017 ;
5   }
6 }
```

## Exercices : déclaration de types

Identifiez les erreurs dans les codes suivants.

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

## 1.3 Les opérateurs de base

Les opérateurs sont utilisés pour manipuler les variables.
Voici une liste des opérateurs que vous devez connaitre.
Vous trouverez une liste complète des opérateurs et leurs
priorités [ici](https://www.tutorialspoint.com/java/java_basic_operators.htm).

Les **opérateurs arithmétiques** :

* `+` (addition)
* `-` (soustraction)
* `*` (multiplication)
* `/` (division)
* `%` (modulo) : retourne le reste d’une division
* `++` (incrémentation) : augmente la valeur de 1
* `--` (décrémentation) : réduit la valeur de 1

Les **opérateurs relationnels** :

_Ces opérateurs retournent un boolean (true ou false)_

* `>` (plus grand que)
* `<` (plus petit que)
* `>=` (plus grand ou égale à)
* `<=` (plus petit ou égale à)

Les **opérateurs d'égalité** :

_Ces opérateurs retournent un boolean (true ou false)_

* `==` (est égale à)
* `!=` (n’est pas égale à)

Les **opérateurs logiques** (du plus prioritaire au moins prioritaire) :

_Ces opérateurs retournent un boolean (true ou false)_

* `!` (NON logique) : renverse l’état logique de l’expression qui suit. Si la condition est true, le NON logique la rendra false et vice-versa.
* `&&` (ET logique) : vrai si les deux côtés de l’opérateur sont vrais
* `||` (OU logique) : vrais si un des deux côtés de l’opérateur est vrai

## Exercices de révision! Attention aux priorités...

Qu'est-ce qui sera affiché à la console si l'on remplace la ligne manquante par ...?

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

<div id="question4">

### Question 1.34 :

```java
System.out.println('o' >= 'j' && 'B' > 'A' && '&' == '&');
```

<div id="question5">

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

## 2.1 Boucles « for » et « while »

Les boucles sont nécessaires afin de répéter un groupe d'énoncés plusieurs fois.

**La boucle « for »** ou « for loop » est une boucle qui se répète jusqu’à ce qu’une condition soit satisfaite. La forme générale de la boucle est la suivante :

```java
for (_initialization_; _termination_; _increment_) {
  statement(s)
}
```

Où :

1.  _Initialization_ est une expression qui sera exécutée avant le début de la boucle, l'expression est exécutée une fois, lorsque la boucle débute.
2.  _Termination_ est une expression logique qui termine la boucle lorsqu’elle est fausse.
3.  _Increment_ est une expression qui est exécutée après chaque itération de la boucle (habituellement utilisé pour augmenter ou diminuer une valeur)

Voici une simple classe qui démontre la boucle « for » :

```java
1 class ForDemo {
2     public static void main(String[] args){
3          for (int i=1; i<11; i++){
4               System.out.println("Count is: " + i);
5          }
6     }
7 }
```

Si vous compilez et exécutez cette classe comme démontré dans le
laboratoire 0, la sortie à la console sera :

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

Notez que nous avons créé une chaîne de caractère (String)
"Count is: " suivi de _i_ à l'aide de l’opérateur de concaténation
« + ».

**La boucle « while »** agit similairement. Elle prend en
paramètre une expression logique et s’exécute en boucle tant que
l’expression reste vraie. Une variation de cette boucle est
**« do while »** qui s’assure que la boucle s’exécute au moins
une fois.

Voici le programme vu précédemment avec la boucle for, cette
fois-ci implémentée avec une boucle while et do while.

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

Notez que la variable a été déclarée avant la boucle et que nous
avons dû incrémenter la variable « i » à l’intérieur de la boucle.

#### if, else et else if

Les déclarations **if** et **else if** prennent en paramètre une
expression logique. Si cette expression est vraie, alors les
opérations associées à la déclaration sont exécutées, sinon
elles sont ignorées. Un **else** s’exécute si aucun if ni
else if s’est exécuté. Un _if_ peut être seul, un _else if_
doit être à la suite d’un _if_ ou d'un autre _else if_ et un
_else_ doit suivre un _if_ ou _else if_.

L’utilisation de ces déclarations est comme suit :

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

Dès qu'une expression logique est vraie, aucune des déclarations
subséquentes ne sera exécutée. Il est donc très important
d'utiliser les bonnes déclarations pour obtenir le comportement
voulu. Un bon usage des « { } » et de l'indentation permettent
d'éviter de commettre des erreurs.

Voici un programme qui indique les nombres pairs et impairs de
1 à 10:

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

Ce programme a une boucle similaire au programme de 2.1, à la
ligne 5. On vérifie si le modulo 2 de « i » est 0. Si la réponse
est « true » on sait que le nombre est pair et exécute la
ligne 6, tandis que si la condition du « if » est fausse la
ligne 8 est exécutée.

Notez qu'à la ligne 7, « else » aurait pu être remplacé par
« else if (i % 2 == 1) » et le même résultat aurait été obtenu.

La sortie est :

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

Créez la classe Q2 qui parcours les nombres 1 a 30, si le nombre
est divisible par 3 imprimer le numéro plus « Fizz », si
divisible par 5 imprimer le numéro plus « Buzz », si le nombre
est divisible par 15 imprimez le numéro plus « FizzBuzz »

```java
public class Q2 {

  public static void main(String[] args){
    // Your code here
  }

}
```

La sortie de votre programme devrait être comme ceci :

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

## 3. Méthodes, tableaux et résolution d'erreurs

### 3.1 Méthodes

Jusqu’ici, nous n'avons utilisé qu'une méthode, main. Pour
écrire des programmes bien structurés, il faut décomposer
les problèmes en sous-problèmes, codés à l'aide de méthodes.
Une méthode doit indiquer le type de la valeur qu’elle
retourne ou « void » si elle ne retourne rien. Pour retourner
une valeur, on utilise le mot clé **return** suivi de la
valeur à retourner. Une méthode a des **paramètres**, ce sont
des variables qui seront initialisées au moment de l'appel
(lorsque la méthode est utilisée). Une méthode termine son
exécution si elle rencontre le mot clé **return** ou si elle
finit l’exécution de son code. La syntaxe d’une méthode est
la suivante:

```java
public static int addition(int a, int b){
  int result = a + b;
  return result;
}
```

Où...

*   **public static** : modificateur de la méthode
*   **int** : le type de retour
*   **addition** : le nom de la méthode
*   **int a, int b** : la liste de paramètre: « int » est le type, « a » et « b » sont les noms des variables
*   **return** : mot clé précédant la valeur à retourner

Si l’on veut utiliser cette méthode, on doit l’appeler à partir de la méthode main comme ceci.

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

L’exécution de ce code nous donne cette sortie :

```java
1 + 2 = 3
```

### Tableaux et erreurs

Les tableaux (_array_ en anglais) sont de taille fixe et le type
de chaque cellule est le même. Leur taille est déterminée lors
de l’initialisation. Chaque « item » d'un tableau est appelée
un élément, chaque élément est accessible par son index.
L’index d’un élément est sa position dans le tableau,
**le premier élément commençant toujours par l'index 0**.

Un tableau est déclaré en indiquant le type des éléments suivi de deux crochets [ ] puis du nom de la variable. Pour créer un tableau, on utilise le mot clé **new** suivi du type des éléments puis de la taille du tableau entre crochets.

Exemple :

```java
int[] anArray;
anArray = new int[10];
```
Nous allons concevoir une méthode qui crée un tableau dont la
taille passée en paramètre et qui remplira le tableau avec un
entier égal a l’index de l’élément * 100.

Commençons avec le code ci-dessous. Essayez de le compiler,
puis de l’exécuter :

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

Lors de l’exécution, nous recevons le message d’erreur suivant :

```java
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at ArrayDemo.populateArray(ArrayDemo.java:11)
        at ArrayDemo.main(ArrayDemo.java:3)
```

Ce programme produit une erreur lors de son exécution,
**la première ligne nous indique la nature d’erreur**.
Les lignes suivantes indiquent la ligne ou l’erreur s’est
produite. Dans ce cas-ci l'erreur est
« ArrayIndexOutOfBoundsException » avec le détail « 10 »,
cela signifie que nous avons tenté d’accéder à l’index 10
du tableau, mais que cet index ne fait pas partie du tableau.
Bien que la taille du tableau est en fait 10, les index du
tableau débutent à 0\. Ainsi, il contient les index 0 à 9.
Dans l’exemple précédent nous avons essayé d’utiliser les
indexes 1 à 10, ce qui explique pourquoi l’exécution a causé
une erreur.

Il est possible de résoudre l’erreur en modifiant le code
comme ceci (**identifiez les 2 changements à la ligne 10**) :

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

Maintenant que la méthode populateArray ne cause plus d’erreurs,
nous pouvons imprimer le tableau pour nous assurer que la
méthode effectue les bonnes opérations sur le tableau.

Vérifier que le comportement d'une boucle est bel et bien
celui voulu est une bonne pratique. Les erreurs de type
« ArrayIndexOutOfBoundsException » peuvent alors être évitées.

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

La sortie de ce programme est :

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

## Tri par sélection

Utilisons l'algorithme de tri par sélection afin de nous familiariser avec les concepts que nous venons de voir. L'algorithme de tri identifie d'abord **la position du plus petit élément du tableau** . Il **échange** alors le contenu de cette position et celui de la position 0. Ensuite, l'algorithme identifie **la position du deuxième plus petit élément**.Le contenu de cette position et celui de la position 1 sont échangés. L'algorithme **continue de façon itérative** jusqu'à ce que toutes les valeurs soient en **ordre croissant**.

*   La méthode sort déclarée à la ligne 3 implémente l'algorithme de tri ; [Figure 6](#figure_6). Cette méthode a un paramètre, nommé **xs**. Ce paramètre est de type référence vers un tableau d'entiers, ****int[]****.
*   À la ligne 5, nous déclarons quatre (4) variables de type entier **(int)**.
*   À la ligne 7, nous avons la boucle **for** la plus à l'extérieure. Le test de la boucle **for** comprend 3 expressions : initialisation, critère d'arrêt, et l'incrément. Ainsi, on initialise la variable **i** à la valeur **0**. La boucle terminera lorsque la valeur de **i** est égale ou plus grande à la longueur du tableau désigné par la variable référence **xs**. Finalement, pour chaque itération, la valeur de **i** est incrémentée de **1**, **i++**. La syntaxe **i++** est une forme abrégée de l'expression **i=i+1**.
*   Ligne 8, nous assignons la valeur de i à la variable **argMin**. La valeur de la variable **argMin** sera utilisée pour désigner la position du plus petit élément du tableau entre les positions i et **xs.length-1**.
*   Ligne 9, nous avons une boucle for imbriquée. Cette boucle est utilisée afin de parcourir les positions **i+1** à **xs.length-1** du tableau. En effet, la valeur de **j** est initialisée à la valeur de **i+1**, la boucle terminera lors que la valeur de **j** sera égale ou plus grande à la longueur de tableau. Pour chaque itération, nous incrémentons la valeur de **j** de **1**.
*   À la ligne 10, nous avons l'énoncé **if**. On remarquera que le test est placé entre parenthèses. Ici, compare le contenu des positions **j** et **argMin** du tableau. Si la valeur à la position **j** est inférieure à celle de la case **argMin**, on sauvegarde la valeur de **j** dans la variable **argMin**, ligne 11\. C'est la position de la plus petite valeur jusqu'à maintenant.
*   Lignes 15, 16 et 17\. Une fois boucle imbriquée terminée, **argMin** contient la position de la plus petite valeur pour le segment du tableau situé entre les positions, **i** et **xs.length-1**. Nous interchangeons le contenu des cellules **i** et **argMin** du tableau.
*   À la ligne 18 se trouve l'accolade qui ferme le bloc débutant à la ligne 7\.
*   À la ligne 20 se trouve l'accolade fermant le bloc débutant à la ligne 3\.
*   La déclaration de la méthode principale se trouve à la ligne 22\. Cette méthode possède un paramètre, nommé args, une référence vers un tableau de chaînes de caractères.
*   Ligne 24, déclaration d'une variable référence vers un tableau d'entiers. Cette variable se nomme **marks**.
*   Ligne 25\. La portion droite de l'énoncé crée un tableau d'entier et l'initialise. La référence du tableau est sauvegardée dans la variable **marks**.
*   Ligne 27\. Appel à méthode **sort**. La valeur du paramètre actuel **marks** est copiée dans le paramètre formel **xs**.
*   Lignes à 33\. Impression du contenu du tableau désigné par la variable référence **marks**. On remarquera que l'on peut déclarer le type d'un variable à même l'initialisation de la boucle **for**.

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

Créez une classe comportant une méthode nommée **createArray** et
une méthode **main**. La méthode **createArray** doit créer un
tableau où chaque élément est la valeur du carré de son index.
La taille du tableau est passée en paramètre.

Cette méthode doit être appelée à partir de la méthode **main**
avec le bon paramètre afin de produire les carrés de 0 à 12 et
d'en imprimer les valeurs.

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

La sortie de votre programme devrait être :

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

Complétez ce code pour qu’il calcule la moyenne des 7 nombres
fournis dans un tableau :

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

###### Question 3.3

Créez une méthode qui permet d’ajouter un élément a une position
spécifique d’un tableau, Cette méthode doit prendre
**trois paramètres** : un tableau, une position et un nombre
à insérer. Utilisez la méthode main pour imprimer le tableau
**avant et après** l’insertion. (Indice : les tableaux sont
de taille fixe, il faut donc créer un nouveau tableau qui
a une plus grande taille).

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

Exemple de sortie :

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

## Question 3.4

Complétez ce code pour qu’il imprime les lettres du tableau
de caractères « unorderedLetters » en ordre décroissant :

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

Il existe en Java une classe appelée **Scanner**. C'est la
façon la plus simple pour obtenir une entrée faite par
l'utilisateur. Afin d'utiliser cette fonctionnalité, vous
devez d'abord importer le nom de la classe. En effet,
comme cette classe a déjà été créée pour vous, il suffit
d'utiliser **import java.util.Scanner;** pour y avoir accès.
Pour créer le Scanner, nous devons utiliser la ligne suivante:

```java
Scanner sc = new Scanner(System.in);
```

La création d'un objet de type Scanner reçoit comme argument
la variable « in » contenue par **System** (similairement à
System.out utilisé pour la méthode **println**). Vous verrez
en détail la création d'objets au prochain laboratoire.

Pour lire la valeur entrée par l'utilisateur, nous devons
prévoir le type de données que l'on veut recueillir.

Pour un **int**, on utilise :

```java
int myInt = scanNum.nextInt();
```

Pour un **double**, on utilise :

```java
double myDouble = scanName.nextDouble();
```

**Remarque:** Selon votre système, les Paramètres régionaux de la classe Scanner peut être différent pour le format numérique, c'est-à-dire en utilisant "1.2" ou "1,2". Pour corriger l'exception `InputMismatchException` , vous pouvez définir les paramètres régionaux en ajoutant la ligne de code suivante:

```java
scan.useLocale(Locale.US);
```

Pour un **String**, on utilise :

```java
String myString = scanName.nextLine();
```

Compilez et exécutez le code ci-dessous.:

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

### Question 4 : Mon premier scanner:

Créez un court programme nommé **VotingRight** qui demande à
l'utilisateur d'entrer son âge. Si l'utilisateur n'est pas
en âge de voter, le programme doit imprimer le nombre d'années
manquantes pour que l'utilisateur puisse voter.

Exemples de sortie :

```bash
How old are you? 11
You will be allowed to vote in 7 years.

How old are you? 24
You have the right to vote!
```

## Exercices : Test et correction d’erreurs!

### Question 5

Pour cette section, plusieurs méthodes sont fournies. Elles
contiennent par contre des erreurs. Certaines sont des erreurs
de syntaxe alors que d’autres sont des erreurs de logique.
La méthode main contient des tests qui exécutent les deux
autres méthodes et vérifie si elles fonctionnent bien.

La méthode isPrime détermine si le nombre fourni en paramètre
est un nombre premier. Un nombre premier est un nombre plus
grand que 1 qui est seulement divisible par un et lui-même.

La méthode Fibonacci prend un nombre et donne le nombre à
cette position dans la suite de Fibonacci. Dans la suite de
Fibonacci, chaque nombre est la somme des deux positions
précédentes où la position 0 possède le nombre 0 et la
position un le nombre 1\. Le tableau suivant décrit cette suite :

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

Vous devez corriger le code pour que tous les tests passent et que vous obteniez le message suivant :

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

Pour cet exercice, vous devez écrire une méthode qui demande 10
numéros à l’utilisateur dans la méthode main, ces numéros
représentent des notes de cours. Une fois les 10 numéros obtenus,
vous devez faire appel aux quatre autres méthodes en passant
les 10 numéros en paramètre et imprimer les résultats.
La méthode calculateAverage doit calculer puis retourner la
moyenne des notes. La méthode calculateMedian calcule et
retourner la médiane des notes. La méthode calculateNumberFailed
calcule et retourner le nombre d’étudiants qui ont échoué le
test et calculateNumberPassed calcule et retourner le nombre
d’étudiants qui ont passé le test. Une note de moins de 50% est
un échec.

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

## Ressources

*   [https://docs.oracle.com/javase/tutorial/getStarted/application/index.html](https://docs.oracle.com/javase/tutorial/getStarted/application/index.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html](https://docs.oracle.com/javase/tutorial/getStarted/cupojava/unix.html)
*   [https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html](https://docs.oracle.com/javase/tutorial/getStarted/problems/index.html)
