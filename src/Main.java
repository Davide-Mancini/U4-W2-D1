import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //----------------------------------------ESERCIZIO 1----------------------------------------------
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(1,10);
        }

        while (true){
            System.out.println("inserisci la posizione da modificare");
            int posizione= Integer.parseInt(scanner.nextLine());


            if( posizione < 0 || posizione>= array.length ){
                System.out.println("psozione non raggiungibile nell'array");
                continue;
            }
            System.out.println("ora inserisci valore da inserire o 0 per uscire");
            int input;
            try {
                input= Integer.parseInt(scanner.nextLine());
            } catch ( NumberFormatException ex){
                System.out.println( "formato errato, inserisci un numero");
                continue;
            }
            if (input==0){
                break;
            }
            array[posizione]=input;
            System.out.println(Arrays.toString(array));
        }

        //------------------------------------ESERCIZIO 2-------------------------------------------
        System.out.println("Quanti km hai percorso con la tua auto?");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("quanti litri di carburante hai consumato?");
        try {
        int litri= Integer.parseInt(scanner.nextLine());
        System.out.println(km/litri);
        }catch (ArithmeticException ex){
            System.out.println("non si puo dividere per zero");
        }finally {
            scanner.close();
        }
        //--------------------------------ESERCIZIO 3-----------------------------------------------
        

    }
}