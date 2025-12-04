public class CODE10
{
     public static void main(String[] args) {

        int[] arr = {5, 7, 9, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Index of first even: " + i);
                break;
            }
        }
    }
}