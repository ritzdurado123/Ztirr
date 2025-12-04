
public class CODE2
{
     public static void main(String[] args) {
         int counter = 0;
     int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7,};

        for(int x : arr){
            if(x ==7){
                counter++;
            }  
        }
        System.out.print("This is how many times the number 7 appeared" + " " + counter);
    }
}