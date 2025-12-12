public class sum{
    public static void main(String[] args){
        int num = 123456;
        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
//Time Complexity: O(n), where n is the number of digits in the number.