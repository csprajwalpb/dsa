public class prime {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0) return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0){
                return false;
        }
    }
        return true;
    }
    

        public static void main(String[] args){
            int n=45;
            if(isPrime(n)){
                System.out.println(n+" is a prime number");
            } else {
                System.out.println(n+" is not a prime number");
            }
        }
    }
    //Time Complexity: O(sqrt(n))
