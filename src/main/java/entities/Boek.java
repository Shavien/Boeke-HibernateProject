package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Boek {

    @Id
    @GeneratedValue
    @Column(name = "boek_id")

    private int boekId;
    private String boekNaam;
    private int editie;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "boek_studenten",
            joinColumns = {@JoinColumn(name = "boek_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private List<Studenten> studentenLijst;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    @OneToMany(mappedBy = "genre")
    private List<Genre> genre;

    public List<Studenten> getStudentenLijst() {
        return studentenLijst;
    }

    public void setStudentenLijst(List<Studenten> studentenLijst) {
        this.studentenLijst = studentenLijst;
    }

    public int getBoekId() {
        return boekId;
    }

    public void setBoekId(int bookId) {
        this.boekId = bookId;
    }

    public String getBoekNaam() {
        return boekNaam;
    }

    public void setBoekNaam(String bookName) {
        this.boekNaam = bookName;
    }

    public int getEditie() {
        return editie;
    }

    public void setEditie(int editie) {
        this.editie = editie;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "bookId=" + boekId +
                ", bookName='" + boekNaam + '\'' +
                ", edition='" + editie + '\'' +
                '}';
    }
}

