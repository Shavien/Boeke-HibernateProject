package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Studenten {

    @Id
    @GeneratedValue
    @Column(name = "student_id")

    private Long studentId;
    private String voornaam;
    private String achternaam;

    @ManyToMany
    private List<Boek> boeken;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_id", referencedColumnName = "detail_id")

    private StudentenDetail studentenDetail;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long id) {
        this.studentId = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Override
    public String toString() {
        return "Studenten{" +
                "id=" + studentId +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                '}';
    }
}
