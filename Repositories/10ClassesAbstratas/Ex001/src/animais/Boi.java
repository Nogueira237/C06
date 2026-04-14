package animais;

import classes.Mamifero;

public class Boi extends Mamifero {

    // Contrutor
    public Boi(String nome, double vida){
        super(nome, vida);
    };

    // Metodos

    @Override
    public void emitirSom() {
        System.out.println("Boi emitiu som.\n");
    }

}
