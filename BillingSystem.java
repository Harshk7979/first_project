import java.util.ArrayList;
import java.util.Scanner;

class Product{
   private String pname;
   private int qty;
   private double price;
   private double totalprice;
    //constructor
    Product(String pname,int qty,double price,double totalprice)
    {
        this.pname=pname;
        this.qty=qty;
        this.price=price;
        this.totalprice=totalprice;
    }
    //method 
    public static void displayFormat()
    {
        System.out.println("\nName      Quantity    price   Totalprice\n");
        
    }
    public  void display()
    {
        System.out.format("%-9s %8d %10.2f %10.2f\n",pname,qty,price,totalprice);
    }
}
public class BillingSystem{
    public static void main(String[] args) {
        String productname=null;
        int quantity=0;
        double price=0.0;
        double totalprice=0.0;
        double overallprice=0.0;
        char choice='\0' ;
        Scanner sc = new Scanner(System.in)   ;
        ArrayList<Product> product = new ArrayList<Product>();

        do{
            System.out.print("----------Enter product details----------\n");
            System.out.print("ProductName:");
            productname = sc.nextLine();
            System.out.print("Quantity:");
            quantity=sc.nextInt();
            System.out.print("Price(per item):");
            price=sc.nextDouble();
            totalprice=price*quantity;
            overallprice+=totalprice;
            product.add(new Product(productname, quantity, price, totalprice));
            System.out.println("want to add more item?(y or n):");
            choice= sc.next().charAt(0);
            sc.nextLine();
        }while(choice=='Y'||choice=='y');
        Product.displayFormat();
        for(Product p:product){
            p.display();
        }
        System.out.println("\nOverall price="+overallprice);
        sc.close();

    }
}

