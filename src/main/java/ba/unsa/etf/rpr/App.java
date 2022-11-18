package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        if(args[0].equals("sinus"))
            System.out.println(Matematika.sinus(Double.parseDouble(args[1])));
        else if(args[0].equals("faktorijel")){
            System.out.println(Matematika.faktorijel(Integer.parseInt(args[1])));
        }
        else
            System.out.println("Greska");
    }

}
