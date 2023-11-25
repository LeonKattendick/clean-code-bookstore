package at.technikum.bookstore.factory;

import at.technikum.bookstore.model.report.BookReport;
import at.technikum.bookstore.model.report.Report;

public class BookReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return BookReport.builder()
                .information("This is a book report. Currently there are 500 books in store.")
                .newBooksLastMonth(20)
                .build();
    }
}
