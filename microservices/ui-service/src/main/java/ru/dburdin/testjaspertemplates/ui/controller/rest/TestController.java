package ru.dburdin.testjaspertemplates.ui.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dburdin.testjaspertemplates.ui.service.Dao;

@RestController
public class TestController {
	@Autowired
	private Dao dao;

	@GetMapping(value = "test")
	Object test() {
		return dao.allExpensesType();
	}
}
