/* This Program depicts how the redundancy of codes or duplicate code is removed using constructor inside the abstract class...
 */

abstract class Person
{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
    int rollNo;
    int marks;
    Student(String name, int age, int rollNo, int marks ){
        super(name, age);
        this.rollNo=rollNo;
        this.marks=marks;
    } 
}

class Teacher extends Person{
    double salary;
    String subject;
    Teacher(String name, int age, double salary, String subject ){
        super(name, age);
        this.salary=salary;
        this.subject=subject;
    } 
}

class withConstructorAbstract{
    public static void main (String[] args){
        Student st= new Student("sujeet", 26, 11500862, 95);
        System.out.println(" Name = " + st.name + "\n age = "+ st.age + "\n Roll No = " + st.rollNo + "\n Marks = "+ st.marks);
        Teacher tc= new Teacher("R.K", 26, 450000.00, "JAVA PRE-ASSESSMENT" );
        System.out.println("\n Name = " + tc.name + "\n Age = "+ tc.age + "\n Salary = " + tc.salary + "\n Subject = "+ tc.subject);
    }
}