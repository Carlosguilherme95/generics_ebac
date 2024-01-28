public abstract class Carro {
    private int modelo;
    private int anoFabric;
    private boolean direcao;

    public void instanciador(int modelo, int anoFabric, boolean direcao) {
        this.modelo = modelo;
        this.anoFabric = anoFabric;
        this.direcao = direcao;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabric() {
        return anoFabric;
    }

    public void setAnoFabric(int anoFabric) {
        this.anoFabric = anoFabric;
    }

    public boolean isDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
    }

}
