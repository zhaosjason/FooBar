import java.util.*;

public class Rabbit {   
	private static String alphabet = " abcdefghijklmnopqrstuvwxyz";

    public static String[] answer(String[] names) { 
        for(int i = 0; i < names.length; i++){
        	for(int j = 0; j < names.length - 1; j++){
        		if(strcmp(names[j], names[j + 1]) == -1){
        			String tempName = names[j];
        			names[j] = names[j + 1];
        			names[j + 1] = tempName;
        		}
        	}
        }

        return names;
    } 

    private static int strcmp(String str1, String str2){
    	int sum1 = 0;
    	int sum2 = 0;

    	for(int i = 0; i < str1.length(); i++){
    		sum1 += alphabet.indexOf(str1.charAt(i));
    	}

    	for(int i = 0; i < str2.length(); i++){
    		sum2 += alphabet.indexOf(str2.charAt(i));
    	}

    	if(sum1 > sum2)
    		return 1;
    	else if(sum1 < sum2)
    		return -1;

        int len1 = str1.length();
        int len2 = str2.length();
    	int len = (len1 < len2) ? len1 : len2;
    	for(int i = 0; i < len; i++){
    		if(alphabet.indexOf(str1.charAt(i)) > alphabet.indexOf(str2.charAt(i)))
    			return 1;
            else if(alphabet.indexOf(str1.charAt(i)) < alphabet.indexOf(str2.charAt(i)))
                return -1;
    	}

    	if(len1 == len2)
    		return 0;
    	
    	return (len1 < len2) ? -1 : 1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] ans = answer(in.nextLine().split(","));
        for(String str : ans)
            System.out.println(str);
    }
}