public class CODE13
{
     public static void main(String[] args) {

        int[] grades = {80, 70, 90, 60, 75};
        int pass = 0;
        int fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }

        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}