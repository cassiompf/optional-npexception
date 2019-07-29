package gmail.fopypvp174.teste;

import gmail.fopypvp174.model.Seguro;

import java.math.BigDecimal;
import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {
        Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);

        seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
    }
}
