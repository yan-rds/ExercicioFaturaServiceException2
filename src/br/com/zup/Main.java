package br.com.zup;

public class Main {

    public static void main(String[] args) {
	try {
	    Sistema.cadastrarFatura();

    }catch (Exception erro){
        System.out.println(erro.getMessage());
    }
    }
}
