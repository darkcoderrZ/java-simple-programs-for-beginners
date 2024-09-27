import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        String C = A.toUpperCase();
        String D = B.toUpperCase();
        if(A.length()>=B.length()){
               for(int i = 0;i<B.length();i++){
                   if(C.charAt(i)>D.charAt(i)){
                       System.out.println("Yes");
                       break;
                   }
                   else if(C.charAt(i)==D.charAt(i)){
                       continue;
                   }
                   else{
                       System.out.println("No");
                       break;
                   }
               }
            }
       else{
           for(int i = 0;i<A.length();i++){
                if(C.charAt(i)>D.charAt(i)){
                    System.out.println("yes");
                    break;
                }
                else if(C.charAt(i)==D.charAt(i)){
                    continue;
                }
                else{
                    System.out.println("no");
                }
            }
       }
       String E = A.substring(0, 1).toUpperCase() + A.substring(1);
       String F = B.substring(0, 1).toUpperCase() + B.substring(1);
       System.out.print(E+" ");
       System.out.println(F);
    }
}



