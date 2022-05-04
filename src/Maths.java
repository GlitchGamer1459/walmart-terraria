public class Maths {

    public static int rand(int max) { // prints between 0 and maximum
        return (int)Math.floor(Math.random() * (max + 1));
    }

    public static int[] heightMap(int startY, int length) {
        int[] arr = new int[length];

        arr[0] = startY;

        for (int i = 1; i < arr.length; i++) {
            int r = rand(10);
            if (r <= 2) {
                arr[i] = arr[i - 1] - 1;
            } else if (r <= 7) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] =  arr[i - 1] + 1;
            }
        }

        return arr;
    }
}
