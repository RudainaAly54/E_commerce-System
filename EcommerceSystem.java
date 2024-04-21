
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to E-commerce System ");
        product p = new product();
        Customer cus = new Customer();
        System.out.print("Enter your name: ");
        String name = s.next();
        cus.setCustomerName(name);
        s.nextLine();
        System.out.print("Enter your ID: ");
        int customerID = s.nextInt();
        cus.setCustomerId(customerID);
        System.out.print("Enter your address: ");
        String customerAddress = s.next();
        s.nextLine();
        cus.setCustomerAddress(customerAddress);

        Cart cart = new Cart();
        cart.setCustomerid(customerID);
        System.out.print("How many products you want to add?: ");
        int nproduct = s.nextInt();
        cart.setNproduct(nproduct);
        product[] products = new product[nproduct];
        for (int i = 0; i < nproduct; i++) {
            System.out.print("which product you would like to add?:1-Laptop,2-Hoody,3-The silent patient: ");
            int productID = s.nextInt();
            if (productID == 1) {
                products[i] = new Elctronicproduct("Laptop", 1, 599.9F, "Lenovo", 1);
            } else if (productID == 2) {
                products[i] = new ClothingProduct("Hoody", 2, 19.99F, "Medium", "Cotton");
            } else if (productID == 3) {
                products[i] = new BookProduct("The silent patient", 3, 39.99F, "Alex Michaelides", "Celadon Books");
            } else {
                System.out.println("Invalid product, please enter 1 or 2 or 3 ");
                i--;
            }
            p.setProductId(productID);

        }
        cart.setProducts(products);
        System.out.print("your total is " + cart.calculateprice() + "$ Would you like to place the order? 1-yes,2-no: ");
        int place = s.nextInt();
        Order O = new Order();
        O.setorderId(1);
        O.setcustomerId(cus.getCustomerId());
        O.setproducts(cart.getProducts());
         if(place == 1) {
             cart.placeorder(place);
         } else if (place==2) {
            cart.removeproduct(products);
         }else{
             System.out.println("Invalid order, please enter 1 or 2  ");
         }

    }
}