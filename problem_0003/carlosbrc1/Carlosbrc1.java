public class Carlosbrc1 {
    /*
        summary = check if a number is palindrome
        args = a integer number
        return = boolean true if is palindrome else false
     */
    public static boolean isPalindrome(int numero) {
        // convert in string number for to can invert it
        String str = Integer.toString(numero);
        
        // invert string
        String rts = new StringBuilder(str).reverse().toString();

        // return the compare between 
        return str.equals(rts);
    }
    public static void main(String[] args) {
        System.out.print(esPalindromo(121));
    }
}