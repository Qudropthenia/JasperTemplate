package ru.dburdin.testjaspertemplates.ui.model.dto.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cat_expenses_type", schema = "dbo", catalog = "test_jasper")
public class ExpensesTypeEntity {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name", nullable = false, length = 2147483647)
	private String name;
//	@JsonBackReference
	@OneToMany(
			targetEntity=ExpensesItemEntity.class,
			fetch = FetchType.LAZY,
			mappedBy="expensesType",
			cascade=CascadeType.MERGE
	)
	private Set<ExpensesItemEntity> items;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<ExpensesItemEntity> getItems() {
		return items;
	}

	public void setItems(Set<ExpensesItemEntity> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//
//		CatExpensesTypeEntity that = (CatExpensesTypeEntity) o;
//
//		if (id != that.id) return false;
//		return Objects.equals(name, that.name);
//	}
//
//	@Override
//	public int hashCode() {
//		int result = (int) (id ^ (id >>> 32));
//		result = 31 * result + (name != null ? name.hashCode() : 0);
//		return result;
//	}
}
