# Refactor OOP to Functional in Java

* OOP is good for a fixed set of operations on things
* FP is good for a fixed set of things, and as the code evolves, you primarily add new opetations on those existing things

### Steps to rewrite an implementation as lambda expression:
1. remove access level
2. remove name of the method, it's important just what it does
3. remove the return type
4. if the implementation has a single line you can even remove the {}
5. obtain the lambda expression: (argument-list) -> {body}

### Notes
* a lambda expression requires a functional interface (aka sam interface)
* a lambda expression is basically a shortcut to defining the implementation of a functional interface
* but instead of having to create a class that impelement that interface and
* implementing the methods and
* instantiating the class into an object and
* call that method by using that object
* it allows you treat code as parameter


* further, we can make this lambda as a variable of interface's type
* then pass that variable as argument

* when use a lambda expression that accepts a param
* if you have a single param, you can even exclude the ()
