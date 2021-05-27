/**
 * javaabstraction
 */
abstract class Figure{
    abstract void draw();    
}
 class  Figure1 extends Figure{
      void draw(){
          System.out.println("I'm Drawing");
      }
}
class Figure2 extends Figure{
    void draw(){
        System.out.println("you must Draw something");
    }
}

public class javaabstraction {

    public static void main(String[] args) {
        Figure fig = new Figure2();        //Object can'y be made of abstract class so making object of child class  
        fig.draw();                        //So Overridding is happening as reference variable is of abstract class(Figure) but object is of child class(Figure2)

        Figure say = new Figure1();       // Same is happening as above
        say.draw();
    }
}