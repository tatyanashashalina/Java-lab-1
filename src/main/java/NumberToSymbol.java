import java.util.Scanner;

public class NumberToSymbol {

    static String[][] numbers = {{"  ***    ",
                                  " *   *   ",
                                  "*     *  ",
                                  "*     *  ",
                                  "*     *  ",
                                  " *   *   ",
                                  "  ***    "}, {
                                  "    *    ",
                                  "   **    ",
                                  " *  *    ",
                                  "    *    ",
                                  "    *    ",
                                  "    *    ",
                                  "   ***   "}, {
                                  " ***     ",
                                  "*    *   ",
                                  "*   *    ",
                                  "   *     ",
                                  "  *      ",
                                  " *       ",
                                  "*****    "}, {
                                  " ***     ",
                                  "*    *   ",
                                  "    *    ",
                                  "  *      ",
                                  "    *    ",
                                  "*     *  ",
                                  "  ***    "}, {
                                  "   *     ",
                                  "  **     ",
                                  " * *     ",
                                  "*  *     ",
                                  "******   ",
                                  "   *     ",
                                  "   *     "}, {
                                  "******   ",
                                  "*        ",
                                  "****     ",
                                  "     *   ",
                                  "      *  ",
                                  "*    *   ",
                                  "  ***    "}, {
                                  "  ***    ",
                                  " *       ",
                                  " *       ",
                                  "****     ",
                                  "*   *    ",
                                  "*   *    ",
                                  " ***     "}, {
                                  " ******  ",
                                  "     *   ",
                                  "    *    ",
                                  "   *     ",
                                  "  *      ",
                                  " *       ",
                                  " *       "}, {
                                  "  ***    ",
                                  " *   *   ",
                                  " *   *   ",
                                  "  ***    ",
                                  " *   *   ",
                                  " *   *   ",
                                  "  ***    "}, {
                                  " ****    ",
                                  "*    *   ",
                                  "*    *   ",
                                  " *****   ",
                                  "     *   ",
                                  "     *   ",
                                  "  ***    "}};

        public static String makeString (String number, int lineIndex) {
            StringBuilder strBuild = new StringBuilder();
            for (int i = 0; i < number.length(); i++) {
                 int j =number.charAt(i)-'0';
                 strBuild.append(numbers[j][lineIndex]);
            }
            return strBuild.toString();
        }

        public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your number: ");
            String digits = in.nextLine();
            for (int j = 0; j<numbers[0].length; j++) {
                System.out.println(makeString(digits, j));
            }
            in.close();
        }
}

