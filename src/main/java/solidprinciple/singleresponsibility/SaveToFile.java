package solidprinciple.singleresponsibility;

import solidprinciple.openforextensioncloseformodification.InvoiceDao;

public class SaveToFile implements InvoiceDao {

    @Override
    public void saveToDb() {
        System.out.print("Save to file!!");
    }
}
