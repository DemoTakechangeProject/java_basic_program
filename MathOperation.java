import calculation.Operation;
public class MathOperation {
    public static void main(String[] args) {
        int a=10,b=20;
        Operation operation = new Operation();
        operation.addition(a,b); //
        operation.subtraction(a,b);
        operation.multiplication(a,b);
        operation.division(a,b);
    }
}
