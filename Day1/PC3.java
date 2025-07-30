public class PC3 {
    public static void main(String[] args) {
        int ans = funn(8, 8);
        System.out.println(ans);
    }
    public static int funn(int a, int b){
        if((a!= 0) && (b!= 0) && a+b>0){
            return a+funn(a-2, b-2)+b;
        }return a^b;
    }
}
