import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero! \n");
        var number = scanner.nextInt();
        var KeepVerify = true;
        while (KeepVerify){
            System.out.printf("Informe um numero para verificação! \n");
            var toVerify = scanner.nextInt();
            if (toVerify < number){
                System.out.printf("Informe um numero maior que %s! \n", number);
            }
            var result = toVerify % number;
            KeepVerify = result == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }

    }
}