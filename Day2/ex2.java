public class ex2 {
    public static void main(String[] args) {
        int n = 10;
        int ans = recur(n);

        System.out.println(ans);
    }
    public static int recur(int n){
        if(n == 0) return 0;
        return n%10 + recur(n/10);
        
    }
}
