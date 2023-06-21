public class Approximations {
    static long factorial(long n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    static double eApproximation(int n){
        double e = 0;
        for (int i=0; i<n;i++){
            e+=1.0d/factorial(i);
        }
        return e;
    }
}
