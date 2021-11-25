# TEST
Task 1: 
C Programming Language Complete the function void update(int *a,int *b). 
It receives two integer pointers, int* a and int* b. Set the value of to their sum, and to their absolute difference. 
There is no return value, and no return statement is needed.

a = a +b
b = a - b 

#include <stdio.h> 
void update(int *a,int *b) { 
// Complete this function 
}

int main() { 
int a, b; 
int *pa = &a, *pb = &b; 
scanf("%d %d", &a, &b); 
update(pa, pb); 
printf("%d\n%d", a, b); 
return 0; 
}

Input Format The input will contain two integers, and , separated by a newline. 
Output Format Modify the two values in place and the code stub main() will print their values. 
Note: Input/ouput will be automatically handled. You only have to complete the function described in the 'task' section. 
Sample Input
4
5 
Sample Output
9 
1


Task 2: 
C Programming Language Write a program in C to create and display Singly Linked List. 
Include a function to add a node at the end of the linked list.
Below in the structure of the node

struct Node { 
int num; 
char name[50]; 
int age; 
struct Node *next; 
};



Task 3; 

Java Programming Language
Write a program with which you can convert a human height given in feet and inches to centimeters. 
The program should ask the user to type in his or her height in two parts: 
first the height in feet and then the inches part for the height. 
(A person can say that his or her height is, for example, 5 feet and 9 inches. 
There can be thus two separate input statements in the program. After the program has received the feet and the inches, 
it should calculate the corresponding value in centimeters and print it to the screen.



Task 4 : 

Java Programming Language
There are two common systems for measuring temperature. 
Degrees of Fahrenheit (ºF) are used in the U.S. and some other countries, while degrees of Celsius (ºC) are in use in most 
European countries and in many countries throughout the world. The freezing point of water is 0 degrees Celsius and 
32 degrees Fahrenheit, 10ºC is 50ºF, 20ºC is 68ºF, 30ºC is 86ºF, and so on. You can see that 10 degrees on the 
Celsius scale corresponds to 18 degrees on the Fahrenheit scale.

Exercise 1: 
Write a program that can convert degrees Fahrenheit to degrees Celsius, or vice versa.
Exercise 2: 
Improve your program so that it converts the given numerical value to both Degrees Celsius and to Degrees Fahrenheit. 
For example, if the user of the program types in 30, your program should say how much 30 ºC is in Degrees Fahreinheit and how much 30 ºF is in Degrees Celsius.
Exercise 3: 
Improve your program so that if the user types in the value 0 (zero), the program prints a table which looks like the following
Celsius Fahrenheit

-20.00 -4.00
-15.00 5.00
-10.00 14.00
-5.00 23.00
0.00 32.00
5.00 41.00
10.00 50.00
15.00 59.00
20.00 68.00
25.00 77.00
●
