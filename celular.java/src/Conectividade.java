class Conectividade extends Bateria {
    private String rede;

    public Conectividade(String rede) {
        super("Li-Po", 4000);
        this.rede = rede;
    }

    public void ativarBluetooth() {
        System.out.println(nome + ": Ativando Bluetooth...");
    }

    public void conectarRede() {
        System.out.println(nome + ": Conectando à rede...");
    }
}