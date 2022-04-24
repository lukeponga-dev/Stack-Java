# Stacks in Java
## Part One

>In this assignment you will write a program which >processes commands in LIFO order. You will
>need to define Java classes to implement a stack. >Your stack should use a recursive dynamic
>linked list (i.e. not an array) following the >specification given below. 

<br>
1) Stack: define a class called Stack in a file called Stack.java. This class is to implement a dynamic linked list as a stack that supports the following public methods using recursion where applicable.

* push(String x) - add item x to the front of the list.
* pop() - remove an item from the front of the list.
* peek() - look at the first item of the list and return its value.<br>
* isEmpty() - returns boolean true if head node is null; false otherwise.
* length(): returns as an int the number of commands in the queue.
* dump(): prints the contents of the stack to standard output.

<br>
2) The Node: define a class called Node for the nodes in your Stack. It can either be an external class in a separate file called Node.java or an inner class of Stack. It should have the following:

* A member variable to hold the string value.
* A member variable to hold a link to another Node.
* A constructor that takes a value as a string argument and copies that value into the Node’s private member variable.

   You may have additional member variables and methods if they are useful to you, but they should be private.
## Part Two

>Create a new Java class called Parser in a file called Parser.java. 
>In this file you are going to write a public method called check() 
>which will use your Stack class to determine if a string is well-formatted with regards to its parentheses. 
>For example, given the input:()(), your program should return “true” as there are the correct number of brackets. 
>Alternatively, given the invalid input: ()((()(, your program should return “false” as there are the incorrect number of brackets.
<br>

<p> In your Parser class write a private method called getString() which will generate random
strings with random parentheses. Your function should generate correctly and incorrectly
formatted equations. All equations should be no longer than 10 characters. Use this method to
debug your check() method.
<br>
<br>
A program will be posted on Moodle about a week before the assignment is due. Ensure that
your classes work with this program as this will be used during marking. 
</p>
