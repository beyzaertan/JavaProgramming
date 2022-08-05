package Lab1;

public class UserRegister {
    public static void main(String[] args) {

        String firstName = "Mike";
        String lastName = "Smith";
        String monthOfBirth = "May";
        int dateOfBirth = 10;
        int yearOfBirth = 1980;

        boolean isHealthPlanId = true;
        boolean isSSNumber = false;

        int memberId = 123445;
        long policyNumber = 1234356776L;

        int last6DigitOfSSN = 100000;
        String zipCode = "22102";
        System.out.println(firstName + " who born in " + monthOfBirth + " wants health insurance from the United States with policy number " + policyNumber);

    }
}
