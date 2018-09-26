package Lab_4_console2;

public class Test {
    public static void main(String[] args)
    {      
        int k=6;
        Fraction[] mas=new Fraction [k];
        mas[0]=new Fraction(1,3);
        mas[1]=new Fraction(24,1);
        mas[2]=new Fraction(-4,-5);
        mas[3]=new Fraction(-4,7);
        mas[4]=new Fraction(10,-5);
        mas[5]=new Fraction(-7,14);
        System.out.println("Array of objects : ");
        for(int i=0;i<k;i++)
            mas[i].print();        
       
    }
}
