public class impquestion {

    public static int TrappedRainwater(int[] hieght){
        int n = hieght.length;
        if(n == 0) return 0;
        int leftmax[] = new int[n];
        leftmax[0] =hieght[0];
        for(int i=1;i<n;i++){
            leftmax[i]  = Math.max(hieght[i], leftmax[i-1]);
        }

        int rightmax[]= new int[n];
        rightmax[n-1]=hieght[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(hieght[i] ,rightmax[i+1]);
        }

        int trapwater = 0 ;
        for(int i =0 ;i<n;i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            
            trapwater += waterlevel - hieght[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};

        System.out.println("the total trap water is : " + TrappedRainwater(arr));

    }
}
