import java.util.Scanner;
public class classexe {

      public static void main(String[] args) {
      Scanner o=new Scanner(System.in);
      System.out.println("Enter Author Details:");
      Author at=new Author(); 
      System.out.println("Enter Author Name:");
      at.name=o.next(); 
      System.out.println("Enter Emailid:");
      at.emailid=o.next();
      System.out.println("Enter Gender");
      at.gender=o.next().charAt(0);
      System.out.println("\nEnter Book Details:");
      System.out.println("Enter Book Name:");
       String bname=o.next();
       System.out.println("Enter Price :");
       Double price=o.nextDouble();
       System.out.println("Enter Quantity");
       int q=o.nextInt();
       System.out.println();
       Book ob=new Book(bname,at,price,q);
       System.out.println("------Book Details----");
        System.out.println(ob.getName());
        System.out.println(ob.getAuthor());
        System.out.println("Price:"+ob.getPrice());
        System.out.println("Quantity"+ob.getQty());
        System.out.println();
        System.out.println(ob);
        System.out.println();
        System.out.println("\nEnter the price to be changed:");
        double pc=o.nextDouble();
        ob.setPrice(pc);
        System.out.println("Enter the quantity to be changed:");
        int quan=o.nextInt();
        ob.setqty(quan);
        System.out.println();
        System.out.println(ob);
        
    }
    
}
class Book
{
    String bname;
    Author author=new Author();
    static double price;
    static int qty=0;
    Book(String bn,Author au,double p,int q)
            {
                bname=bn;
                author.name=au.name;
                author.emailid=au.emailid;
                author.gender=au.gender;
                price=p;
                qty=q;
            }
    public String getName()
    {
        return "Book No.: "+bname;
    }
    public String getAuthor()
    {
        return "Author: "+author.name+"\nEmail id: "+author.emailid+"\nGender: "+author.gender;
    }
    public Double getPrice()
    {
        return price;
    }
    public void setPrice(double value)
    {
        price=value;
    }
    public int getQty()
    {
        return qty;
    }
    int setQty()
    {
        return qty;
    }
    void setqty(int qu)
    {
        qty=qu;
    }
    public String toString()
    {
        return "\n-------------------------------------------\nBook Name:"+bname+"\n---Author Details---\n"+"Author name:"+author.name+"\nEmailid: "+author.emailid+"\nGender: "+author.gender+"\nPrice:"+price+"\nQuantity:"+qty;
    }
}
class Author
{
    String name;
    String emailid;
    char gender;
}