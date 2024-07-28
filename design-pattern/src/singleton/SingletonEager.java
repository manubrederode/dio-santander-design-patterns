package singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    //ninguem de fora da classe tem permissao para instanciar.
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
