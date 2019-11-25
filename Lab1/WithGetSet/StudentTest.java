/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

public class StudentTest {

    
    public static void main(String[] args) {
   

        int id; 
        String name; 
        double cgpa; 

        id = 153402329;
        name = "Moriom Akter Nahida"; 
        cgpa = 3.20; 

       
        Student student = new Student();

        student.setId(id); 
        student.setName(name); 
        student.setCgpa(cgpa); 

        System.out.println("this prints student's information using set and get methods");
        System.out.println("---------------------------------------");


        System.out.println("My name is: " + student.getName());

      
        System.out.println("My ID number is: " + student.getId());

  
        System.out.println("and my CGPA is: " + student.getCgpa());
    
    }
    
}
