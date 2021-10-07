package br.com.zup;

public class Consumidor {
    private String nome;
    private String email;
    private TipoPessoa tipoPessoa;

    public Consumidor() {
    }

    public Consumidor(String nome, String email, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        StringBuilder concatenador = new StringBuilder();
        concatenador.append(nome);
        concatenador.append("\tEmail: " + email);
        concatenador.append("\tPessoa " + tipoPessoa);
        return concatenador.toString();
    }
}
