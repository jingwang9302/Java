import java.util.Scanner;
public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter count:");
        int count = sc.nextInt();
        sc.nextLine();

        int[] returnedArr = readIntegers(count);
        int returnedMin = findMin(returnedArr);

        System.out.println("min = " + returnedMin);

    }
    public static int[] readIntegers(int count){

        int[] result = new int[count];
        for(int i = 0; i < count; i++){
            System.out.println("Enter a number: ");
            result[i] = sc.nextInt();
            sc.nextLine();
        }
        return result;

    }

    public static int findMin(int[] arr){
        int min  = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
