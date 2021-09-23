package ru.dburdin.testjaspertemplates.ui.model.dto.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "refund", schema = "dbo", catalog = "test_jasper")
public class RefundEntity {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "price", nullable = false)
	private Double price;
	@Column(name = "date", nullable = false)
	private Date date;
	@Column(name = "description", nullable = true, length = 2147483647)
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//
//		RefundEntity that = (RefundEntity) o;
//
//		if (id != that.id) return false;
//		if (!Objects.equals(price, that.price)) return false;
//		if (!Objects.equals(date, that.date)) return false;
//		return Objects.equals(description, that.description);
//	}
//
//	@Override
//	public int hashCode() {
//		int result = (int) (id ^ (id >>> 32));
//		result = 31 * result + (price != null ? price.hashCode() : 0);
//		result = 31 * result + (date != null ? date.hashCode() : 0);
//		result = 31 * result + (description != null ? description.hashCode() : 0);
//		return result;
//	}
}
