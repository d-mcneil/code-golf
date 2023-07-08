package cubes;

// 634 bytes, 594 chars when minified
class Main {
    public static void main(String[] y) {
        int[] a = {1,2,3,4,5,6,7};

        char b = '╱';
        char d = '│';
        char e =  ' ';
        char f = '█';
        char g = '─';

        for (int i:a) {
                x(i + 1, e);
                x(1, f);
                x(i * 4, g);
                x(1, f);
                z();


            for (int j = 0; j < i; j++) {
                x(i-j, e);
                x(1,b);
                x(i * 4, e);
                x(1,b);
                x(j, e);
                x(1,d);
                z();
            }

                x(1, f);
                x(i * 4, g);
                x(1, f);
                x(i, e);
                x(1, d);
                z();


            for (int j = 0; j < i;j++) {
                x(1, d);
                x(i * 4, e);
                x(1, d);
                x(i, e);
                x(1, j == i - 1 ? f:d);
                z();
            }

            for (int j = 0; j < i; j++) {
                x(1,d);
                x(i * 4, e);
                x(1,d);
                x(i-j-1, e);
                x(1,b);
                x(j, e);
                z();
            }


                x(1, f);
                x(i * 4, g);
                x(1, f);
                z();
                z();

        }
    }
    static void x(int i,char c) {
        for (int j = 0; j < i; j++) {
            System.out.print(c);
        }
    }
    static void z() {
        x(1,'\n');
    }
}

