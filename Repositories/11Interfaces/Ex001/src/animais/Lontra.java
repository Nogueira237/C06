package animais;

import classes.Mamifero;

public class Lontra extends Mamifero {

    // Contrutor
    public Lontra(String nome, double vida){
        super(nome, vida);
    };

    // Metodos

    @Override
    public void emitirSom() {
        System.out.println("Lontra emitiu som.\n");
    }
}
