import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("İsdifadəçi adınızı daxil edin: ");
            String name = scan.nextLine();
            System.out.println("Parolunuzu daxil edin: ");
            int password = scan.nextInt();




            String True = "Ehmedov Ferid";
            int True1 = 88111;
            int total = 1000;


            if ((name.equals(True)) && (password==True1)) {
                System.out.println("1. Ümumi məbləğ");
                System.out.println("2. Pul əlavə etmək");
                System.out.println("3. Pul çəkmək");
                System.out.println("4. Sistemdən çıxmaq");
                System.out.println("Funksiya seçin: ");
                int funksiya = scan.nextInt();
                switch (funksiya){
                    case 1:
                        System.out.println("Ümumi məbləğ: " + total );
                        break;
                    case 2:
                        System.out.println("Məbləğ daxil edin: ");
                        int money = scan.nextInt();
                        total+=money;
                        System.out.println("Son ümumi məbləğ: " + total);
                        break;
                    case 3:
                        System.out.println("Məbləğ daxil edin: ");
                        int money1 = scan.nextInt();
                        if (money1 <= total){
                            System.out.println("Ümumi məbləğ: " + total );
                            total-=money1;
                            System.out.println("Son ümumi məbləğ: " + total);
                        }else {
                            System.out.println("Sizə göstərilən məbləğ qədər çəkə bilərsiniz");
                        }
                        break;
                    case 4:
                        System.out.println("Sistemdən çıxdınız...");
                        break;
                    default:
                        System.out.println("Belə bir funksiya mövcud deyil!");

                }

            }else{
                System.out.println("Səhv parol və ya isdifadəçi adı");
            }
        }


    }
}
