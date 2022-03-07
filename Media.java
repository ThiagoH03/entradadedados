import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner inputNota1 = new Scanner(System.in);
        System.out.println("Digite sua 1º Nota:");
        double nota1 = inputNota1.nextDouble();

        Scanner inputNota2 = new Scanner(System.in);
        System.out.println("\nDigite sua 2º Nota:");
        double nota2 = inputNota2.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        String situacao = "";
        if (media < 6){
            situacao = "Reprovado!";
        }else if(media >= 6){
            situacao = "Aprovado!";
        }

        System.out.format("Essa foi a sua média: %.2f. Você foi %s \n",media,situacao);
    }
}