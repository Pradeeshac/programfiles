package packageexe;
import packagenew.proex;
public class Protectedmethodimpli extends proex {
    public static void main(String[] args) {
       Protectedmethodimpli p=new Protectedmethodimpli();
       System.out.println("Pattern in Protected Method:");
       p.display();
       try
       {
           p.defaultmethod();
       }
        catch(Exception e)
        {
            System.out.println(" Default method can't accessed outside the package");
           System.out.println(e);
        }
    }
    
}