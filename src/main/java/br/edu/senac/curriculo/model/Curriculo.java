package br.edu.senac.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curriculo {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String profissao;
    private String resumo;
    private List<Tecnologia> tecnologias;
    private List<Formacao> formacoes;
    private List<Experiencia> experiencias;
    private List<Idioma> idiomas;
}