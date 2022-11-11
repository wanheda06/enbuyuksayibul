public class Main {
    public static void main(String[] args) {
        int liczby1 = 20;
        int liczby2 = 18;
        int liczby3 = 22;
        int wieksza = liczby1;


        if (wieksza < liczby2) {
            wieksza = liczby2;
        }

        if (wieksza < liczby3) {
            wieksza = liczby3;
        }
        System.out.println();
        System.out.println("większa liczba jest: " + wieksza);
    }
}