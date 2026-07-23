import opreator.GraterNumber;
public class GraterEven {
    public static void main(String[] args) {
        int first = 40;
        int second = 60;
        int grater;
        boolean even_value;
        GraterNumber graterNumber = new GraterNumber();
        grater = graterNumber.findGrater(first,second); // grater = 60
        System.out.println("Return grater number is :"+grater);
        even_value = graterNumber.evenOdd(first);
        System.out.println("Return EvenOdd value is :"+even_value);
        if(even_value){
            System.out.println(first+" Number is Even");
        }else{
            System.out.println(first+" Number is Odd");
        }
    }
}
