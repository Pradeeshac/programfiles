package lab;
import java.util.*;
public class searching {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Type: Integer
        Integer num[]={1,10,100,2,20,200,3,30,300,4,40,400};
        search<Integer> obj1=new search<>(num);
        System.out.println("Enter an Integer to search:");
        Integer n=scan.nextInt();
        obj1.comparing(n);
        
        //Type: Double
        Double dou1[]={1.2,2.2,3.2,4.2,1.3,3.3,1.5,2.5,5.2,2.0};
        search<Double> obj2=new search<>(dou1);
        System.out.println("Enter an Double value to search:");
        Double d=scan.nextDouble();
        obj2.comparing(d);
       
        //Type: Float
        Float fl1[]={1.1f,2.1f,3.1f,4.1f,3.2f,5.3f,5.1f,1.5f,2.8f,2.9f};
        search<Float> obj5=new search<>(fl1);
        System.out.println("Enter a Float value to search:");
        Float f=scan.nextFloat();
        obj5.comparing(f);
        
        //Type: String
        String list[]={"tamil","english","hindi","telugu","malayalam","french"};
        search<String> obj3=new search<>(list);
        System.out.println("Enter a String to search:");
        String s=scan.next();
        obj3.comparing(s);
        
        //Type: Character
        Character ch[]={'m','e','n','a','g','a','r'};
        search<Character> obj4=new search<>(ch);
        System.out.println("Enter a Character to search:");
        Character c=scan.next().charAt(0);
        obj4.comparing(c);
    }
}
class search<T>
{
    T[] array;
    search(T[] array)
    {
        this.array=array;
    }
    public void comparing(T a)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i].equals(a))
            {
                int pos=i+1;
                System.out.println("The element "+a+" is found at  "+pos+"position  of the array");
            }
        }
    }
}
