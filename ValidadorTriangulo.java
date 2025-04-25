import java.util.Scanner;

public class ValidadorTriangulo {
public static void main(String[] args) {
    //Declaração de variáveis
    int a, b, c; //Lados de um triangulo

    //Criação e instância do objeto de entrada
    Scanner entrada = new Scanner (System.in);

    //Apresentção
    System.out.println("\n\t\t\t == Validador de Triângulo dos que Sobe a Neblina --\n");

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
        
        if((a == b) && (b == c)){
            System.out.println("Triângulo Isóceles!!");
        } else if(( a == b) || (b == c) || (a == c)){
            System.out.println("Triângulo Equilátero!!");
        } else {
            System.out.println("Triângulo Escaleno!!");
        }
    } else {
        //Não é triângulo
        System.out.printf("\n%d, %d e %d NÃO formam triângulo!\n", a, b, c);

    }
}
}