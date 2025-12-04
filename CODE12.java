public class CODE12
{
     public static void main(String[] args) {

        int[] arr = {5, 2, 5, 7, 5, 9};
        int target = 5;
        int count = 0;

        for (int num : arr) {
            if (num == target) count++;
        }

        if (count >= 3)
            System.out.println(target + " appears at least 3 times");
        else
            System.out.println(target + " does not appear 3 times");
    }
}