import java.util.Scanner;
import java.util.Random;
public class Game
{
	public static void main(String[] args) {
	   String k,m;
	   System.out.println("0 stands for stone,1 stands for paper and 2 stands for scissors");
	   System.out.println("enter your choice");
	   Scanner sc=new Scanner(System.in);
	  int c=sc.nextInt();
	  if(c==0){
         m="stone";
    }
    else if(c==1){
         m="paper";
    }
    else if (c==2){
         m="scissors";
    }
    else {
        m="tatti";
    }
    System.out.println("you have chosen "+m);
    
	Random rc=new Random();
    int r=rc.nextInt(3);
    
   if(r==0){
         k="stone";
    }
    else if(r==1){
         k="paper";
    }
    else if (r==2){
         k="scissors";
    }
    else{
        k="tatti";
    }
    System.out.println("computer has chosen "+k);
    boolean result=m.equals(k);
    if(result){
        System.out.println("match tie");
    }
    else if(k=="stone"&&m=="scissors"||k=="paper"&&m=="stone"|| k=="scissors"&&m=="paper"){
        System.out.println("you lose");
        
    }
    else if(m=="stone"&&k=="scissors"||m=="paper"&&k=="stone"||m=="scissors"&&k=="paper"){
         System.out.println("you win");
    }
    
    }
}