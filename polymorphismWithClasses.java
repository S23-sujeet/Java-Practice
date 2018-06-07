abstract class Employee
{
    public void reachOffice(){
        System.out.println("Reached office - New Delhi");
    }
    public abstract void startProjectWork();
}

class Programmer extends Employee{
    public void startProjectWork(){
        defineClasses();
        unitTestCode();
    }
    public void defineClasses(){ System.out.println("Define Classes"); }
    public void unitTestCode(){ System.out.println("Unit testing"); }    
}

class Manager extends Employee{
    public void startProjectWork(){
        meetingWithCustomers();
        defineProjectSchedule();
        assignRespToTeam();
    }
    public void meetingWithCustomers(){ System.out.println("Meet Customers"); }
    public void defineProjectSchedule(){ System.out.println("Project Schedule"); }
    public void assignRespToTeam(){ System.out.println("Team Work Begins"); }    
}

class polymorphismWithClasses{
    public static void main (String[] args){
        Employee emp1 = new Programmer();
        Employee emp2 = new Manager();
        emp1.reachOffice();
        emp2.reachOffice();
        emp1.startProjectWork();
        emp2.startProjectWork();
    }
}