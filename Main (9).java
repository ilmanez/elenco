import java.util.Scanner;
 public class Main{
public static void main(String[] args) {
    int choice;
    do {
        System.out.println("\nSeleziona un'opzione:");
        System.out.println("1 - Aggiunta di un nome");
        System.out.println("2 - Cancellazione del singolo nome");
        System.out.println("3 - Ricerca sequenziale di un nome");
        System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni");
        System.out.println("5 - Modifica di un nome");
        System.out.println("6 - Visualizzazione di tutti i nomi presenti");
        System.out.println("7 - Ricerca del nome più lungo e più corto");
        System.out.println("8 - Cancellazione di tutte le occorrenze di un nome");
        System.out.println("0 - Uscita");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                aggiungiNome();
                break;
            case 2:
                cancellaNome();
                break;
            case 3:
                ricercaSequenziale();
                break;
            case 4:
                visualizzaNomiRipetuti();
                break;
            case 5:
                modificaNome();
                break;
            case 6:
                visualizzaTuttiNomi();
                break;
            case 7:
                ricercaNomeLungoCorto();
                break;
            case 8:
                cancellaNomeTutteOccorrenze();
                break;
            case 0:
                System.out.println("Arrivederci!");
                break;
    
        
        
  