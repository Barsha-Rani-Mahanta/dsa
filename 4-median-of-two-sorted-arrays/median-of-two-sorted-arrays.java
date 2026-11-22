class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] a = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                a[k++]=nums1[i++];
            }
            else{
                a[k++]=nums2[j++];
            }
        }
        while(i<n){
            a[k++]=nums1[i++];
        }
        while(j<m){
            a[k++]=nums2[j++];
        }
        int total = n+m;
        if(total%2 != 0){
            return a[total/2];
        }
        else{
            return ((a[total/2-1])+(a[total/2]))/2.0;
        }
    }
}