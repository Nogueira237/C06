package animais;

import classes.Mamifero;

public class Cachorro extends Mamifero {

    // Contrutor
    public Cachorro(String nome, double vida){
        super(nome, vida);
    };

    // Metodos

    @Override
    public void emitirSom() {
        System.out.println("Cachorro emitiu som");
    }
}
