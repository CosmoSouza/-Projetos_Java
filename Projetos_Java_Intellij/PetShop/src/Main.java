import java.util.Scanner;


public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
       scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("=====Escolha uma das opcoes======");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com Shampoo");
            System.out.println("4 - Verifica agua da maquina");
            System.out.println("5 - Verifica shampoo da maquina");
            System.out.println("6 - Verificar  se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setwater();
                case 3 -> setshampoo();
                case 4 -> verifywater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 ->System.exit(0);
                    default -> System.out.println("opcao invalida");

            }
        } while (option != 0);
    }
    private static void setshampoo(){
        System.out.println("tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }
    private static void setwater(){
        System.out.println("tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void verifywater() {
        var amount = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amount + "litro(s) de agua");
    }
    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amount + "litro(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
       var haspet =  petMachine.hasPet();
       System.out.println(haspet ? "tem pet na maquina" : "Nao tem pet na maquina");
    }


    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println(" O pet " + pet.getName() + " foi colocado na maquina ");
    }

    public void getPetFrommachine(){

    }
}