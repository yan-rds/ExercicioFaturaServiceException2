package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Service_Fatura {
    private static List<Fatura> listaDeFatura = new ArrayList<>();

    public static Fatura cadastrarFatura (String email, double valor, String dataDeVencimento) throws Exception{
        Consumidor consumidor = Service_Consumidor.validarEmail(email);
        Fatura novaFatura = new Fatura(consumidor, valor, dataDeVencimento);
        listaDeFatura.add(novaFatura);
        return novaFatura;
    }
}
