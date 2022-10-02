package task1;

public class Algorithm2 {

    /**
     * @Author :
     * @Date : 27 Aug 2022
     *
     * """
     * This algorithm will take an input array and will return
     * mean and standard deviation of the given data.
     * """
     *
     */

    public static Double CalculateMean(Double[] arr){

         /**
          * Mean is just a fancy term of avg, so we are calculating avg here
          * Mean = SUM(all the element)/length(arr)
         * */
        Double sum = 0.0;
        for (Double val : arr) {
            sum += val;
        }
        Double mean = sum / arr.length;
        return mean;
    }

    public static Double calculateSampleStandardDeviation(Double[] arr){
        /**
         * The Formula for sample standard deviation is
         * Sample SD = Sqrt(SUM((arr[i]-mean)^2)/(arr.length-1))
         * */
        Double mean = CalculateMean(arr);
        Double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            Double sqr = Math.pow((arr[i] - mean), 2);
            sum += sqr;
        }

        Double standardDeviation = Math.sqrt(sum / (arr.length-1));
        return standardDeviation;
        }


    public static Double calculatePopulationStandardDeviation(Double[] arr){
        /**
         * The Formula for Population standard deviation is
         * Population SD = Sqrt(SUM((arr[i]-mean)^2)/(arr.length))
         * */
        Double mean = CalculateMean(arr);
        Double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            Double sqr = Math.pow((arr[i] - mean), 2);
            sum += sqr;
        }

        Double standardDeviation = Math.sqrt(sum / (arr.length));
        return standardDeviation;
    }

}
