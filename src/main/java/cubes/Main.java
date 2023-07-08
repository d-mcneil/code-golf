package cubes;

// 571 bytes, 563 chars when minified
class Main {
    public static void main(String[] y) {
        char b = '╱';
        char d = '│';
        char e =  ' ';
        char f = '█';
        char g = '─';
        char h = '\n';

        for (int i = 1; i < 8; i++) {








            x(i + 1, e);
            x(1, f);
            x(i * 4, g);
            x(1, f);
            x(1,h);








            for (int j = 0; j < i; j++) {
                x(i-j, e);
                x(1,b);
                x(i * 4, e);
                x(1,b);
                x(j, e);
                x(1,d);
                x(1,h);
            }





            x(1, f);
            x(i * 4, g);
            x(1, f);
            x(i, e);
            x(1, d);
            x(1,h);






            for (int j = 0; j < i;j++) {
                x(1, d);
                x(i * 4, e);
                x(1, d);
                x(i, e);
                x(1, j == i - 1 ? f:d);
                x(1,h);
            }





            for (int j = 0; j < i; j++) {
                x(1,d);
                x(i * 4, e);
                x(1,d);
                x(i-j-1, e);
                x(1,b);
                x(j, e);
                x(1,h);
            }






            x(1, f);
            x(i * 4, g);
            x(1, f);
            x(2,h);
        }
    }
    static void x(int i,char c) {
        for (int j = 0; j < i; j++) {
            System.out.print(c);
        }
    }
}

