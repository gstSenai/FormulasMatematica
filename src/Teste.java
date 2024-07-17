import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Professor p1 = new Professor("GST");
        Scanner sc = new Scanner(System.in);

        int cont = 0, escolha;

        do{
            System.out.println("----Login Preofeossor----");
            System.out.println("Professor " + p1.getNome());
            System.out.println("Insira sua senha: ");
            p1.setSenha(sc.next());


            if(p1.getSenha().equals(p1.getSenhaProfessores())){
                System.out.println("SENHA CORRETA");
                System.out.println("\nESCOLHA O QUE DESEJA CALCULAR" +
                                   "\n1- Circulo" +
                                   "\n2- Quadrado" +
                                   "\n3- Retângulo" +
                                   "\n4- Triângulo: ");
                escolha = sc.nextInt();
                if(escolha == 1){
                    System.out.println("");
                }

            }else {
                System.out.println("Senha Errada");
                cont ++;
            }
        }while(cont < 3);
    }
}
