import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            System.out.println(sqrt(x));
        }
    }

    public static int sqrt(int x) {
        if (x == 1)
            return 1;
        int low = 0, high = x;
        int mid = 0;
        int result = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if( mid <= x/mid ){
                result = mid;
                break;
            }else{
                high = mid;
            }
        }
        return result;
    }
}
