import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome testi icin bir sayi giriniz");
        int num  = scanner.nextInt();

        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome2(num));
        System.out.println(isPerfectNumber(num));
        System.out.println(numberToWords(num));
    }
    public static boolean isPalindrome (int num){


        num = Math.abs(num);
        String numS  = Integer.toString(num);
       char[] digits = numS.toCharArray();
       String reversed = "";
       for(int i = digits.length-1;i>=0;i-- ){
           reversed += digits[i];
       }
        return reversed.equals(String.valueOf(num));

    }

    public static boolean isPalindrome2(int num){
        num = Math.abs(num);
        int originalNumber = num;
        int reversedNumber = 0;

        while(num>0){
            int digit = num%10;
            reversedNumber = reversedNumber * 10 +digit;
            num = num/10;

        }
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber (int num ){
            if (num <=0){
                return false;
            }
            int perfectNumber = 0;
            for(int i = 1; i<num;i++){
                if(num%i == 0 ){
                    perfectNumber+= i ;
                    }

            }
        return perfectNumber == num;
    }

    public static String numberToWords (int num){
        if (num<0){
            return "Invalid Value";
        }

        String[] numbers = {"Zero","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eighth ","Nine "};
        char[] numChars =  String.valueOf(num).toCharArray();
        String words = "";
        for(char numChar: numChars){
            for (int i=0;i<numbers.length;i++){
                if (String.valueOf(numChar).equals(String.valueOf(i))){
                    words += numbers[i];

                }

            }

        }

        return words.trim();



    }

}