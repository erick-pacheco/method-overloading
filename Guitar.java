//Top of Guitar.java
  public class Guitar{
 
    public String bass(){
      return "I am a bass guitar!";
    }

    //This is an overloaded version of the Bass method, Java can tell the difference between the two depending on if you pass an int in as a parameter
    public String bass(int strings){
      return "I am a bass guitar with " + strings + " strings!";
    }

    public String bass(int strings, String sound) {
     return "The bass guitar has " + strings + " strings and makes " + sound;
    }

    public String bass(int strings, String sound, int size) {
      return "Well my bass guitar has " + strings + " strings, makes " + sound + ", and is about " + size + " inches!";
    }

  }