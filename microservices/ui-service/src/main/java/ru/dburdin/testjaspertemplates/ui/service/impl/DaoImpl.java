package ru.dburdin.testjaspertemplates.ui.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesTypeEntity;
import ru.dburdin.testjaspertemplates.ui.repository.ExpensesTypeRepository;
import ru.dburdin.testjaspertemplates.ui.service.Dao;

import java.util.List;

@Service
public class DaoImpl implements Dao {
	private static final Logger LOGGER = LoggerFactory.getLogger(DaoImpl.class);
	private final ExpensesTypeRepository expensesTypeRepository;

	@Autowired
	public DaoImpl(ExpensesTypeRepository expensesTypeRepository) {
		this.expensesTypeRepository = expensesTypeRepository;
	}

	@Override
	public List<ExpensesTypeEntity> allExpensesType() {
		return (List<ExpensesTypeEntity>) expensesTypeRepository.findAll();
	}
}
