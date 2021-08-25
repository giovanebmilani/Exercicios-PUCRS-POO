import java.util.ArrayList;


public class Cofrinho {
    
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<Moeda>();
    }

    public ArrayList<Moeda> getMoedas() {
        return this.moedas;
    }

    public void inserirMoeda(Moeda moeda) {
        /** 
         * Insere uma moeda no cofre
         */
        this.moedas.add(moeda);
    }

    public Moeda removerMoeda() {
        /** 
         * Remove e retorna a última moeda inserida no cofre,
         * caso esteja vazio, retorna null
        */
        if (this.moedas.isEmpty()) {
            return null;
        } else {
            int ultimoIndex = this.moedas.size() - 1;
            Moeda moedaRemovida = this.moedas.remove(ultimoIndex);
            return moedaRemovida;
        }
    }

    public int getQuantidadeMoedas() {
        /** Retorna a quantidade de moedas no cofre */
        return this.moedas.size();
    }

    public int getQuantidadeMoedasTipo(NomeMoeda nomeMoeda) {
        /** Retorna a quantidade de uma moeda especifica */
        int quantidade = 0;
        for (Moeda moeda : this.moedas) {
            if (moeda.getNomeMoeda() == nomeMoeda) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int getValorTotalCentavos() {
        /** Retorna o valor total contido no cofre em centavos */
        int centavos = 0;
        for (Moeda moeda : this.moedas) {
            centavos += moeda.getValorCentavos();
        }
        return centavos;
    }

    public double getValorTotalReais() {
        /** Retorna o valor total contido no cofre em reais*/
        double reais = 0;
        for (Moeda moeda : this.moedas) {
            reais += moeda.getValorReais();
        }
        return reais;
    }
 
}
