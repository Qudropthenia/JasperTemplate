package ru.dburdin.testjaspertemplates.ui.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesItemEntity;

public interface ExpensesItemRepository extends CrudRepository<ExpensesItemEntity, Long> {
}
