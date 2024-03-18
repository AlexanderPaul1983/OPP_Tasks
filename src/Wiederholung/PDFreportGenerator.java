package Wiederholung;

public class PDFreportGenerator implements ReportGenerator{

    @Override
    public void generateReport(String data) {
        System.out.println("PDF-Datei wird erstellt: " + data);
    }
}
