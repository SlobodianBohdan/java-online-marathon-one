class MyUtils {
    // Code

    public static void arrSort(int[][] arr) {
        // Code
        Arrays.sort(arr, (int1, int2) -> {

            if (int1.length == 1) {
                int value = int1[0];
                int1 = new int[2];
                int1[0] = value;
                int1[1] = 0;
            }else if (int1.length == 0) {
                return 1;
            }
            if (int2.length == 1) {
                int value1 = int2[0];
                int2 = new int[2];
                int2[0] = value1;
                int2[1] = 0;
            }else if (int2.length == 0) {
                return -1;
            }
            if (int1[0] > int2[0]) {
                return -1;
            }
            if (int2[0] == int1[0]) {
                return Integer.valueOf(int1[1]).compareTo(int2[1]);
            } else
                return 1;
        });

    }
}
