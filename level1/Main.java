public class Main{
    
    /**
     * Returns base b in which the integer n is a palindrome 
    **/
    public static int answer(int n) { 
        for(int i = 2; i <= 26; i++){
            if(isPalindrome(toBaseB(n, i)))
                return i;
        }

        return -1;
    }
    
    /**
     * Returns true if str is a palindrome
    **/
    private static boolean isPalindrome(String str){
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1))
                return false;
        }
        
        return true;
    }
    
    /**
     * Only converts up to base 26.  Add values to dict to increase # of bases
    **/
    private static String toBaseB(int num, int base){
        String dict = "0123456789abcdefghijklmnopqrstuvwxyz";
        
        String str = "";
        int temp = num % base;
        while(num != 0){
            str = dict.charAt(temp) + str;
            num = num / base;
            temp = num % base;
        }
        
        return str;
    }
}