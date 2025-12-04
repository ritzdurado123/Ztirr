public class CODE17
{
    public static void main(String[] args) {

        int[] arr = {10, 50, 40, 20, 30};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        }

        System.out.println("Second highest: " + second);
    }
}