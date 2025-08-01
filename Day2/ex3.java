import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = fun(x, y);
        sc.close();
        System.out.println(ans);
    }
    public static int fun(int x, int y){
        if(y == 0 || y == x){
            return 1;
        }
        return fun(x-1,y) + fun(x-1,y-1);
    }
}
