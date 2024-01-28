import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Carro> lista = new ArrayList();
        Honda civic = new Honda();
        civic.instanciador(2020,2019,true);
        lista.add(civic);

        Fiat uno = new Fiat();
        uno.instanciador(2000,1999,false);
        lista.add(uno);

        Ford ka = new Ford();
        ka.instanciador(2005,2004,false);
        lista.add(ka);

        for(Carro carro:lista){
            System.out.println(carro);

        }
    }
}
/**
 * criar classes de carros e a lista devera receber qualquer tipo de carro
 */