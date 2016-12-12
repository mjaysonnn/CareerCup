
public class MaxCounters 
{
    public static void main(String[] args)
    {
        int[] A={3,4,4,6,1,4,4};
        int B=5;
        System.out.println(solution(B,A));
    }
    public static int[] solution(int N, int[] A){
        int[] counters= new int[N];  // 1차원 배열 만들
        int min=Integer.MIN_VALUE;   //그
        int tmin=0;   //t가 뭔지 아나? total
        int length=A.length;   // 배열의길
        for(int i=0; i<length; i++)
        {   
            int index = A[i]-1;    //   A[0]=3 이면 배열에서는 0 1 2 에 속하기 때문이
            if(index==N)
            {      
                min=tmin;    //이건 모든 배열의 값이 max가 되는 경우임.    
            }
            else
            {
                if(counters[index]<min)   //초기화는 위에서 
                {
                    counters[index]=min;
                }
                
                ++counters[index];
                
                if(tmin<counters[index])
                {
                    tmin=counters[index];
                }
            }
        }
        for(int i=0; i<counters.length; i++)
        {
            if(counters[i]<min)
            {
                counters[i]=min;
            }
        }
        return counters;      
    }
}
