
public class CODE5
{
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 11};
        int target = 7;

        for (int num : arr) {
            if (num == target) {
                System.out.println("Found: " + target);
                break;
            }
        }
    }
}