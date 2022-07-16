/*https://leetcode.com/problems/count-primes/submissions/
 * 
 * https://www.tutorialcup.com/leetcode-solutions/count-primes-leetcode-solutions.htm
 * 
 * https://www.geeksforgeeks.org/sieve-eratosthenes-0n-time-complexity/#:~:text=The%20classical%20Sieve%20of%20Eratosthenes,prime%20numbers%20less%20than%20N.
 * 
 * https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 * 
 * https://leetcode.com/problems/count-primes/discuss/57593/12-ms-Java-solution-modified-from-the-hint-method-beats-99.95
 * 
 */

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(500000));
    }

    public static int countPrimes(int N) {
        if(N < 3)
            return 0;
        return sieve(N);
    }
    
    public static int sieve(int N)
    {
        if(N < 3)
            return 0;
        int cnt = 0;
        boolean[] prime= new boolean[N];
        for(int i = 2 ; i < N ; i++)
            prime[i] = true;
        for(int i = 2 ; i * i < N ; i++)
        {
            if(prime[i])
                for(int j = i * i ; j < N ; j += i)
                    prime[j] = false;
        }
        for(int i = 2 ; i < N ; i++)
            if(prime[i])
                cnt++;
        return cnt;
    }
}
