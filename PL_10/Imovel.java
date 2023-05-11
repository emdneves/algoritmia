package PL_10;

public class Imovel {
    private String rua;
    private String cidade;
    private int numeroPorta;
    private int casasBanho;
    private int numeroQuartos;
    private double area;
    private double areaPiscina;
    private TipoImovel tipoImovel;
    private TipoAcabamento tipoAcabamento;

    public Imovel(String rua, String cidade, int numeroPorta, int casasBanho, int numeroQuartos, double area, double area_piscina, TipoImovel tipoImovel, TipoAcabamento tipoAcabamento) {
        this.rua = rua;
        this.cidade = cidade;
        this.numeroPorta = numeroPorta;
        this.casasBanho = casasBanho;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
        this.areaPiscina = area_piscina;
        this.tipoImovel = tipoImovel;
        this.tipoAcabamento = tipoAcabamento;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroPorta() {
        return this.numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public int getCasasBanho() {
        return this.casasBanho;
    }

    public void setCasasBanho(int casasBanho) {
        this.casasBanho = casasBanho;
    }

    public int getNumeroQuartos() {
        return this.numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAreaPiscina() {
        return this.areaPiscina;
    }

    public void setAreaPiscina(double areaPiscina) {
        this.areaPiscina = areaPiscina;
    }

    public TipoImovel getTipoImovel() {
        return this.tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public TipoAcabamento getTipoAcabamento() {
        return this.tipoAcabamento;
    }

    public void setTipoAcabamento(TipoAcabamento tipoAcabamento) {
        this.tipoAcabamento = tipoAcabamento;
    }

    public double calcular() {
        double valorBase = 0.0;
        if (this.tipoImovel == TipoImovel.APARTAMENTO) {
            valorBase = this.area * 1000.0;
        } else if (this.tipoImovel == TipoImovel.CASA) {
            valorBase = this.area * 3000.0;
        } else if (this.tipoImovel == TipoImovel.MANSAO) {
            valorBase = this.area * 5000.0;
        }

        if (this.tipoAcabamento == TipoAcabamento.RESTAURO) {
            valorBase -= valorBase * 0.5;
        } else if (this.tipoAcabamento == TipoAcabamento.USADA) {
            valorBase -= valorBase * 0.1;
        } else if (this.tipoAcabamento == TipoAcabamento.NOVA) {
            valorBase = valorBase;
        } else if (this.tipoAcabamento == TipoAcabamento.NOVAALTOACABAMENTO) {
            valorBase += valorBase * 0.25;
        }

        valorBase += (double)(this.numeroQuartos * 7500 + this.casasBanho * 10500);
        valorBase += this.areaPiscina * 1000.0;
        return valorBase;
    }

    public void mostrarDetalhes() {
        System.out.printf("Rua: %s\n Cidade: %s \n Nº da porta: %d\n Nº casas de banho: %d\n Nº de quartos: %d\n Area: %.2f\n Area da piscina: %.2f\n", this.rua, this.cidade, this.numeroPorta, this.casasBanho, this.numeroQuartos, this.area, this.areaPiscina);
    }

    public boolean compararImoveis(double valorComparar) {
        double valorImovel = this.calcular();
        if (valorImovel > valorComparar) {
            System.out.println("Este imóvel é mais caro.");
            return true;
        } else if (valorComparar > valorImovel) {
            System.out.println("O outro imóvel é mais caro.");
            return false;
        } else {
            System.out.println("Os imóveis tem o mesmo valor!");
            return false;
        }
    }
}
