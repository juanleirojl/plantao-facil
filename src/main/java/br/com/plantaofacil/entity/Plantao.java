package br.com.plantaofacil.entity;


import br.com.plantaofacil.enums.TipoPlantao;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Plantao {

    @Id
    private Long id;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private BigDecimal valor;
    private boolean pago = false;
    //@Enumerated(EnumType.STRING)
    private TipoPlantao tipoPlantao;
    //private Medico medico;
    //private Hospital hospital;
}