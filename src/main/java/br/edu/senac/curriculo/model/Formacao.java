package br.edu.senac.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formacao {
    private String instituicao;
    private String curso;
    private String periodo;
    private String descricao;
}
