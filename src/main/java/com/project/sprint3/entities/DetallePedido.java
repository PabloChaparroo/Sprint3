package com.project.sprint3.entities;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Detalle_Pedido")
public class DetallePedido extends Base {
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private double subTotal;
    @Column(name = "subTotal costo")
    private double subTotalCosto;

    //Relacion con ArticuloInsumo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    //Relacion con ArticuloManufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;


}