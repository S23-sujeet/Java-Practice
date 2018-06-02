/*Whenever we are creating child class object automatically parent class object is created or not?
 -After executing this code it is clear that the when we are creating child class object no object of parent class is created
but the constructor of parent class is executed only... */
class P{
    P(){
    System.out.println(this.hashCode());
    }
}

class C extends P {
    C(){
        System.out.println(this.hashCode());
    }
}

class Test{
    public static void main (String[] args){
        C c =new C();
        System.out.println(c.hashCode());
    }
}