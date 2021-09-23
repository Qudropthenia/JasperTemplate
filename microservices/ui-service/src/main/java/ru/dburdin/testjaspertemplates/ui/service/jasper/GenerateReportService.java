package ru.dburdin.testjaspertemplates.ui.service.jasper;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.dburdin.testjaspertemplates.ui.model.dto.entity.ExpensesTypeEntity;
import ru.dburdin.testjaspertemplates.ui.service.Dao;
import ru.dburdin.testjaspertemplates.ui.service.impl.DaoImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("Example")
public class GenerateReportService implements GenerateReport {
	private static final Logger LOGGER = LoggerFactory.getLogger(DaoImpl.class);
	private static final String TEMPLATE_NAME = "\\Type_1.jrxml";
	private final Dao dao;

	@Value("${jasper-report.folder-templates}")
	private String PATH;

	@Value("${jasper-report.folder-finish}")
	private String REPORT_FOLDER;

	@Autowired
	public GenerateReportService(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void generate() {
		try {
//			List<ExpensesTypeEntity> types = dao.allExpensesType();
			List<ExpensesTypeEntity> types = new ArrayList<>() {{
				add(new ExpensesTypeEntity(1, "Раз", null));
				add(new ExpensesTypeEntity(1, "Два", null));
			}};
			if (CollectionUtils.isEmpty(types)) {
				LOGGER.warn("В коллекции нет данных дял отрисовки");
				return;
			}

			LOGGER.info("Начало генерации отчета");
			File jTemplate = new File(PATH + TEMPLATE_NAME);
			JasperDesign jasperDesign = JRXmlLoader.load(jTemplate);

			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			LOGGER.info("Компиляция пройдена");

			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(types);
			LOGGER.info("DataSource сформирован");

			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), beanColDataSource);
			LOGGER.info("Report запонен");

			JasperExportManager.exportReportToPdfFile(jasperPrint, REPORT_FOLDER + "\\test_report.pdf");
			LOGGER.info("Файл сохранён");
		} catch (JRException e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		}
	}
}
