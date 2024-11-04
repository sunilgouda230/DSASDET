package solidprinciple.singleresponsibility;

public class InvoicePrint {
    final private Invoice invoice;

    public InvoicePrint(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.print(invoice.calculateTotal());
    }
}
