public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) System.out.println(i + " is prime");
            else System.out.println(i + " is not prime");
        }
    }

    public static boolean isPrime(int num){
        if(num <=1) return false;
        
        int c = 2;

        while (c * c <= num) {
            if(num % c ==0) return false;
            c++;
        }

        return c*c>num;
    }
}
