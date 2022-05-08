package largeWorld;

public class Maths {

    public static int rand(int min, int max) { // prints a random int between min and max
        int diff = Math.abs(Math.abs(max + 1) - Math.abs(min));

        int rand = (int)Math.floor(Math.random() * diff);

        return rand + min;
    }

    public static int[] heightMap(int startY, int length) {
        int[] arr = new int[length];

        arr[0] = startY;

        for (int i = 1; i < arr.length; i++) {
            int r = rand(0, 10);
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

    public static int[] newHeightMap(int startY, int length) {
        int[] arr = new int[length];
        int index = 1;

        arr[0] = startY;

        for (int i = 1; i < arr.length; i++) {
            int dur = rand(1, 4);
            int r = rand(0, 10);

            if (r <= 3) {
                arr[index] = arr[index - 1] - 1;
                index++;
                for (int o = 0; o < dur; o++) {
                    if (index >= length) {
                        return arr;
                    }
                    arr[index] = arr[index - 1];
                    index++;
                }
            } else if (r <= 6) {
                arr[index] = arr[index - 1];
                index++;
                for (int o = 0; o < dur; o++) {
                    if (index >= length) {
                        return arr;
                    }
                    arr[index] = arr[index - 1];
                    index++;
                }
            } else {
                arr[index] = arr[index - 1] + 1;
                index++;
                for (int o = 0; o < dur; o++) {
                    if (index >= length) {
                        return arr;
                    }
                    arr[index] = arr[index - 1];
                    index++;
                }
            }

            if (index >= length) {
                return arr;
            }
        }

        return arr;
    }
}
