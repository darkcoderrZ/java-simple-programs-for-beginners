import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 1;
        int t = sc.nextInt();
        while(t>0){
        String I = sc.next();
        String P = sc.next();
        int z = P.length()-I.length();
        if(I.length()<P.length()){
            for(int i = 0;i<I.length();i++){
                for(int j = 0;j<P.length();j++){
                if(I.charAt(i)!=P.charAt(j)){
                    System.out.println("Case #2: IMPOSSIBLE");
                    break;
                }
                else{
                    System.out.println("Case #"+k+": "+z);
                k++;
                    break;
                }
                
            }
            break;
            
            }
        }
        else if(I.length()==P.length()){
            if(I.equals(P)){
                System.out.println("0");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
        else if(I.length()>P.length()){
            System.out.println("IMPOSSIBLE");
        }
        t--;
        
        }
            
    }
}