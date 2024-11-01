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
    public Integer getVegetableCount(){
        return veg_count;
    }
    public float getVegetablePrice(){
        return price;
    }

    public void changePrice(float new_price){
        price = new_price;
    }
    public void changeDiscount(float new_discount){
        discount = new_discount;
    }

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
            
            if(veg_li.get(i).getVegetableCount() == null){
                final_price_veg = discount_price*veg_li.get(i).getVegetableWeight().floatValue();
            }else{
                final_price_veg = discount_price*veg_li.get(i).getVegetableCount().floatValue();
            } 
            

            result = Objects.requireNonNull("| " + veg_li.get(i).getVegitableName() + " | " + veg_li.get(i).getVegetablePrice() + " | " + veg_li.get(i).getVegetableWeight().toString() + veg_li.get(i).getVegetableCount() + " | " + final_price_veg + " |");

            System.out.println(result);
        }
    }
}

class StockListing{
    protected String veg_name;
    protected float veg_amount;

    public StockListing(String vegetable_name, float amount){
        veg_name = vegetable_name;
        veg_amount = amount;
    }

    public String getVegetableName(){
        return veg_name;
    }
    public float getVegetableamount(){
        return veg_amount;
    }
}

class Stock{

    
    ArrayList <StockListing> stock_li = new ArrayList<>();
    
    public void addStock(StockListing stock_listing){
        stock_li.add(stock_listing);
    }
}






public class store{
    public static void main(String[] args){

        

        Scanner sc = new Scanner(System.in);
        System.out.println("STORE MENU");
        System.out.println("[1] STOCK");
        System.out.println("[2] BILL");

        int input_menu = sc.nextInt();

        int stock_input = 0;
        int bill_input = 0;

        if(input_menu == 1){
            System.out.println("STOCK");
            System.out.println("[1] ADD STOCK");
            System.out.println("[2] REMOVE STOCK");
            System.out.println("[3] DISPLAY STOCK");

            stock_input = sc.nextInt();
        }

        if(input_menu == 2){

            String vegetable_name;
            Double amount;
            float price;
            float discount;

            ArrayList <Vegetable> veg_li = new ArrayList<>();
            while (bill_input != 4){
                
                System.out.println("BILL");
                System.out.println("[1] ADD ITEM");
                System.out.println("[2] REMOVE ITEM");
                System.out.println("[3] DISPLAY BILL");
                System.out.println("[4] PRINT BILL");
                
                bill_input = sc.nextInt();

                if(bill_input == 1){
                    
                    System.out.println("ENTER VEGETABLE NAME: ");
                    vegetable_name = sc.nextLine();

                    System.out.println("ENTER VEGETABLE AMOUNT: ");
                    amount = sc.nextDouble();

                    System.out.println("ENTER VEGETABLE PRICE: ");
                    price = sc.nextFloat();

                    System.out.println("ENTER VEGETABLE DISCOUNT: ");
                    discount = sc.nextFloat();

                    Vegetable veg = new Vegetable(vegetable_name, amount, price, discount); 
                    

                }
            }
        }

        

    }
}


    

    
    

