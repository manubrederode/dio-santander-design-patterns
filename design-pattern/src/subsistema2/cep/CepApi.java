package subsistema2.cep;

import singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    //ninguem de fora da classe tem permissao para instanciar.
    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }

    public String recuperarEstado(String cep) {
        return "RJ";
    }
}
