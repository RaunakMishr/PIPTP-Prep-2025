public class PC5 {
    public static void main(String[] args) {
        funn(3,5);
    }
    public static void funn(int a, int b){
        int c;
        for(c = 2; c <=4; c++){
            if(a%2 < b%3){
                a = 4%3;
            }else{
                if(5%3 > b){
                    a = b;
                }
                b = 1;
            }
        }
        System.out.println(a+b);
    }
}
