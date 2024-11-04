package solidprinciple.singleresponsibility;

import solidprinciple.openforextensioncloseformodification.InvoiceDao;

public class SaveToDatabase implements InvoiceDao {
    @Override
    public void saveToDb() {
        System.out.print("save to db");
    }
}
