import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        System.out.println(Fib.fibOne(10));
        System.out.println(Fib.fibTwo(50));
        System.out.println(Fib.fibThree(120));
        ArrayList<Double> p= new ArrayList<>();

        for(double i=1.0d; i<101.0; i+=1.0d){
            p.add(i);
        }
        System.out.println(SeqStats.sequenceAvg(p));
        System.out.println(SeqStats.sequenceStandardDeviation(p));


        System.out.println("Primes:");
        ArrayList<Integer> myPrimes = PrimeNumbers.generatePrimes(10);
        for(var i:myPrimes){
            System.out.println(i);
        }
        System.out.println(Approximations.eApproximation(50));

        for(int i=1900; i<2021; i++){
            if(LeapYearCalculator.isLeapYear(i)){
                System.out.println(i);
            }
        }
    }

}