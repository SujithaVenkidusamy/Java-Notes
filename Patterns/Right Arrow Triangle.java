import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
