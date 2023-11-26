package at.technikum.bookstore;

import at.technikum.bookstore.factory.BookReportFactory;
import at.technikum.bookstore.factory.CustomerReportFactory;
import at.technikum.bookstore.factory.OrderReportFactory;
import at.technikum.bookstore.factory.ReportFactory;
import at.technikum.bookstore.model.report.Report;

public class ReportManagement {

    private static ReportManagement instance;

    private final ReportFactory[] reportFactories = {
            new BookReportFactory(),
            new CustomerReportFactory(),
            new OrderReportFactory()
    };

    public void printReports() {
        for (ReportFactory factory : reportFactories) {
            Report report = factory.createReport();
            System.out.println(report.getInformation());
        }
    }

    public static ReportManagement getInstance() {
        if (instance == null) {
            instance = new ReportManagement();
        }
        return instance;
    }
}
