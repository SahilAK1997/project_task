package com.restapifor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class pro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String productname;
    
    public pro()
    {
    	
    }

    public pro(Long id, String productname, cat category) {
		super();
		this.id = id;
		this.productname = productname;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return productname;
	}

	public void setName(String name) {
		this.productname = name;
	}



	public cat getCategory() {
		return category;
	}

	public void setCategory(cat category) {
		this.category = category;
	}

	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private cat category;
 
    
}

