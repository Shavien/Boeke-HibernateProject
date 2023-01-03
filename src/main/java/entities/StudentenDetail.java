package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentenDetail {

    @Id
    @GeneratedValue
    @Column(name = "detail_id")

    private int detailId;
    private int telefoonNummer;
    private String emailAdres;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(int telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    @Override
    public String toString() {
        return "StudentenDetail{" +
                "id=" + detailId +
                ", telefoonNummer=" + telefoonNummer +
                ", emailAdres='" + emailAdres + '\'' +
                '}';
    }
}
