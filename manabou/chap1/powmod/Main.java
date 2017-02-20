import java.lang.*;

public class Main {
    public static int powmod(int a, int k, int m) {
        long ans=1;
        for(int i=0; i < k; i++) {
            ans = (ans*a) %m;
        }
        return (int)ans;
    }

    public static int powmod2(int a, int k, int m) {
        if(k == 0)
            return 1;

        long t = powmod2(a, k/2, m);
        t = (t*t) % m;
        if(k % 2 == 1)
            t = (t*a) % m;

        return (int)t;
    }

    public static void main(String args[]) {
        int ans = powmod2(3, Integer.MAX_VALUE, 10000);
        System.out.println(ans);
    }
}