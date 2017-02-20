
public class Main {
    public static boolean contains(int v, int[] vs) {
        if(vs.length == 0) {
            return false;
        }
        int left = 0, right=vs.length;
        while(left < right) {
            int mid = (left+right)/2;
            if(vs[mid] == v) {
                return true;
            } else if(vs[mid] > v) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int vs[] = {1,3,9,12,20,34,70,75,83};
        if(contains(21, vs)) {
            System.out.println("Contain.");
        } else {
            System.out.println("Not found.");
        }
    }
}