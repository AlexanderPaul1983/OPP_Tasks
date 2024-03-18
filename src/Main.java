import Wiederholung.PDFreportGenerator;
import Wiederholung.ReportService;

public class Main {
    public static void main(String[] args) {
        PDFreportGenerator pdFreportGenerator = new PDFreportGenerator();
        ReportService reportService = new ReportService(pdFreportGenerator);
        reportService.createReport("PDF-Datei");

    }


}

