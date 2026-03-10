public class Cantina{

    // Atributos
    public String nome;
    public Salgado salgados[];

    //Construtor
    public Cantina(String nome){
        this.nome = nome;
        this.salgados = new Salgado[3];
    };
    // Métodos
    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgados.length ; i++){
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                return;
            };
        };
    };
    public void mostraInfo(){
        System.out.println("Salgados da cantina:");
        for (int i = 0; i < salgados.length; i++){
            System.out.println("Salgado " + i + ": " + salgados[i].nome);
        };
    };
}
