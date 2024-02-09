public class Main {
    public static void main(String[] args) {
        ITelephone sanskarsPhone;
        sanskarsPhone = new DeskPhone(123456);
        sanskarsPhone.powerOn();
        sanskarsPhone.callPhone(123456);
        sanskarsPhone.answer();

        sanskarsPhone = new MobilePhone(24565);
        sanskarsPhone.powerOn();
        sanskarsPhone.callPhone(24565);
        sanskarsPhone.answer();
    }
}