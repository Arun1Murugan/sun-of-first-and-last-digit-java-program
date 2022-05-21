public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int sumOfFirstAndLastDigit = sumFirstLast(134);
        if(sumOfFirstAndLastDigit == -1){
            System.out.println("Invalid");
        }else{
            System.out.println("Sum of first and last digit is "+sumOfFirstAndLastDigit);
        }
        System.out.println(123 % 10);
        System.out.println(123 / 10);
    }
    public static int sumFirstLast(int number){
        int sum;
        if(number == 0){
            return -1;
        }else{
            int firstDigit = number / 100;
            int lastDigit = number % 10;
            sum = firstDigit + lastDigit;
            return sum;
        }
    }
}