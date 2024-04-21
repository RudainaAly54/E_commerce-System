public class Elctronicproduct extends product {
protected String brand;
protected int warrantyPeriod;
public Elctronicproduct() {
}
public Elctronicproduct(String name,int productId,float price,String brand,int warrantyPeriod) {
    super(name,productId,price);
    this.brand=brand;
    this.warrantyPeriod=warrantyPeriod;
}
public void setbrand(String brand) {
    this.brand = brand;
}
public void setwarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod=Math.abs(warrantyPeriod);
}
public String getbrand() {
    return brand;
}
public int getwarrantyPeriod() {
    return warrantyPeriod;
}

}