package at.technikum.bookstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
class ReportManagementTest {

    @Test
    void getInstance_returnsValidInstance() {
        assertNotNull(ReportManagement.getInstance());
    }

    @Test
    void printReports_prints() {
        PrintStream outMock = Mockito.mock(PrintStream.class);
        System.setOut(outMock);

        ReportManagement.getInstance().printReports();

        Mockito.verify(outMock, times(3)).println(anyString());
    }
}
