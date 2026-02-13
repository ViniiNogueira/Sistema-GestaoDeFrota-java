import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Caminhao("abc123" , "Scania" , "TH-300", 400, 33.3, "Diesel", "12"));
        veiculos.add(new Moto("cba123","Honda","CB500", 30, 22 ,"gasolina" , 500));

        //chama para manutencao
        veiculos.get(1).enviarManutencao();

        System.out.println("--- RELATÓRIO DE OPERAÇÃO ---");
        for (Veiculo v : veiculos){
            v.abastecer(20);
            v.viajar(50);
            v.exibirDetalhes();
        }
    }
}
