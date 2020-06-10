public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] input = {1,2,3,4,2, 2, 3};
        int k = 2;
        int frequency = kFrequency(input, k);
        System.out.println("frequency = " + frequency);
    }
    public static boolean kFind(int[] input, int k) {
        if (input == null)
            return false;
        for (int i = 0; i < input.length; i++) {
            if (k == input[i])
                return true;
        }
        return false;
    }
    public static int kFrequency(int[] input, int k) {
        int counter=0;
        if (input == null)
            return 0;
        for (int i = 0; i < input.length; i++) {
            if (k == input[i])
                counter++;
        }
        return counter;
    }
}
