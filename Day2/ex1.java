import java.util.*;
class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
    public static int fact(int n){
        if(n <= 1) return n;
        if(n%2 == 0){
            return( n+fact(n/2));
        }else{
            return(fact((n+1)/2)+fact((n-1)/2));
        }

    }
}