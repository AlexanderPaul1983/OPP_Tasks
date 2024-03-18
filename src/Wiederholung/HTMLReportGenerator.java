package Wiederholung;

public class HTMLReportGenerator implements ReportGenerator
{
    @Override
    public void generateReport(String data) {
        System.out.println("HTML-Bericht wird erstellt mit data: " + data);
    }
}
