import java.util.Scanner;

public class store{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("STORE INITIALIZE");

    }
}

class vegetable{
    protected String veg_name;
    protected float veg_weight;
    protected float discount;

    public vegetable(String vegetable_name, float vegetable_weight, float veg_discount){
        veg_name = vegetable_name;
        veg_weight = vegetable_weight;
        discount = veg_discount; 
    }
    

    
    

}