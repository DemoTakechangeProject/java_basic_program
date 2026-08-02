class Parent{
    protected String stud_name="Ankita";
    protected Parent(){
        System.out.println("I am constructor");
    }
    void display(){
        System.out.println(stud_name);
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display();
        System.out.println("Student name: "+obj.stud_name);
    }
}
