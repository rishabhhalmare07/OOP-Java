/**
 * object
 */

class Cat{

    String name;
    int legs, eyes;
     public void walk(){
           System.out.println("cat is walking");
    
     }
     public void eat(){
         System.out.println("Cat is eating");
     }
     public void description(){
         System.out.println("My cat has "+ legs + " legs and " + eyes + " eyes");
     }
}



public class object {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.legs = 3;
        cat1.eyes = 2;
        cat2.legs = 4;
        cat2.eyes = 1;

        cat1.walk();
        cat2.eat();

        cat1.description();
        cat2.description();
    }
}