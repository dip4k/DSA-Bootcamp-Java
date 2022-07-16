/*
Here's a rephrasing that may help others like it helped me:

2 is the only even number that is prime, the rest of all possible prime numbers are odd
Half of the numbers up to n are even and half are odd
Therefore instead of finding all prime numbers (like the Sieve of Eratosthenes does) we can do the opposite: we can assume all odd numbers up to n are primes then iterate through and modify our count when we encounter odd values that aren't actually prime. The logic is as follows:

Initialize our count of the prime numbers to n / 2 (the number of odd numbers up to n)
For every odd value of i from 3 to the square root of n (increment logic: odd + even = odd)
For every odd value of j from i^2 to n (increment logic: (odd * odd) + (even * odd) = odd)
If we haven't seen this value of j before then it represents a value that is a composite of others (i.e. it is not a prime) so decrement our count of primes
For example when n = 25 then our count of primes is initialized to 12 and will be decremented 3 times giving us the expected result of 9. If you examine the boolean[] used to keep track of the non-prime values then you'll find that the indexes at 9, 15, 21 are set to true while the rest are false.

It is also possible to deduce what prime numbers were calculated based on the this array by walking up from 3 and only including an odd number in your list of prime numbers when the corresponding position in your boolean[] is false. Proof: the primes for n = 25 are 2, 3, 5, 7, 11, 13, 17, 19, 23 which you can tell are just all the odd numbers from 3 to 25 excluding 9, 15 and 21.
*/

var countPrimes = function(n) {
    if(n<3) return 0;
    var notPrimes = Array(n).fill(false);
    let cnt = parseInt(n/2);
    for(let i = 3;i*i<n; i+=2){
        if(notPrimes[i]) continue;
        for(let j = i*i;j<n;j+=2*i){
            if(!notPrimes[j]){
                cnt--;
                notPrimes[j] = true;
            }
        }
    }
    return cnt;
};

console.log(countPrimes(1000));