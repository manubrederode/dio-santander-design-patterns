package singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    //ninguem de fora da classe tem permissao para instanciar.
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
