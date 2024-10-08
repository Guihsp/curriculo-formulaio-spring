package br.edu.senac.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Experiencia {
    private String empresa;
    private String cargo;
    private String dataInicio;
    private String dataFim;
    private String descricao;
}
