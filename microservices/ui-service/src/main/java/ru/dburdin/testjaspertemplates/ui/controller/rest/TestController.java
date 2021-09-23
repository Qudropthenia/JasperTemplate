package ru.dburdin.testjaspertemplates.ui.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dburdin.testjaspertemplates.ui.service.Dao;
import ru.dburdin.testjaspertemplates.ui.service.jasper.GenerateReport;

@RestController
public class TestController {
	private final Dao dao;
	private final GenerateReport generateReport;

	@Autowired
	public TestController(Dao dao, @Qualifier("Example") GenerateReport generateReport) {
		this.dao = dao;
		this.generateReport = generateReport;
	}

	@GetMapping(value = "test")
	Object test() {
		return dao.allExpensesType();
	}

	@GetMapping("generateReport")
	void generateReport() {
		generateReport.generate();
	}
}
