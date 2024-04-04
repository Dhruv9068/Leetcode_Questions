package Leetcode_questions;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] a = {2,9,31,-4,21,7};
        int[] b = {5};
        System.out.println(Maxsum(a,3));
        System.out.println(Maxsum(b,1));
    }
    static int Maxsum(int[] a, int k){
        int Wsum=0 , Msum= Integer.MIN_VALUE;
        for(int i =0; i<k;i++){
            Wsum+=a[i];
        }
        Msum = Wsum;
        for (int i =k; i<a.length;i++){
            Wsum = Wsum -a[i-k]+ a[i];
            Msum = Math.max(Msum,Wsum);
        }

        return Msum;
    }
}

