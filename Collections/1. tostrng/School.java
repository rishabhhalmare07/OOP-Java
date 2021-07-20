public class School {
    String name;
    String id;
    School(String name, String id){  // Parameterized constructor
        this.name = name;
        this.id = id;
    }
    @Override
   public String toString() {
     
     return ("Name is:" + name + " and Your id is: " + id);   

   }    

public static void main(String[] args) {
  School to = new School("sam","12");
  System.out.println(to.toString());    // to execute tostring u need to override a method
  }    
}