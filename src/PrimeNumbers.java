import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class PrimeNumbers {
    static boolean isPrime(int p){
        for(int i=2; i<=sqrt(p); i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    static ArrayList<Integer> generatePrimes(int n){
        ArrayList<Integer> primes = new ArrayList<>();
        int candidate=2;
        while(primes.size()<n){
            if(isPrime(candidate)){
                primes.add(candidate);
            }
            candidate++;
        }
        return primes;
    }
}
