import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner inp=new Scanner(System.in);
        int i;
        System.out.print("Lütfen bir sayi giriniz: ");
        i= inp.nextInt();
        while (i>0){
            i--;
            if(i%2==1){
             continue;
            }
            System.out.println(i);

            */
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner inp=new Scanner(System.in);
        int sayi,toplam=0,x=0,girilen;
        System.out.print("Bir Sayı Giriniz: ");
        girilen= inp.nextInt();
        sayi=girilen;
        for (;sayi>0;sayi--){
            if (sayi%3==0){
                if (sayi%4==0){
                    toplam=(toplam+sayi);
                    x++;
                }
            }
        }
        System.out.println("Sıfırdan "+girilen+" sayısına kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: "+toplam/x);
        }


    }
}