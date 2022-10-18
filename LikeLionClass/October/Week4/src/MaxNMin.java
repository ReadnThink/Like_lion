
interface Compare{
    boolean doSomthing(int valueA, int valueB);
}
public class MaxNMin {
    private int getMaxorMin(int[] arr, Compare compare){ // callback
        int targetValue = arr[0];
        for(int i = 0; i < arr.length; i++){

            boolean isSth = compare.doSomthing(arr[i] , targetValue);
            // max인 경우 arr[i] > targetValue
            // min인 경우 arr[i] < targetValue
            if(isSth){
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr){
        return getMaxorMin(arr, new Compare() {
            @Override
            public boolean doSomthing(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr){
        return getMaxorMin(arr, new Compare() {
            @Override
            public boolean doSomthing(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};

        MaxNMin maxNMin = new MaxNMin();

       int maxResult = maxNMin.max(arr);
       int minResult = maxNMin.min(arr);
        System.out.println(maxResult);
        System.out.println(minResult);
    }
}
