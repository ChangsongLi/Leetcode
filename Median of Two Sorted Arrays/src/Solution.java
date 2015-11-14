public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = (nums1.length + nums2.length)/2;
        if(length == 0){
            if(nums1.length == 0){
                return nums2[0];
            }
            return nums1[0];
        }
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        int[]  ret = new int[2];
        while(index1 < nums1.length && index2 < nums2.length && count < length ){
            if(nums1[index1] > nums2[index2]){
                if(count == length - 1){
                    ret[0] = nums2[index2];
                }
                index2++;
            }else{
                if(count == length - 1){
                    ret[0] = nums1[index1];
                }
                index1++;
            }
            count++;
        }
        
        if(count == length){
            if(index1 == nums1.length){
                ret[1] = nums2[index2];
            }
            else if(index2 == nums2.length){
                ret[1] = nums1[index1];
            }
            else if(nums1[index1] > nums2[index2]){
                ret[1] = nums2[index2];
            }else{
                ret[1] = nums1[index1];
            }
        }else if(index1 == nums1.length){
            for(int i = count; i <= length; i++){
                if(i == length -1 ){
                    ret[0] = nums2[index2];
                }else if(i == length){
                    ret[1] = nums2[index2];
                }
                index2++;
            }
        }else if(index2 == nums2.length){
            for(int i = count; i <= length; i++){
                if(i == length -1 ){
                    ret[0] = nums1[index1];
                }else if(i == length){
                    ret[1] = nums1[index1];
                }
                index1++;
            }
        }
        if((nums1.length + nums2.length)%2 == 0){
            return (ret[1] + ret[0])/2.0;
        }else{
            return ret[1];
        }
    }
}