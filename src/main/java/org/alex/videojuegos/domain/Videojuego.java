package org.alex.videojuegos.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.alex.videojuegos.domain.Distribuidor;

@Setter
@Getter
@Entity
@Table(name = "videojuego")
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String imageUrl;
    @ManyToOne
    private Distribuidor distribuidor;
}
