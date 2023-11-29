class Bateria extends Camera {
    private String tipo;
    private int capacidade;

    public Bateria(String tipo, int capacidade) {
        super("12 MP", "f/2.0");
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public void carregar() {
        System.out.println(nome + ": Carregando...");
    }

    public void verificarNivel() {
        System.out.println(nome + ": Verificando nível de carga...");
    }
}
