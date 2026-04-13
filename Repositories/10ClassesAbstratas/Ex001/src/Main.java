import animais.Cachorro;
import animais.Lontra;
import animais.Boi;

public class Main {
    static void main(String[] args) {

        // criando instâncias das subclasses
        Boi b1 = new Boi("Nelore", 222);
        Cachorro c1 = new Cachorro("Luna", 111);
        Lontra l1 = new Lontra("Lon", 333);

        // testando métodos das subclasses
        b1.emitirSom();
        c1.emitirSom();
        l1.emitirSom();

    }
}
