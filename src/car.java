// Definição da classe Carro
public class car {
    // Atributos da classe Carro
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;

    // Construtor da classe Carro
    public car(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0; // Inicialmente o carro está parado
    }

    // Métodos getters e setters para acessar e modificar os atributos privados
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Método para acelerar o carro
    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    // Método para frear o carro
    public void frear(int decremento) {
        if (this.velocidade - decremento >= 0) {
            this.velocidade -= decremento;
        } else {
            this.velocidade = 0; // Evita velocidade negativa
        }
    }

    // Método para imprimir informações do carro
    public void imprimirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    // Método principal para testar a classe Carro
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        car meuCarro = new car("Fusca", "Azul", 1980);

        // Imprimindo informações iniciais do carro
        meuCarro.imprimirInformacoes();

        // Acelerando o carro em 50 km/h
        meuCarro.acelerar(50);

        // Imprimindo informações após acelerar
        meuCarro.imprimirInformacoes();

        // Freando o carro em 20 km/h
        meuCarro.frear(20);

        // Imprimindo informações após frear
        meuCarro.imprimirInformacoes();
    }
}
