package Reposicao18_04;

import java.util.Scanner;

public class Maias {
    public static void main(String[] args) {
        String  digito = "";
        int i = 1;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Insira um digito maia");
            digito = scan.nextLine();
            System.out.println(calculadora(digito));
            i++;
        }while(!digito.equals("*") || i >= 8);
    }

       public static int calculadora(String digito){
        if(digito.equals("*")){
            return 0;
        }

        String digitos[] = digito.split(" ");
        int size = digitos.length;
        int num[] = new int[size];
        for(int i = 0; i < size; i++){
            num[i] = converterDigito(digitos[i]);
        }

        int resultado = 0;
        int coeficiente = 1;
        size = num.length;
        for(int i = size - 1; i >= 0; i--){
            resultado = resultado + (num[i] * coeficiente);
            coeficiente = coeficiente * 20;
        }

        return resultado;
    }

    public static int converterDigito(String digito){
        int valor = 0;

        for(char c : digito.toCharArray()){
            if(c == '.'){
                valor += 1;
            }else if(c == '-'){
                valor += 5;
            }
        }

        return valor;
    }

}
