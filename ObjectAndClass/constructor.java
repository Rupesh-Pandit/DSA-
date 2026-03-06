public class constructor {
    public static void main(String[] args) {
      
        Student s1 = new Student("Rupesh Pandit", 1);
        Student s2 = new Student(s1);
        s1.roll=2;
    
        System.out.println(s1.roll);
        

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}

 class Student  {
int roll;
 String name;
 int marks[];

 Student(String name, int roll ){
    this.roll = roll;
    this.name= name;
    
   System.out.println("Here constructor is called...");
 }

 // shallow copy constructor.
 Student(Student s1 ){
    this.name= s1.name;
    this.roll = s1.roll;
    

 }
    
}