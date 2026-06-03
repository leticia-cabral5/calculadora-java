import java.util.Scanner;

public class calculadora {
        public static void main(String[] args) {

            int opcao = -1, subopcao;
            Scanner scanner = new Scanner(System.in);
            double num1 = 0, num2 = 0, base =0, exp = 0, result;
            while (opcao != 0) {

                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Potência");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();

                if (opcao >= 1 && opcao <= 4) {
                    System.out.print("Insira o número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Insira o número 2: ");
                    num2 = scanner.nextDouble(); }
                else if (opcao ==5){
                    System.out.print("Insira a base: ");
                    base = scanner.nextDouble();
                    System.out.print("Insira o expoente: ");
                    exp = scanner.nextDouble();
                }


                switch (opcao) {

                    case 0:
                        System.out.println("Saindo. Obrigado por usar nossa calculadora.");
                        break;

                    case 1:
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        subopcao = -1;
                        while (subopcao !=2) {
                            System.out.print("Quer continuar? Sim (1) ou Não (2): ");
                            subopcao = scanner.nextInt();
                            if (subopcao == 1) {
                                System.out.print("Insira outro número: ");
                                double num3 = scanner.nextDouble();
                                System.out.println(result + " + " + num3 + " = " + (result + num3));
                            }
                        }
                        break;

                    case 2:
                        result  = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        subopcao = -1;
                        while (subopcao !=2) {
                            System.out.print("Quer continuar? Sim (1) ou Não (2): ");
                            subopcao = scanner.nextInt();
                            if (subopcao == 1) {
                                System.out.print("Insira outro número: ");
                                double num3 = scanner.nextDouble();
                                System.out.println(result + " - " + num3 + " = " + (result - num3));
                            }
                        }
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println(num1 + " x " + num2 + " = " + result);
                        break;

                    case 4:
                        result = num1 / num2;
                        System.out.println(num1 + " : " + num2 + " = " + result);
                        break;

                    case 5:
                        result = Math.pow(base, exp);
                        System.out.println(base + " ^ " + exp + " = " + result);
                        break;

                    default:
                        System.out.println("Escolha uma opção válida.");

                }

            }
        }

    }

