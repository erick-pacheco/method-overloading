# Instructions  
### Description:
Method overloading is a form of compile-time, or static polymorphism. What this means is that a method can have multiple different implementations, and to determine which one to use, the compiler looks at the list of parameters for each method call, and based on the number of parameters and their data types, a specific implementation is chosen to use when the program compiles.<br>
To overload a method, we simply need to have two methods with the same name and modifiers, which have different lists of parameters, and the compiler will pick one based on what we pass into the method.

### Steps:
1. Create a file named Guitar.java and copy and paste the following starter code into it:
```java
//Top of Guitar.java
  public class Guitar{
 
    public String bass(){
      return "I am a bass guitar!";
    }

    //This is an overloaded version of the Bass method, Java can tell the difference between the two depending on if you pass an int in as a parameter
    public String bass(int strings){
      return "I am a bass guitar with " + strings + " strings!";
    }
  }
```
2. Create a new method that overloads the Bass method. It should have two parameters: the first is an `int` named *strings* that represents the string count, and the second parameter is of type `String` and is named sound. The method should have the following statement within in:
`return "The bass guitar has " + strings + " strings and makes " + sound;`
<br><br>
4. Overload the bass() method again with a new method. This method should have three parameters: an `int` parameter named *strings* for the string count, a `String` parameter named *sound*, and another `int` parameter named *size*. The method should have the following statement within in:
`return "Well my bass guitar has " + strings + " strings, makes " + sound + ", and is about " + size + " inches!";`
<br><br>
6. Back in the main method in Main.java, copy and paste the following code:
```java
//creating a guitar object, calling it g
  Guitar g = new Guitar();
  System.out.println(g.bass(12));
```
5. Print out the string that is returned from the overloaded method you made with two parameters: the int should be 4 and the String should be "deep sounds!"
6. Print out the string that is returned from the overloaded method you made with three parameters: the  strings should be 9, the sound should be "clanging sounds" and the size in should be 30.

### Test:
Use the test provided(checkmark on left-hand menu) to test for the correct output. 

#### Sample output:
```
I am a bass guitar with 12 strings!
The bass guitar has 4 strings and makes deep sounds!
Well my bass guitar has 9 strings, makes clanging sounds, and is about 30 inches!
```