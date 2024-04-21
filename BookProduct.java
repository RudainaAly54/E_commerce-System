public class BookProduct extends product{
    protected String author;
    protected String publisher;
    public BookProduct() {
    }
    public BookProduct(String name,int productId,float price,String author,String publisher) {
        super(name,productId,price);
        this.author=author;
        this.publisher=publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
}
