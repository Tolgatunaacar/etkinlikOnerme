import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.println("Bir sıcaklık giriniz:");

        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayağa gidebilirsin");
        }else if (heat >= 5 && heat < 25){
            if (heat >= 5 && heat < 10){
                System.out.println("Sinemaya gidebilirsin");
            } else if (heat >= 10 && heat < 15) {
                System.out.println("Pikniğe veya sinemaya gidebilirsin");
            } else{
                System.out.println("Pikniğe gidebilirsin");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
