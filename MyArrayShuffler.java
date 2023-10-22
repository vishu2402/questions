import java.util.Random;

public class MyArrayShuffler {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7};
        shuffleArrayInPlace(original);

        System.out.print("Shuffled array: ");
        for (int element : original) {
            System.out.print(element + " ");
        }
    }

    public static void shuffleArrayInPlace(int[] arr) {
        int length = arr.length;
        Random rng = new Random();

        for (int i = length - 1; i > 0; i--) {
            int j = rng.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
