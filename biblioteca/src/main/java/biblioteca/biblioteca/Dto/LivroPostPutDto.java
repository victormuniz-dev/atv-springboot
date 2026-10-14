package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import biblioteca.biblioteca.Model.Autor;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    @JsonProperty("ISBN")
    @NotBlank(message = "ISBN não pode estar vazio.")
    private String ISBN;

    @JsonProperty("titulo")
    @NotBlank(message = "Título não pode ser vazio")
    private String título;

    @JsonProperty("autor")
    @NotBlank(message = "Nome do autor não pode ser vazio")
    private Autor autor;

    @JsonProperty("ano")
    @NotBlank(message = "Ano não pode ser vazio")
    private int ano;

    @JsonProperty("edicao")
    @NotBlank(message = "Edição não pode ser vazio")
    private int edicao;
}
