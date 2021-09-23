package ru.dburdin.testjaspertemplates.ui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesTypeEntity;
import ru.dburdin.testjaspertemplates.ui.repository.ExpensesTypeRepository;
import ru.dburdin.testjaspertemplates.ui.service.Dao;

import java.util.List;

@Service
public class DaoImpl implements Dao {
	@Autowired
	private ExpensesTypeRepository expensesTypeRepository;

	@Override
	public List<ExpensesTypeEntity> allExpensesType() {
		return (List<ExpensesTypeEntity>) expensesTypeRepository.findAll();
	}
}
