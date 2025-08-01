public class ex5 {
    public static void main(String[] args) {
        recur(5);
    }
    public static void recur(int n){
        if(n == 0) return;
        recur(n-1);
        System.out.print(n+" ");
        recur(n-1);
        
    }
}
