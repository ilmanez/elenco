import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean input = false;
        String[] names = new String[10];
        do {
            System.out.println("1 - Aggiunta di un nome");
            System.out.println("2 - Cancellazione del singolo nome;");
            System.out.println("3 - Ricerca sequenziale di un nome");
            System.out.println("4 - Visualizza nomi ripetuti con numero ripetizioni;");
            System.out.println("5 - Modifica di un nome");
            System.out.println("6 - Visualizzazione di tutti i nomi presenti");
            System.out.println("7 - Ricerca del nome più lungo e più corto");
            System.out.println("8 - Cancellazione di tutte le occorrenze di un nome;");
            System.out.println("0 - Uscita ");
            System.out.println("Scegli una di queste opzioni...");
            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Aggiungi un nome: ");
                    String nome = in.next();
                    nameAdd(names, nome);
                    break;
                case 2:
                    System.out.println("Rimuovi un nome: ");
                    nome = in.next();
                    nameDel(names, nome);
                    break;
                case 3:
                    System.out.println("Ricerca un nome: ");
                    nome = in.next();
                    nameDiscover(names, nome);
                    if (nameDiscover(names, nome)) {
                        System.out.println("Il nome " + nome + " è stato trovato");
                    } else {
                        System.out.println("Il nome " + nome + " non è stato trovato");
                    }
                    break;
                case 4:
                    nameReps(names);
                    break;
                case 5:
                    System.out.println("Quale nome vuoi modificare: ");
                    nome = in.next();
                    nameMod(names, nome);
                    names[nameMod(names,nome)]= in.next();
                    break;
                case 6:
                    nameView(names);
                    break;
                case 7:
                    nameMaxMin(names);
                    break;
                case 8:
                    System.out.println("Rimuovi tutte le occorrenze di un nome: ");
                    nome = in.next();
                    nameDeleter(names, nome);
                    break;
                case 0:
                    input = true;
                    System.out.println("Uscita dal programma in corso...");
                    break;
            }
        } while (!input);
    }

    private static void nameAdd(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                int pos = i;
                names[pos] = name;
                break;
            }
        }
    }

    private static void nameDel(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                names[i] = "null";
                break;
            }
        }
    }

    private static boolean nameDiscover(String[] names, String name) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            found = false;
            if (names[i].equals(name)) {
                found = true;
                break;
            }
        }
        return found;
    }

    private static void nameReps(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int count = 0;
            for (int j = i; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(names[i] + " è stato ripetuto " + count + " volte.");
            }
        }
    }

    private static int nameMod(String[] names, String name) {
        Scanner in = new Scanner(System.in);
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                pos = i;
            }
        }
        return pos;
    }

    private static void nameDeleter(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                names[i] = "null";
            }
        }
    }
    private static void nameView(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
    private static void nameMaxMin(String[] names) {
        String max = names[0];
        String min = names[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > max.length()) {
                max = names[i];
            }
            if (names[i].length() < min.length()) {
                min = names[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

