package Wiederholung;

public class ReportService {
    private ReportGenerator reportGenerator;

    public ReportService(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
    public void createReport(String data){
        reportGenerator.generateReport(data);
    }
}
