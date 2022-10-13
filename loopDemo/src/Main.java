public class Main {
    public static void main(String[] args) {

        //For
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println("Dongu bitti");

        for (int i=1; i<=10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Tek sayilar");

        for (int i=0; i<=10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Cift sayilar");

        int i=1;

        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While dongusu bitti");

        i=1;

        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("Tek sayilar");

        i=0;

        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("Cift sayilar");

    }
}