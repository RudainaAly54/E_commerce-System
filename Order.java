public class Order {
    protected  float totalPrice;
    protected int customerId;
    protected int orderId;
    protected product[] products;
    public Order(){
    }
    public Order(int customerId, int orderId, product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this. products= products;
        this.totalPrice=Math.abs(totalPrice);
    }
public void setcustomerId(int customerId){
        this.customerId=Math.abs(customerId);
}
public void setorderId(int orderId){
        this.orderId=Math.abs(orderId);
}
public void setproducts(product[] products){
        this.products=products;
}
public void settotalPrice(float totalPrice){
        this.totalPrice=Math.abs(totalPrice);
}
public int getcustomerId(){
        return Math.abs(customerId);
}
public int getorderId(){
        return Math.abs(orderId);
}
public product[] getproducts(){
        return products;
}
public Object printOrderInfo(){
        System.out.println("Customer ID: "+customerId);
        System.out.println("Order ID: "+orderId);
        System.out.println("Products:");
        for(product product:products){
            System.out.println("-"+product.getName()+"-"+product.getPrice()+"$");
        }
        System.out.println("Total Price: "+totalPrice+"$");
    return true;
}
}
