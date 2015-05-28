import java.util.Scanner;

public class Answer {
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


/*

15,7,2,3,5,9,0,0,1   => 42%9 = 42 - 36 = 6  => 3
                        42%8 = 2  => 7
                        42%7 = 0  => 9
5 ,5,2,5,5,5,5,5,5   => 8


10,7,2,3,5,9,2,2,2

*/
