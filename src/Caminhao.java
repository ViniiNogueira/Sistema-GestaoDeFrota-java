public class Caminhao extends Veiculo{

    //atributos
    String CapacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, double capacidTanque, double ConsMedio, String tipoCombustivel , String CapacidadeCarga) {
        super(placa, marca, modelo, capacidTanque, ConsMedio, tipoCombustivel);
        this.CapacidadeCarga = CapacidadeCarga;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("=== DETALHES DO CAMINHÃO ===");
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade de Carga: " + this.CapacidadeCarga + " toneladas");
        System.out.println("Status Atual: " + this.Status);
        System.out.println("Quilometragem: " + this.odometro + " km");
        System.out.println("============================");
    }

}
