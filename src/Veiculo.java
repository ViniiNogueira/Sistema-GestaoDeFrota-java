abstract class Veiculo {
    /*
    peso, tipo de gasolina/eletrico , status("DISPONIVEL", "EM_VIAGEM" ou "MANUTENCAO".) ,
    */
    protected String placa;
    protected String marca;
    protected String modelo;
    protected double capacidTanque;
    protected double nivelCombustivel;
    protected double ConsMedio; // km/L
    protected double odometro; // KM total acummulada
    protected double peso;
    protected String tipoCombustivel;
    protected String Status;

    public Veiculo(String placa, String marca, String modelo, double capacidTanque, double ConsMedio, String tipoCombustivel ) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidTanque = capacidTanque;
        this.nivelCombustivel = 0;
        this.ConsMedio = ConsMedio;
        this.odometro = 0;
        this.tipoCombustivel = tipoCombustivel;
        this.Status = "Disponivel";
    }

    //metodos abastecer == ++nivelCOmbustivel mas n passa do capacidTanque
    // viajar(distancia) == consumo == distancia/ ConsMedio e faz o calculo e as verificaações
    //exibir detalher return informacoes

    public void abastecer(double litros){

        // verificar se o tanque esta cheio
        if (litros > 0){
            if (this.nivelCombustivel + litros > this.capacidTanque){
                System.out.println("tanque cheio");
            } else {
                this.nivelCombustivel += litros;
                System.out.println("abastecido com sucesso");
            }
        } else {
            System.out.println("quantidade invalida");
        }
    }

    // viajar
    public void viajar(double distancia){
        // verificar disponibilidade
        switch (this.Status) {
            case "Disponivel":
                System.out.println("Esta disponivel para a viagem");
                break;
            case "Em_viagem":
                System.out.println("O veiculo esta em viagem");
                break;
            case "Manutencao":
                System.out.println("Veiculo em manutencao");
                return;
            default:
                System.out.println("Status nao consta no sistema, verificar");
                    return;
        }

        double consumoNecessario = (distancia/ConsMedio);

        if (this.nivelCombustivel >= consumoNecessario){
            this.nivelCombustivel -= consumoNecessario;
            this.odometro += distancia;
            this.Status = "Em_viagem";
            System.out.println("viagem de:" + distancia+ "km realizada com sucesso");
        } else {
            System.out.println("combustivel insuficiente, precisa abastecer");
        }
    }
    // enviar pra manutencao
    public  void enviarManutencao() {
        this.Status = "Manutencao";
        System.out.println("o veiculo esta em manutenção, a placa do veiculo é:" + this.placa);
    }

    abstract void exibirDetalhes();
}
