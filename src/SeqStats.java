import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SeqStats {
    static public double sequenceAvg(ArrayList<Double> sequence){
        double sum=0;
        for(var i:sequence){
            sum+=i;
        }
        return sum/sequence.size();
    }

    static public double sequenceStandardDeviation(ArrayList<Double> sequence){
        double avg = sequenceAvg(sequence);
        double sum=0;
        for(var i:sequence){
            sum+=pow(i-avg, 2);
        }
        return sqrt(sum/sequence.size());
    }
}
