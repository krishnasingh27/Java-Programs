public class StarP8 {
    public static void main(String[] args) {
        int count = 2;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
    }
}
