import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int paramUm, paramDois;
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeito parâmetro: ");
        paramUm = terminal.nextInt();

        System.out.println("Digite o primeito parâmetro: ");
        paramDois = terminal.nextInt();

        try{
            contar(paramUm, paramDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println(exception);
        }
        finally {
            terminal.close();
        }

    }

    static void contar(int parUm, int parDois) throws ParametrosInvalidosException {
        if (parUm >= parDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parUm - parDois;
        for (int contador = 0; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String errorMessage) {
        super(errorMessage);
    }
}