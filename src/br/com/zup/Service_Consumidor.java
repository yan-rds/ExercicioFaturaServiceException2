package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Service_Consumidor {
    private static List<Consumidor> listaDeConsumidor = new ArrayList<>();

    public static void ExibirTiposPessoa (){
        for (TipoPessoa referencia : TipoPessoa.values()){
            System.out.println(referencia);
        }
    }

    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoPessoaRecebido) throws Exception{
        TipoPessoa tipoDePessoa= transformarStringEmTipoPessoa(tipoPessoaRecebido);
        Consumidor consumidor = new Consumidor(nome, email, tipoDePessoa);
        listaDeConsumidor.add(consumidor);
        return consumidor;
    }

    public static TipoPessoa transformarStringEmTipoPessoa (String tipoPessoa) throws Exception{
        for (TipoPessoa referencia : TipoPessoa.values()){
            if (tipoPessoa.equalsIgnoreCase(String.valueOf(referencia))){
                return referencia;
            }
        }
        throw new Exception("Tipo de pessoa inserido inválido");
    }

    public static Consumidor VerificarSeEmailExiste(String email) throws Exception{
        for (Consumidor referencia : listaDeConsumidor){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                return referencia;
            }
        }
        throw new Exception("Não existe um consumidor com este email");
    }

    public static void verificarEmailRepetido(String email) throws Exception{
        for (Consumidor referencia : listaDeConsumidor){
            if (referencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("Consumidor com este email já existe");
            }
        }
    }

    public static void verificarEmailValido(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido");
        }
    }


}
