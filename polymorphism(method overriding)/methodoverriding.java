/**
 * methodoverriding
 */
public class methodoverriding {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d = new Dog();
        Animal a2 = new Dog();

        a1.move();
        d.move();
        a2.move();
        
    }
}
    class Animal{
        public void move(){
            System.out.println("Animal can move");
        }
    }
    class Dog extends Animal{
        public void move(){
             System.out.println("Dog can walk and Run");
        }
    }