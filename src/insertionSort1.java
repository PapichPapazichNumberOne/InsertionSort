public class insertionSort1 {
    public insertionSort1(int[] sortArr) {
    }

    public  void insertionSort2(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}
