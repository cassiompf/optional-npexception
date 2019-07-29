package gmail.fopypvp174.teste;

import gmail.fopypvp174.model.Caminhao;
import gmail.fopypvp174.model.Motorista;
import gmail.fopypvp174.model.Seguro;
import gmail.fopypvp174.repository.Motoristas;

public class ConsultaCobertura {

    public static void main(String[] args) {
        Motoristas motoristas = new Motoristas();
        //Motorista motorista = motoristas.porNome("José");

        /*
        String cobertura = "Sem seguro";
        if (motorista != null){
            Caminhao caminhao = motorista.getCaminhao();
            if (caminhao != null){
                Seguro seguro = caminhao.getSeguro();
                if (seguro != null){
                    cobertura = seguro.getCobertura();
                }
            }
        }
        System.out.println("A cobertura é: " + cobertura); */

        String cobertura = motoristas.porNome("José")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura)
                .orElse("Sem cobertura");

        System.out.println("A cobertura é » " + cobertura);

        //Optional<Caminhao> caminhaoOptional = motoristaOptional.flatMap(Motorista::getCaminhao);
    }
}
