public class Main {
    public static void main(String[] args) {

       String [] ogrenciler = new String[5];
        ogrenciler[0]  = "Ayse";
        ogrenciler[1]  = "Ali";
        ogrenciler[2]  = "Ahmet";
        ogrenciler[3]  = "Huseyin";
        ogrenciler[4]  = "Ayse";

        for(int i=0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}