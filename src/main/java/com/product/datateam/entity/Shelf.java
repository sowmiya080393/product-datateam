package com.product.datateam.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@EqualsAndHashCode(exclude = {})
@ToString(exclude = {})
@Table(name = "shelf", schema = "datateam")
public class Shelf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "shelf_Id")
	private String shelfId;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "product_Id", referencedColumnName = "product_Id")
	private ProductMetadata product;

	@Column(name = "relevancy_score")
	private BigDecimal relevancyScore;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shopper_Id", referencedColumnName = "shopper_Id")
	private Shopper shopper;

}
