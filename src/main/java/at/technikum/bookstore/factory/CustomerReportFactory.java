package at.technikum.bookstore.factory;

import at.technikum.bookstore.model.report.CustomerReport;
import at.technikum.bookstore.model.report.Report;

public class CustomerReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return CustomerReport.builder()
                .information("This is a customer report of all 1002 customers.")
                .customerAverageAge(60)
                .build();
    }
}
