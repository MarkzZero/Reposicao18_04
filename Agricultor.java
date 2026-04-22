import java.util.Scanner;

public class Agricultor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de sensores:");
        int i = scan.nextInt();
        if(i < 1 && i > 1000){
            System.out.println("Insira a quantidade de sensores:");
        }
        do{
            calculo();
            i--;
        }while(i>0);

        scan.close();
    }

    public static void calculo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura atual:");
        int T = scan.nextInt();

        System.out.println("Insira o percentual de umidade do solo:");
        double U = scan.nextDouble();

        System.out.println("Insira a previsão de chuva:");
        int P = scan.nextInt();

        if(P == 1){
            System.out.println("NÃO REGAR");
        }else if(P == 0){
            if(T > 30 && U < 50.0){
                System.out.println("REGAR");
            }else{
                System.out.println("NÃO REGAR");
            }
        }
    }
}
