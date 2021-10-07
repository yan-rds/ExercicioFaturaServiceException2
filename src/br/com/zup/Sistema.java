package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }


    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Qual é o nome do consumidor?").nextLine();
        String email = capturarDados("Qual é o email deste consumidor?").nextLine();
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

}
