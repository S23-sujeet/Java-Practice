/* This Program is the example of using abstract class without any constructor and also depicts the need of constructor
 inside the abstract class. The redundant or duplicacy of code is the reason for the need of constructor inside the abstract class..
 */

abstract class Person
{
    String name;
    int age;
}

class Student extends Person{
    int rollNo;
    int marks;
    Student(String name, int age, int rollNo, int marks ){
        this.name=name; //This line will be duplicated in each of the class..
        this.age=age; //This line will be duplicated in each of the class..
        this.rollNo=rollNo;
        this.marks=marks;
    } 
}

class Teacher extends Person{
    double salary;
    String subject;
    Teacher(String name, int age, double salary, String subject ){
        this.name=name; //This line will be duplicated in each of the class..
        this.age=age; //This line will be duplicated in each of the class..
        this.salary=salary;
        this.subject=subject;
    } 
}

class withoutConstructorAbstract{
    public static void main (String[] args){
        Student st= new Student("sujeet", 26, 11500862, 95);
        System.out.println(" Name = " + st.name + "\n age = "+ st.age + "\n Roll No = " + st.rollNo + "\n Marks = "+ st.marks);
        Teacher tc= new Teacher("R.K", 26, 450000.00, "JAVA PRE-ASSESSMENT" );
        System.out.println("\n Name = " + tc.name + "\n Age = "+ tc.age + "\n Salary = " + tc.salary + "\n Subject = "+ tc.subject);
    }
}