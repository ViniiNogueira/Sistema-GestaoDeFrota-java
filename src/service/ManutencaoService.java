package service;

import model.entities.Veiculo;
import model.enums.StatusVeiculo;

import java.util.ArrayList;
import java.util.List;

public class ManutencaoService {

    List<Veiculo> veiculos = new ArrayList<>();

    public void checarDisponibilidade(Veiculo veiculo){

        // se tiver disponivel seta pra MANUTENCAO
        if (veiculo.getStatusVeiculo() == StatusVeiculo.DISPONIVEL) {
            veiculo.setStatusVeiculo(StatusVeiculo.MANUTENCAO);
        } else if (veiculo.getStatusVeiculo() == StatusVeiculo.EM_VIAGEM) {
            throw new IllegalStateException("o veiculo nao pode ir para a manutencao, pois esta em: " + veiculo.getStatusVeiculo());
        }

        veiculos.add(veiculo);
    }

    public void finalizarManutencao(Veiculo veiculo){
        if (veiculo.getStatusVeiculo() == StatusVeiculo.MANUTENCAO) {
            System.out.println("foi finalizado a maanutencao do veiculo: " + veiculo.getModelo() + " de placa: " + veiculo.getPlaca());
            veiculo.setStatusVeiculo(StatusVeiculo.DISPONIVEL);
            System.out.println("agora seu veiculo esta disponivel para outra viagem");

            //fazer a parte da data


            veiculos.remove(veiculo);
        }
    }

    public void listarVeiculo(){
        for (Veiculo v :  veiculos) {
            if (v.getStatusVeiculo() == StatusVeiculo.MANUTENCAO) {
                System.out.println(v.getStatusVeiculo() + " - " + v.getModelo());
            }
        }
    }


}
