public class max {
    static int maxi(int A[]){
        int ma=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>ma){
                ma=A[i];
            }
        }
        return ma;
    }

    public static void main(String[] args) {
        int m;
        int A[]={2,5,8,7,1};
        m=maxi(A);
        System.out.println(m);
    }
}
