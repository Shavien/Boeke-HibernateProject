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
public class Auteur {

    @Id
    @GeneratedValue
    @Column(name = "id")

    private int id;
    private String auteur;

    @OneToMany(mappedBy = "auteur")
    private List<Boek> boekenLijst;

    public List<Boek> getBoekenLijst() {
        return boekenLijst;
    }

    public void setBoekenLijst(List<Boek> boekenLijst) {
        this.boekenLijst = boekenLijst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "id=" + id +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
