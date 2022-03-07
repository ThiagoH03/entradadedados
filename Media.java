import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner inputNotas = new Scanner(System.in);
        System.out.println("Digite sua 1º Nota:");
        double nota1 = inputNotas.nextDouble();

        System.out.println("\nDigite sua 2º Nota:");
        double nota2 = inputNotas.nextDouble();
        
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