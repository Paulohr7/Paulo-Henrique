class Tela extends Processador {
    private double tamanho;
    private String tipo;

    public Tela(double tamanho, String tipo) {
        super("Tela", 4);
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public void exibirImagem() {
        System.out.println(nome + ": Exibindo imagem...");
    }

    public void ajustarBrilho() {
        System.out.println(nome + ": Ajustando brilho...");
    }
}