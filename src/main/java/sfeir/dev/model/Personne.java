package sfeir.dev.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Personne extends PanacheEntity {

  @NotNull
  @Size(min = 3, max = 30)
  @Column(unique = true, nullable = false)
  public String nom;

  public static Personne findByNom(String nom) {
    return find("nom", nom).firstResult();
  }
}
