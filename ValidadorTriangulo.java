import java.util.Scanner;

public class ValidadorTriangulo {
public static void main(String[] args) {
    //Declaração de variáveis
    int a, b, c; //Lados de um triangulo

    //Criação e instância do objeto de entrada
    Scanner entrada = new Scanner (System.in);

    //Apresentção
    System.out.println("\n\t\t\t == Validador de Triângulo --\n");

    //Entradas
    System.out.print("Informe o lado A: ");
    a = entrada.nextInt();
    System.out.println("Informe o lado B: ");
    b = entrada.nextInt();
    System.out.println("Informe o lado C: ");
    c = entrada.nextInt();

    //Processamento
    if((a < (b+c)) && (b < (a + c)) && ( c < (a+b))){
        //É triângulo
        System.out.printf("\n%d, %d e %d formam triangulo!\n" , a, b, c);
    
    } else {
        //Não é triângulo2
        System.out.printf("\n%d, %d e %d NÃO formam triângulo!\n", a, b, c);
            
    }
}
}