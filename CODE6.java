
public class CODE6
{
    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 10, 13};
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }

        System.out.println("Average of odd numbers: " + (sum / count));
    }
}