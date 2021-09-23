package ru.dburdin.testjaspertemplates.ui.model.dto.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "expenses", schema = "dbo", catalog = "test_jasper")
public class ExpensesEntity {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name="item_id")
	private ExpensesItemEntity item;

	@Column(name = "price", nullable = false)
	private Double price;

	@Column(name = "count", nullable = false)
	private int count;

	@Column(name = "final_price", nullable = false)
	private Double finalPrice;

	@Column(name = "date", nullable = false)
	private Date date;

	@Column(name = "description")
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ExpensesItemEntity getItem() {
		return item;
	}

	public void setItem(ExpensesItemEntity item) {
		this.item = item;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
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
//		ExpensesEntity that = (ExpensesEntity) o;
//
//		if (id != that.id) return false;
//		if (count != that.count) return false;
//		if (!Objects.equals(price, that.price)) return false;
//		if (!Objects.equals(finalPrice, that.finalPrice)) return false;
//		if (!Objects.equals(date, that.date)) return false;
//		return Objects.equals(description, that.description);
//	}
//
//	@Override
//	public int hashCode() {
//		int result = (int) (id ^ (id >>> 32));
//		result = 31 * result + (price != null ? price.hashCode() : 0);
//		result = 31 * result + count;
//		result = 31 * result + (finalPrice != null ? finalPrice.hashCode() : 0);
//		result = 31 * result + (date != null ? date.hashCode() : 0);
//		result = 31 * result + (description != null ? description.hashCode() : 0);
//		return result;
//	}
}
