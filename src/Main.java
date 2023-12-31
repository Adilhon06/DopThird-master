public class Main {
    public static void main(String[] args) {
        int[] array = {12, 32, -5, 7, 43, -24, 54};
        int once;
        boolean myBool = false;

        while (!myBool){
            myBool = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]){
                    once = array[i];
                    array[i] = array[i+1];
                    array[i+1] = once;
                    myBool = false;
                }
            }
            for (int i : array){
                System.out.print(i + " ");
            }
        }
    }
}