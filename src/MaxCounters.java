
public class MaxCounters {
    public int[] solution(int N, int[] A){
        int[] counters= new int[N];
        int min=Integer.MIN_VALUE;
        int tmin=0;
        int length=A.length;
        for(int i=0; i<length; i++){
            int index = A[i]-1;
            if(index==N){
                min=tmin;
            }
            else{
                if(counters[index]<min){
                    counters[index]=min;
                }
                ++counters[index];
                if(tmin<counters[index]){
                    tmin=counters[index];
                }
            }
        }
        for(int i=0; i<counters.length; i++){
            if(counters[i]<min){
                counters[i]=min;
            }
        }
        return counters;
        
    }
}
