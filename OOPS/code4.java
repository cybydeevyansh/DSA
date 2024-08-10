// paramtrized constructor


public class code4 {
    static class student{
        int rollno;
        String name;
        student(int roll,String naam){  // paramatrized constructor
            rollno = roll;
            name = naam;}
    }
          
         

    public static void main(String[] args) {
        student student1 = new student(22,"deevyansh");
        System.out.println(student1.name);  // would print deevyansh
        System.out.println(student1.rollno);
        // creating an other obj of student class
        student student2 = new student(33,"dc");
        System.out.println(student2.name);  // would print dc
}

   
    
}

