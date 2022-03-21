public class trycatch {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("exception " + e);
        } finally {
            System.out.println("finalize block");
        }

    }

}
