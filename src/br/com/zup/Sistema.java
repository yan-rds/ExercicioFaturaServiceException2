package br.com.zup;

import java.util.Scanner;

public class Sistema {

    static boolean loopMenu = true;

    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Qual é o nome do consumidor?").nextLine();
        String email = capturarDados("Qual é o email deste consumidor?").nextLine();
        Service_Consumidor.verificarEmailRepetido(email);
        Service_Consumidor.verificarEmailValido(email);
        Service_Consumidor.ExibirTiposPessoa();
        String tipoPessoa = capturarDados("Digite o tipo de pessoa").nextLine();
        return Service_Consumidor.cadastrarConsumidor(nome, email, tipoPessoa);
    }

    public static Fatura cadastrarFatura() throws Exception{
       String email = capturarDados("insira o email do consumidor à ter essa fatura cadastrada").nextLine();
       double valor = capturarDados("Qual é o valor desta fatura?").nextDouble();
       String dataDeVencimento = capturarDados("Qual é a data de vencimento deste fatura?").nextLine();
       return Service_Fatura.cadastrarFatura(email,valor,dataDeVencimento);
    }

    public static void pesquisarFaturaPorEmail() throws Exception{
        String email = capturarDados("Qual é o email do consumidor?").nextLine();
        Service_Consumidor.verificarEmailValido(email);
        Service_Fatura.pesquisarFaturaPorEmail(email);
    }

    public static void menuInicial() throws Exception{
        System.out.println("Sistema de Fatura");
        System.out.println("1 - cadastrar um consumidor");
        System.out.println("2 - adicionar uma fatura a um consumidor cadastrado");
        System.out.println("3 - exibir as faturas de um consumidor");
        System.out.println("4 - sair");
    }

    public static void executarSistema() throws Exception {
        while (loopMenu) {
            menuInicial();
            int escolhaMenu = capturarDados("Digite sua escolha").nextInt();
            if (escolhaMenu == 1) {
                cadastrarConsumidor();
            } else if (escolhaMenu == 2) {
                cadastrarFatura();
            } else if (escolhaMenu == 3) {
                pesquisarFaturaPorEmail();
            } else if (escolhaMenu == 4) {
                loopMenu = false;
            }
        }
    }

    public static void tratarExcecao () {
        while (loopMenu) {
            try {
                executarSistema();

            } catch (Exception erro) {
                System.out.println(erro.getMessage());
            }
        }
    }


}
