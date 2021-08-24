import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class Test {
    public static final String ACCOUNT_SID = "Your_Account_SID";
    public static final String AUTH_TOKEN = "AUTH_TOKEN";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("mobile_to"),
                new com.twilio.type.PhoneNumber("mobile_from"),
                "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
