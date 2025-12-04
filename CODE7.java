

public class CODE7
{
    public static void main(String[] args) {

        int[] arr = {-5, 3, -9, 2};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = -arr[i];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}