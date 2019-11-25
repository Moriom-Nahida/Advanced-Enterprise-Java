/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1.WithToString;

import Lab1.Student; 

public class StudentT {

    
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

        System.out.println("this prints student's information using \"toString\" method");
        System.out.println("---------------------------------------");

        
        System.out.println(student);
    }
    
}
