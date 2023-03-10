package main.java.singleton;

public class Banco {

    private Banco(){};
    private static Banco instance = new Banco();
    public static  Banco getInstance() {
        return instance;
    }
    private String endpoint;
    private String senha;


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
