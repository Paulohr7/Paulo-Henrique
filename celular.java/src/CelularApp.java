public class CelularApp {

    public static void main(String[] args) {
        SistemaOperacional sistemaOperacional = new SistemaOperacional("Android", "Oreo");
        sistemaOperacional.iniciar();
        sistemaOperacional.atualizarVersao();
    }
}

class ComponenteCelular {
    protected String nome;

    public ComponenteCelular(String nome) {
        this.nome = nome;
    }

    public void ligar() {
        System.out.println(nome + ": Ligando...");
    }

    public void desligar() {
        System.out.println(nome + ": Desligando...");
    }
}