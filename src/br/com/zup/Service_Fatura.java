package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Service_Fatura {
    private static List<Fatura> listaDeFatura = new ArrayList<>();

    public static Fatura cadastrarFatura (String email, double valor, String dataDeVencimento) throws Exception{
        Consumidor consumidor = Service_Consumidor.VerificarSeEmailExiste(email);
        Fatura novaFatura = new Fatura(consumidor, valor, dataDeVencimento);
        listaDeFatura.add(novaFatura);
        return novaFatura;
    }

    public static void pesquisarFaturaPorEmail (String email) throws Exception{
        for (Fatura referencia : listaDeFatura){
            if (referencia.getConsumidor().getEmail().equalsIgnoreCase(email)){
                System.out.println(referencia);
            }
        }
        throw new Exception("Não existe um consumidor com este email");
    }
}
