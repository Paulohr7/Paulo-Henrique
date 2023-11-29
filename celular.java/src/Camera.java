class Camera extends Tela {
    private String resolucao;
    private String abertura;

    public Camera(String resolucao, String abertura) {
        super(6.0, "LCD");
        this.resolucao = resolucao;
        this.abertura = abertura;
    }

    public void tirarFoto() {
        System.out.println(nome + ": Tirando foto...");
    }

    public void gravarVideo() {
        System.out.println(nome + ": Gravando vídeo...");
    }
}
