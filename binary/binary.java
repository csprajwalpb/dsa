public class binary {
    public static void main(String[] args) {
        String binary = "1011"; 

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal: " + decimal);
    }
}
//Time Complexity: O(n) where n is the length of the binary string