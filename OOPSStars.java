public class OOPSStars {
    public static void main(String[] args) {
        int n = 7; // size for each letter
        for (int row = 0; row < n; row++) {
            // Letter O
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Second O
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter P
            for (int col = 0; col < n; col++) {
                if (col == 0 || (row == 0 && col < n - 1) || (row == n/2 && col < n - 1) || (col == n - 1 && row > 0 && row < n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            // Letter S
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n/2 || row == n - 1)
                    System.out.print("* ");
                else if (col == 0 && row > 0 && row < n/2)
                    System.out.print("* ");
                else if (col == n - 1 && row > n/2 && row < n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
