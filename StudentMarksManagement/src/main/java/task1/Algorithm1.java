package task1;

public class Algorithm1 {
    /**
     * @Author :
     * @Date : 27 Aug 2022
     *
     * """
     * This algorithm will take an input array and will search
     * the max or min element based on the parameter and return it.
     * This is Famous Linear Search Algorithm
     * TC : O(n)
     * SC : O(1)
     * """
     */

    public static Double search(Double[] arr,Boolean searchHighestMark){
        if(arr.length<1)return null;
        Double result = arr[0];
        if(searchHighestMark){
            for (Double score:arr){
                result = Math.max(result,score);
            }
        }else{
            for (Double score:arr){
                result = Math.min(result,score);
            }
        }
        return result;
    }
}
