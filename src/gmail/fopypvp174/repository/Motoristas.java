package gmail.fopypvp174.repository;

import gmail.fopypvp174.model.Caminhao;
import gmail.fopypvp174.model.Motorista;
import gmail.fopypvp174.model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Motoristas {


    private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

    public Motoristas(){
        Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
        Optional<Motorista> motoristaJoao = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
        Optional<Motorista> motoristaJose = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));

        motoristas.put("João", motoristaJoao);
        motoristas.put("José", motoristaJose);
    }

    public Optional<Motorista> porNome(String nome){
        return motoristas.get(nome);
    }
}
