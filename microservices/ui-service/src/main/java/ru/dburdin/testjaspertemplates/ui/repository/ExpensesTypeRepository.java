package ru.dburdin.testjaspertemplates.ui.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesTypeEntity;

public interface ExpensesTypeRepository extends CrudRepository<ExpensesTypeEntity, Long> {
}
