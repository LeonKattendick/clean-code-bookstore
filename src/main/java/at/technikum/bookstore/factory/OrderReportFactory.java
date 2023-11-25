package at.technikum.bookstore.factory;

import at.technikum.bookstore.model.report.OrderReport;
import at.technikum.bookstore.model.report.Report;

public class OrderReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return OrderReport.builder()
                .information("This is a order report of November 2023.")
                .averageOrders(133)
                .build();
    }
}
