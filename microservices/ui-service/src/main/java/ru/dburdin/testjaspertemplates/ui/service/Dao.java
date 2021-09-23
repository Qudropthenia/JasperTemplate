package ru.dburdin.testjaspertemplates.ui.service;

import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesTypeEntity;

import java.util.List;

public interface Dao {
	List<ExpensesTypeEntity> allExpensesType();
}
