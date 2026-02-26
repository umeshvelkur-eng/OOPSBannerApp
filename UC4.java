public class UC4 {

    public static void main(String[] args) {

        // Banner stored in String Array
        String[] banner = {
            "*******  *******  ******   *******",
            "*     *  *     *  *     *  *      ",
            "*     *  *     *  ******   *******",
            "*     *  *     *  *              *",
            "*******  *******  *        *******"
        };

        // Loop to print banner
        for(String line : banner) {
            System.out.println(line);
        }
    }
}
