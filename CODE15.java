import java.util.Scanner;

public class CODE15
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers > 50:");
        for (int num : arr) {
            if (num > 50) System.out.println(num);
        }
    }
}