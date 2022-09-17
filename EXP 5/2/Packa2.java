package packageexe.pack2;
public class Packa2 {
public  void strings(String s)
{
    String s1=s;
    System.out.println( "First character in the String: "+s1.charAt(0));
    System.out.println("Length of the String: "+s1.length());
    System.out.println("String after replacing characters:"+s1.replace('a', 'e'));
    System.out.println("String in Lower case:"+s1.toLowerCase());
    System.out.println("String in Upper case:"+s1.toUpperCase());
}
}