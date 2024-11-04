package solidprinciple.singleresponsibility;

public class TestClass {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker(300),30);
        InvoicePrint invoicePrint = new InvoicePrint(invoice);
        SaveToDatabase saveToDatabase = new SaveToDatabase();
        invoicePrint.printInvoice();
        saveToDatabase.saveToDb();
    }
}
