package school.sptech.projetotophair.domain.agenda;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import school.sptech.projetotophair.domain.empresa.Empresa;
import school.sptech.projetotophair.domain.historicoservico.HistoricoServico;
import school.sptech.projetotophair.domain.servico.Servico;

import java.time.LocalDate;

@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgenda;
    @FutureOrPresent
    @NotBlank
    private LocalDate data;
    @NotBlank
    @Pattern(regexp = "^([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$")
    private String hora;
    @NotBlank
    private String status;

    public Agenda(Long idAgenda, LocalDate data, String hora, String status) {
        this.idAgenda = idAgenda;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public Agenda() {
    }

    public Long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
