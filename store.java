import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



class Vegetable{
    protected String veg_name;
    protected Double veg_weight = null;
    protected Integer veg_count = null;
    protected float discount;
    protected float price;


    public Vegetable(String vegetable_name, Double vegetable_weight, float veg_price){
        veg_name = vegetable_name;
        veg_weight = vegetable_weight;
        price = veg_price;
         
    }

    public Vegetable(String vegetable_name, Double vegetable_weight, float veg_price, float veg_discount){
        veg_name = vegetable_name;
        veg_weight = vegetable_weight;
        price = veg_price;
        discount = veg_discount; 
    }

    public Vegetable(String vegetable_name, int vegetable_count, float veg_price){
        veg_name = vegetable_name;
        veg_count = vegetable_count;
        price = veg_price;
        
            
    }

    public Vegetable(String vegetable_name, int vegetable_count, float veg_price, float veg_discount){
        veg_name = vegetable_name;
        veg_count = vegetable_count;
        discount = veg_discount; 
        price = veg_price;
    }

    public String getVegitableName(){
        return veg_name;
    }
    public Double getVegetableWeight(){
        return veg_weight;
    }
    public float getVegetableDiscount(){
        return discount;
    }
    public int getVegetableCount(){
        return veg_count;
    }
    public float getVegetablePrice(){
        return price;
    }




class Bill{
    ArrayList <Vegetable> veg_li = new ArrayList<>();
    public Bill(ArrayList<Vegetable> veg_list){
        veg_li = veg_list;
    }

    public void displayBill(){

        String result;
        float final_price_veg;
        float discount_price;

        System.out.println( "| NAME | PRICE/QUNT | QUANTITY | FINAL PRICE |");
        for(int i = 0; i < veg_li.size(); i++){
            discount_price = veg_li.get(i).getVegetablePrice()*veg_li.get(i).getVegetableDiscount()/100;
            discount_price = veg_li.get(i).getVegetablePrice() - discount_price;  
            final_price_veg = discount_price*veg_li.get(i).getVegetableCount();

            result = Objects.requireNonNull("| " + veg_li.get(i).getVegitableName() + " | " + veg_li.get(i).getVegetablePrice() + " | " + veg_li.get(i).getVegetableWeight().toString() + veg_li.get(i).getVegetableCount() + " | " + final_price_veg + " |");

            System.out.println(result);
        }
    }
}






public class store{
    public static void main(String[] args){

        String client;
        ArrayList <Vegetable> veg_li = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("STORE INITIALIZE");

    }
}


    

    
    

}