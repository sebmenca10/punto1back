package com.punto1.punto1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tabla1")
public class Tabla1 {

		@Column
		private String cod_pro;
		@Column
		private String decr_prod;
		@Column
		private String instalacion;
		@Column
		private String bodega;
		@Column
		private int inventario;
		@Column
		private float cost_unit;
		
		public String getCod_pro() {
			return cod_pro;
		}
		public void setCod_pro(String cod_pro) {
			this.cod_pro = cod_pro;
		}
		public String getDecr_prod() {
			return decr_prod;
		}
		public void setDecr_prod(String decr_prod) {
			this.decr_prod = decr_prod;
		}
		public String getInstalacion() {
			return instalacion;
		}
		public void setInstalacion(String instalacion) {
			this.instalacion = instalacion;
		}
		public String getBodega() {
			return bodega;
		}
		public void setBodega(String bodega) {
			this.bodega = bodega;
		}
		public int getInventario() {
			return inventario;
		}
		public void setInventario(int inventario) {
			this.inventario = inventario;
		}
		public float getCost_unit() {
			return cost_unit;
		}
		public void setCost_unit(float cost_unit) {
			this.cost_unit = cost_unit;
		}
		
		
}
