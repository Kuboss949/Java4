import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fib {
    public static long fibOne(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibOne(n-1)+fibOne(n-2);
        }
    }

    static Map<Integer, Long> fibMap = new HashMap<>();

    public static long fibTwo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            if(fibMap.containsKey(n)){
                return fibMap.get(n);
            }else{
                Long result = fibTwo(n-1)+fibTwo(n-2);
                fibMap.put(n, result);
                return result;
            }
        }
    }

    static Map<Integer, BigInteger> fibMap2 = new HashMap<>();

    public static BigInteger fibThree(int n){
        if(n==0){
            return BigInteger.ZERO;
        }else if(n==1){
            return BigInteger.ONE;
        }else{
            if(fibMap2.containsKey(n)){
                return fibMap2.get(n);
            }else{
                BigInteger result = fibThree(n-1).add(fibThree(n-2));
                fibMap2.put(n, result);
                return result;
            }
        }
    }
}
