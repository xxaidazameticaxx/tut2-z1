package ba.unsa.etf.rpr;

public class Matematika {

    public static double sinus(double x) {
        x=x*Math.PI/180;
        double sinx=0;
        int predznak = 1;
        int stepen = 1;
        for(int i = 1; i < 10; i++,stepen+=2, predznak*=-1) {
            sinx+=Math.pow(x,stepen)/faktorijel(stepen)*predznak;
        }
        return sinx;
    }

    public static double faktorijel (int x) {
        int faktorijel=1;
        for(int i=x;i>=2;i--) {
            faktorijel=faktorijel * i;
        }

        return faktorijel;
    }
}