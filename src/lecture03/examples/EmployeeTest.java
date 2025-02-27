package lecture03.examples;

// see http://beginnersbook.com/2013/04/throw-in-java/

public class EmployeeTest {
   static void  employeeAge(int age) throws MyOwnException{
      if(age < 0)
         throw new MyOwnException("Age can't be less than zero");
      else
         System.out.println("Input is valid!!");
   }
   public static void main(String[] args) {
       try {
            employeeAge(-2);
       }
       catch (MyOwnException e) {
    	   System.out.println(e.toString());
       }
   }
}
