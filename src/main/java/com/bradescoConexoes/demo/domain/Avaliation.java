package com.bradescoConexoes.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avaliation")
public class Avaliation implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "avaliation_id")
	private Long id;
	
	@Column(name = "avaliation_stars")
	private Integer avaliationStars;
	
	@Column(name = "is_still_runing")
	private Boolean isStillRuning;
	
	@ManyToOne
	private LocalMarket localMarket;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAvaliationStars() {
		return avaliationStars;
	}

	public void setAvaliationStars(Integer avaliationStars) {
		this.avaliationStars = avaliationStars;
	}

	public Boolean getIsStillRuning() {
		return isStillRuning;
	}

	public void setIsStillRuning(Boolean isStillRuning) {
		this.isStillRuning = isStillRuning;
	}

	public LocalMarket getLocalMarket() {
		return localMarket;
	}

	public void setLocalMarket(LocalMarket localMarket) {
		this.localMarket = localMarket;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliation other = (Avaliation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
