package com.cibertec.movil.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

	private Integer id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Integer stock;
	private Double precioVenta;
	private Double precioCosto;
	private Integer idProveedor;
	
}
