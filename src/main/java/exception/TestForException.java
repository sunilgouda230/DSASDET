package exception;

public class TestForException {

    public void getOrder(int orderID) throws OrderNotFoundException {
        if (orderID == 101){
            throw  new OrderNotFoundException("Order not found with id "+ orderID);
            // throw use to throw the exception to one layer to another layer
        } else {
            //do some logic
        }
    }

    public static void main(String[] args)  {
        TestForException testForException = new TestForException();
        try {
            testForException.getOrder(101);
        } catch (OrderNotFoundException e) {
            System.out.print("Exception Caught: "+e.getMessage());
        }
    }
}
