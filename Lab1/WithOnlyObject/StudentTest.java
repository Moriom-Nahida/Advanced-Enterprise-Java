
 package Lab1.WithOnlyObject;


public class StudentTest {
   public static void main(String[] args) {
		int id; 
        String name; 
        double cgpa; 

        id = 153402329; 
        name = "Moriom Akter Nahida"; 
        cgpa = 3.20; 

        
        Student student = new Student(id, name, cgpa);

        System.out.println("this prints student's information using only object");
        System.out.println("---------------------------------------");
        System.out.println("My name is: " + student.name);
        System.out.println("My ID is: " + student.id);
        System.out.println("and my CGPA is: " + student.cgpa);
    }
}
