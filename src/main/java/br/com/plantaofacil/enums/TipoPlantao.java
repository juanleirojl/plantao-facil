package br.com.plantaofacil.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@RequiredArgsConstructor
public enum TipoPlantao {
    // Constantes do enum com os valores da descrição, hora de início e hora de fim
    SD("Plantão Diurno", LocalTime.of(7, 0), LocalTime.of(19, 0)),
    SN("Plantão Noturno", LocalTime.of(19, 0), LocalTime.of(7, 0)),
    S24("Plantão de 24 horas", LocalTime.of(0, 0), LocalTime.of(0, 0));

    // Campos para armazenar os valores
    private String descricao;
    private LocalTime horaInicio;
    private LocalTime horaFim;
}


