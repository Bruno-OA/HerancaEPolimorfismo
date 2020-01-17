package FuncionarioGerente;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Bruno",
                "396.411,368-95",
                20000.00,
                0
        );

        Gerente gerente = new Gerente(
                "Jefferson",
                "394.834.839-21",
                50000.00,
                1,
                10
        );

        Gerente gerente1 = new Gerente(
                "Gabriel",
                "932.653.291-25",
                46570.00,
                1,
                5
        );

        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(gerente.bonificacao(gerente1.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));


        gerente.teste();
        gerente.teste("Jerfferson");
        gerente.teste("Jerfersson", "Jorge");
    }

}
