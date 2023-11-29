class Processador extends ComponenteCelular {
    private String modelo;
    private int nucleos;

    public Processador(String modelo, int nucleos) {
        super("Processador");
        this.modelo = modelo;
        this.nucleos = nucleos;
    }

    public void executarAplicacao() {
        System.out.println(nome + ": Executando aplicação...");
    }

    public void realizarCalculo() {
        System.out.println(nome + ": Realizando cálculo...");
    }
}