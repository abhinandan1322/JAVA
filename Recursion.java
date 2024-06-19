import java.util.Scanner;

public class reccursion2 {
    public static int cal_fact(int n){

        if(n==0 || n==1){
            return 1;
        }
        int fact = cal_fact(n-1);
        int fact1 = n * fact; 
        return fact1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        int ans = cal_fact(n);
        System.out.println(ans);
    }
}
