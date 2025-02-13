import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class Esercizio_Giorno1 {


    static Scanner scanner = new Scanner(System.in);
//
    public static void main(String[] args) {
//
//        int sommaRisultato = somma();
//        int moltiplicaRisultato = moltiplica();
//        int sottraiRisultato = sottrai();
//        double dividiRisultato = dividi();
//
//
//        concatena(sommaRisultato, moltiplicaRisultato, sottraiRisultato, dividiRisultato);

//        System.out.println(stringaPariDispari());
//
//        System.out.println(bisestile());


//        LocalDate data = LocalDate.of(2024, 2, 11);
//        stampaMese(data);
//        stampaStagione(data);


                    System.out.println(inserisciStringa());

                    suddividiStringa2("ciao");

                    popolaArray();

                    contoAllaRovescia();


    }
//
//
//    public static int somma() {
//        System.out.println("Inserisci il primo numero");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Inserisci il secondo numero");
//        int num2 = scanner.nextInt();
//
//        int risultato = num1 + num2;
//        System.out.println("Il risultato è: " + risultato);
//        return risultato;
//    }
//
//
//    public static int moltiplica() {
//        System.out.println("Inserisci il primo numero");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Inserisci il secondo numero");
//        int num2 = scanner.nextInt();
//
//        int risultato = num1 * num2;
//        System.out.println("Il risultato è: " + risultato);
//        return risultato;
//    }
//
//
//    public static int sottrai() {
//        System.out.println("Inserisci il primo numero:");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Inserisci il secondo numero:");
//        int num2 = scanner.nextInt();
//
//        int risultato = num1 - num2;
//        System.out.println("Il risultato è: " + risultato);
//        return risultato;
//    }
//
//
//    public static double dividi() {
//        System.out.println("Inserisci il primo numero:");
//        double num1 = scanner.nextDouble();
//
//        System.out.println("Inserisci il secondo numero:");
//        double num2 = scanner.nextDouble();
//
//        double risultato = num1 / num2;
//        System.out.println("Il risultato è: " + risultato);
//        return risultato;
//    }
//
//
//    public static void concatena(int somma, int moltiplica, int sottrai, double dividi) {
//        System.out.println("i valori sono : ");
//        System.out.println("somma: " + somma);
//        System.out.println("prodotto: " + moltiplica);
//        System.out.println("differenza: " + sottrai);
//        System.out.println("quoziente: " + dividi);
//    }

//    public static boolean stringaPariDispari() {
//        System.out.println("Inserisci una stringa");
//        String s1 = scanner.nextLine();
//
//        if (s1.length()%2==0){
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    public static boolean bisestile() {
//        System.out.println("Inserisci un anno");
//        int s1 = scanner.nextInt();
//
//        if (s1%100==0 && s1%400==0){
//            return true;
//        } else if (s1%4==0 && s1%100!=0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }




//        public static void stampaMese(LocalDate date) {
//            int giorno = date.getDayOfMonth();
//            int mese = date.getMonthValue();
//            int anno = date.getYear();
//
//            String nomeMese;
//
//
//            switch (mese) {
//                case 1:
//                    nomeMese = "gennaio";
//                    break;
//                case 2:
//                    nomeMese = "febbraio";
//                    break;
//                case 3:
//                    nomeMese = "marzo";
//                    break;
//                case 4:
//                    nomeMese = "aprile";
//                    break;
//                case 5:
//                    nomeMese = "maggio";
//                    break;
//                case 6:
//                    nomeMese = "giugno";
//                    break;
//                case 7:
//                    nomeMese = "luglio";
//                    break;
//                case 8:
//                    nomeMese = "agosto";
//                    break;
//                case 9:
//                    nomeMese = "settembre";
//                    break;
//                case 10:
//                    nomeMese = "ottobre";
//                    break;
//                case 11:
//                    nomeMese = "novembre";
//                    break;
//                case 12:
//                    nomeMese = "dicembre";
//                    break;
//                default:
//                    nomeMese = "mese sconosciuto";
//                    break;
//            }
//
//
//            System.out.println(giorno + " " + nomeMese + " " + anno);
//        }
//
//
//
//    public static void stampaStagione(LocalDate date) {
//        int mese = date.getMonthValue();
//        String stagione ="";
//
//        String nomeMese;
//
//
//        switch (mese) {
//            case 12, 1, 2:
//                stagione = "inverno";
//                break;
//            case 3, 4, 5:
//                stagione = "primavera";
//                break;
//            case 6, 7, 8:
//                stagione = "estate";
//                break;
//            case 9, 10, 11:
//                stagione = "autunno";
//                break;
//
//            default:
//                stagione = "stagione sconosciuta";
//                break;
//        }
//
//
//        System.out.println("è " + stagione);
//    }

    public static String inserisciStringa(){
        String x ="";
        while (true){
            System.out.println("Inserisci stringa: ");
             x = scanner.nextLine();
            if(x.length()>=5){
                break;
            }
        }
            return x;
    }

    public static void suddividiStringa(String sudd){
        String result = "";
        String [] arr = sudd.split("");
        for (int i=0; i<arr.length; i++) {
            if (i != sudd.length()-1) {
                result += arr[i] + ", ";
            } else {
                result += arr[i] + ".";
            }
        }
        System.out.println(result);
    }

    public static void suddividiStringa2(String sudd){
        String result = "";
        int i = 0;
        while (i!=sudd.length()) {
            if (i != sudd.length()-1) {
                result += sudd.charAt(i) + ", ";
                i++;
            } else {
                result += sudd.charAt(i) + ".";
                i++;
            }
        }
        System.out.println(result);
    }

    public static void popolaArray(){

        System.out.println("inserisci la lunghezza dell'array");

        int lunghezza = scanner.nextInt();

        String [] array = new String [lunghezza];

        for (int i =0; i<lunghezza; i++) {
            array[i] = inserisciStringa();
        }

        System.out.println(Arrays.toString(array));
    }


    public static void contoAllaRovescia(){
        System.out.println("Inserisci un numero per il conto");
        int numero = scanner.nextInt();

        for(int i = numero; i>=0; i--) {
            System.out.print(i + " ");
        }
    }
}
