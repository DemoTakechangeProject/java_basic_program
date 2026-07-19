public class IfElseLadder {
    public static void main(String[] args) {
        String lang = "Tamil";
        if(lang=="Marathi") // true
        {
            System.out.println("Selected language marathi");
        }
        else if(lang=="English") // false
        {
            System.out.println("Selected language English");
        }
        else if(lang=="Hindi") // true
        {
            System.out.println("Selected language Hindi");
        }
        else{
            System.out.println("This is by default language");
        }
    }
}
