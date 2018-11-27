

/**
Compile this program after the Student.java is compiled
*/

public class TestStudent 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
        // setting values of the variables  
        obj.setName("Vijay"); 
        obj.setAge(18); 
        obj.setRoll(75); 
          
        // Displaying values of the variables 
        System.out.println("student's name: " + obj.getName()); 
        System.out.println("student's age: " + obj.getAge()); 
        System.out.println("student's roll: " + obj.getRoll()); 
          
        // Direct access of studentRoll is not possible 
        // due to encapsulation 
        // System.out.println("student's roll: " + obj.studentName);         
    } 
} 
