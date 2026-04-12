package service;

import model.entities.Veiculo;
import model.enums.StatusVeiculo;

public class ViagemService {

    public void Viajar(Veiculo veiculo, double distancia) {

        if (veiculo.getStatusVeiculo() != StatusVeiculo.DISPONIVEL) {
            throw new IllegalStateException("veiculo indisponivel para viagem!");
        }

        if (distancia <= 0) {
            throw new IllegalStateException("sem distancia para viagem!");
        }

        double consumoNecessario = distancia / veiculo.getConsumoMedio();

        if (veiculo.getNivelCombustivel() < consumoNecessario) {
            throw new IllegalStateException("Combustivel insuficiente, combustivel necessario: " + consumoNecessario + "L , combustivel disponivel: " + veiculo.getNivelCombustivel() + "L");
        }

        veiculo.setNivelCombustivel(veiculo.getNivelCombustivel() -  consumoNecessario);
        veiculo.setOdometro(veiculo.getOdometro() + distancia);
        veiculo.setStatusVeiculo(StatusVeiculo.EM_VIAGEM);

        System.out.println("viagem de: " +  distancia + "KM realizada com sucesso!" );
    }

    //metodo de finalizar viagem

    public void finalizarViagem() {

    }

}