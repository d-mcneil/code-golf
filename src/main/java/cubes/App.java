package cubes;

public class App {
    public static void main(String[] y) {
        int[] a = {1,2,3,4,5,6,7};
        for (int i:a) {

            { // this block prints the line containing the second horizontal line
                x(i + 1, ' ');
                x(1, '█');
                x(i * 4, '─');
                x(1, '█');
                z();
            }

            // this block prints the diagonals and verticals until second horizontal line
            for (int j = 0; j < i; j++) {
                x(i-j, ' ');
                x(1,'╱');
                x(i * 4, ' ');
                x(1,'╱');
                x(j, ' ');
                x(1,'│');
                z();
            }

            { // this block prints the line containing the second horizontal line
                x(1, '█');
                x(i * 4, '─');
                x(1, '█');
                x(i, ' ');
                x(1, '│');
                z();
            }

            // this block prints the verticals until the bottom corner is reached
            for (int j = 0; j < i;j++) {
                x(1, '│');
                x(i * 4, ' ');
                x(1, '│');
                x(i, ' ');
                x(1, j == i - 1 ? '█':'│');
                z();
            }

            // this block prints the diagonals and verticals until third horizontal line
            for (int j = 0; j < i; j++) {
                x(1,'│');
                x(i * 4, ' ');
                x(1,'│');
                x(i-j-1, ' ');
                x(1,'╱');
                x(j, ' ');
                z();
            }

            { // this block prints the line containing the third horizontal line
                x(1, '█');
                x(i * 4, '─');
                x(1, '█');
                z();
                z();
            }
        }
    }
    static void x(int i,char c) {
        for (int j = 0; j < i; j++) {
            System.out.print(c);
        }
    }
    static void z() {
        System.out.println();
    }
}