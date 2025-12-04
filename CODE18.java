public class CODE18
{
    public static void main(String[] args) {

        int[] arr = {3, 6, 3, 8};
        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }

        System.out.println("Has duplicates? " + duplicate);
    }
}