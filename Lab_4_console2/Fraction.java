package Lab_4_console2;

public class Fraction {
   private int numerator;
    private int denominator;

    public Fraction(int a, int b) {
       assert(b!=0);
        this.numerator=a;
        this.denominator=b;
        this.shorten();
        if(this.denominator<0 ) {
            this.numerator*=-1;
            this.denominator*=-1;
        }
    }

    public void print()
    {
        if(denominator!=1) {
            System.out.println(numerator + "/"+ denominator);
        }
        else  System.out.println(numerator);
    }

    public  void shorten() {
        int a = 0, b = 0;
        if (numerator>denominator) {
            a =numerator;
            b = denominator;
        }
        else {
            a = denominator;
            b =numerator;
        }
        while (b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }

        numerator /= a;
        denominator /= a;
    }
}
