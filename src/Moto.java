public class Moto extends Veiculo{
    //atributos
    int cilindradas; // cc

    public Moto(String placa, String marca, String modelo, double capacidTanque, double ConsMedio, String tipoCombustivel, int cilindradas) {
        super(placa, marca, modelo, capacidTanque, ConsMedio, tipoCombustivel);
        this.cilindradas = cilindradas;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("=== DETALHES DA MOTO ===");
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Status Atual: " + this.Status);
        System.out.println("Quilometragem: " + this.odometro + " km");
        System.out.println("============================");
    }
}
