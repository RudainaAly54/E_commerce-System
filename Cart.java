public class Cart{
    protected int customerid;
    protected int nproduct;
    protected product[] products;
    public Cart() {
    }
    public Cart(int customerid, int nproduct, product[] products) {
        this.customerid =Math.abs(customerid);
        this.nproduct = Math.abs(nproduct);
        this.products = new product[this.nproduct];
    }
    public void setCustomerid(int customerid) {

            this.customerid = Math.abs(customerid);

    }
    public int getCustomerid() {
        return customerid;
    }
    public void setNproduct(int nproduct) {

            this.nproduct = Math.abs(nproduct);
    }
    public int getNproduct() {
        return nproduct;
    }
    public void setProducts(product[] products) {
        this.products = products;
    }
    public product[] getProducts() {
        return products;
    }
    public void addproduct(product product){
for(int i=0;i<this.products.length;i++){
    if(this.products[i]==null){
        this.products[i]=product;
        break;

    }
}
    }
    public void removeproduct(product[] product) {
        System.out.println("order canceld");
    }
    public double calculateprice(){
        double totalprice=0;
        for(product product:products){
            if (product!=null){
                totalprice+=product.getPrice();
            }
        }
        return totalprice;
    }
    public void placeorder(int replace){
        if (replace==1){
        System.out.println("Here's your order's summary");
        } else if (replace==2) {
            System.out.println("Placement cancelled");
        }else{
            System.out.println("Sorry, that is not a vaild ,please answer with yes or no ");
        }
    }

}
