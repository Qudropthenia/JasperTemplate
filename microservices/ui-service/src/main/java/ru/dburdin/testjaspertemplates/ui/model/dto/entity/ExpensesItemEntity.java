package ru.dburdin.testjaspertemplates.ui.model.dto.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "cat_expenses_item", schema = "dbo", catalog = "test_jasper")
public class ExpensesItemEntity {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// Отключение циклического вложения JSON
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name="type_id", nullable=false)
	private ExpensesTypeEntity expensesType;

	@Column(name = "name", nullable = false, length = 2147483647)
	private String name;

	@Column(name = "description", nullable = true, length = 2147483647)
	private String description;

	public long getId() {
		return id;
	}

	public ExpensesTypeEntity getExpensesType() {
		return expensesType;
	}

	public void setExpensesType(ExpensesTypeEntity expensesType) {
		this.expensesType = expensesType;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
//		CatExpensesItemEntity that = (CatExpensesItemEntity) o;
//
//		if (id != that.id) return false;
//		if (!Objects.equals(name, that.name)) return false;
//		return Objects.equals(description, that.description);
//	}
//
//	@Override
//	public int hashCode() {
//		int result = (int) (id ^ (id >>> 32));
//		result = 31 * result + (name != null ? name.hashCode() : 0);
//		result = 31 * result + (description != null ? description.hashCode() : 0);
//		return result;
//	}
}
