
public class code2 {
    public static void main(String[] args) {
        class student {
            int rollno;
            int age;   // we hv created a student class with properties like roll no and age
        }

        student student1 = new student(); // creating obj of student class this obj student1 is created in stack memory <holding adress of other properties linking to it in heap memory>  // lhs works on compile time and rhs works on run time
        System.out.println(student1);  // prints adress of properties stored in heap memory.
        // and new keyword allocates meory dynamically to student 1 DMA 
        student1.rollno = 20;
        student1.age = 22;
        System.out.println(student1.rollno);
        


    }
}
