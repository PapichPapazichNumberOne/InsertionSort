public class Main {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        new insertionSort1(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            //System.out.print(sortArr[i] + "\n");
            insertionSort1 insertionSort1 = new insertionSort1(sortArr);
            insertionSort1.insertionSort2(sortArr);
            System.out.println(sortArr[i]);

        }
    }
    }
