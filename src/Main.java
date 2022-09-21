import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
        Scanner tara=new Scanner(System.in);
        System.out.println("Sayiyi yaziniz :");
        int aranacak=tara.nextInt();

        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                varMi = true;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcuttur.");
        } else {
            System.out.println("Sayı mevcuttur değildir.");
        }
    }
}
