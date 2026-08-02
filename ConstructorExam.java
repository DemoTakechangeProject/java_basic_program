public class ConstructorExam {
    int e_id;
    String emp_name;
    int emp_age;
    double salary;
    ConstructorExam(int e_id,String emp_name,int emp_age,double salary){
        this.e_id = e_id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.salary = salary;
    }
    void display(){
        System.out.println("Emp Id:"+e_id+"\nEmp Name :"
                +emp_name+"\nEmp Age :"+emp_age+"\nSalary :"+salary);
    }
    public static void main(String[] args) {
        ConstructorExam ankita = new ConstructorExam(301,"Ankita",20,
                50000.00);
        ankita.display();
    }
}


//    void display(){
//        System.out.println("Roll :"+roll+"\nName :"+name);
//    }