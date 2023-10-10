package com.project.sprint3.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Domicilio")
public class Domicilio extends Base {


    @Column(name = "calle")
    private String calle = "San Martín";
    @Column(name = "521")
    private String numero;
    @Column(name = "Godoy Cruz")
    private String localidad;


}
