public class fullpyramid {
    public static void main(String[] args) {
        int count = 3;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i + j >= 3 && i + j <= count && i <= 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            count = count + 2;
        }

    }

}
