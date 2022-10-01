package datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity(name="nutricionista")
public class Nutricionista {
    @Id
    private Long id;
    private String nome;
    private LocalDate idade;
    @Column(name= "codigo_registro")
    private String codigoRegistro;
    @Column(name= "id_paciente")
    private Long idPaciente;

    public Nutricionista(String nome, LocalDate idade, String codigoRegistro, Long id_paciente) {
        this.nome = nome;
        this.idade = idade;
        this.codigoRegistro = codigoRegistro;
        this.idPaciente = id_paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idpaciente) {
        this.idPaciente = idpaciente;
    }
}
