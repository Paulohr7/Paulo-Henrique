class SistemaOperacional extends Conectividade {
    private String nomeSistema;
    private String versao;

    public SistemaOperacional(String nomeSistema, String versao) {
        super("4G LTE");
        this.nomeSistema = nomeSistema;
        this.versao = versao;
    }

    public void iniciar() {
        System.out.println(nome + ": Iniciando...");
    }

    public void atualizarVersao() {
        System.out.println(nome + ": Atualizando para a versão mais recente...");
    }
}