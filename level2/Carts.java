import java.util.Scanner;

public class Carts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(",");

        int[] arr = new int[input.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(answer(arr));
    }

    public static int answer(int[] x) {
        int sum = 0;

        for(int num : x){
            sum += num;
        }

        int len = x.length;
        if(sum % len == 0)
            return len;
        else
            return len - 1;
    }
}


