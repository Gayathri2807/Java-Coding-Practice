//Interface-based Data Abstraction
/*
An interface defines the what(method signatures).
The implementation class defines the how(actual logic).
The caller/user interacts with the interface, not the implementation.
*/

//Define the Phone interface → provides abstraction: caller doesn't know or care about how makeCall works.
interface Phone {
    void makeCall(String number);
}

//Provide concrete implementation: Hides network setup and simulates real call logic.
class AndroidPhone implements Phone {
    @Override
    public void makeCall(String number) {
        connectToNetwork();
        System.out.println("Dialing number: " + number);
        System.out.println("Call in progress...");
    }
    //Internal process(hidden from user)
    private void connectToNetwork() {
        System.out.println("Connecting to mobile network...");
    }
}
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new AndroidPhone();
        myPhone.makeCall("9080220034"); //User just calls makeCall(), and that's abstraction in action.
    }
}

//Abstract-class based Data Abstraction
//Define the abstract class Phone → provides abstraction: caller doesn't know or care about how makeCall works.
abstract class Phone {
    //abstract method
    abstract void makeCall(String number);
}
//Provide concrete implementation: Hides network setup and simulates real call logic.
class AndroidPhone extends Phone {
    @Override
    void makeCall(String number) {
        connectToNetwork();
        System.out.println("Dialing number: " + number);
        System.out.println("Call in progress...");
    }
    //Internal process(hidden from user)
    private void connectToNetwork() {
        System.out.println("Connecting to mobile network...");
    }
}
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new AndroidPhone();
        myPhone.makeCall("9080220034"); //User just calls makeCall(), and that's abstraction in action.
    }
}

