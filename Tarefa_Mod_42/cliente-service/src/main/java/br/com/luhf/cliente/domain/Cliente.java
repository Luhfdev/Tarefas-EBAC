package br.com.luhf.cliente.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    private String email;
}
