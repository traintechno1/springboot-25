package com.learning.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "unit_price")
	private Float unitPrice;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "total_price")
	private Float totalPrice;
	
	
	@ManyToOne()
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private User user;
	
	
}
