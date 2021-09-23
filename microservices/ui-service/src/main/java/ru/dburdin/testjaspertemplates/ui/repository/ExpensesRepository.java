package ru.dburdin.testjaspertemplates.ui.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesEntity;

public interface ExpensesRepository extends CrudRepository<ExpensesEntity, Long> {
}
