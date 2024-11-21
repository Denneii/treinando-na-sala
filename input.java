import java.util.Scanner;
class input{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu salario bruto: ");
    float salario_bruto = scanner.nextFloat();
    
}
class sanitizer{
    limpeza = limpeza.replaceAll("[^a-zA-Z0-9]", "");
    return input;
    if (input.matches("-?\\d+")) {  // Expressão regular para números inteiros
        float numero = Integer.parseInt(input);  // Converte para inteiro
        System.out.println("Número válido: " + numero);
    } else {
        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
    }
}