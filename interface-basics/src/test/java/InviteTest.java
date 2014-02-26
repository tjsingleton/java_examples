import org.junit.Test;

import name.tjsingleton.AddressablePerson;
import name.tjsingleton.Invite;
import static org.junit.Assert.assertEquals;

public class InviteTest {
    public class BasicPerson implements AddressablePerson {
        private final String fullName;
        private final String emailAddress;

        public BasicPerson(String fullName, String emailAddress) {

            this.fullName = fullName;
            this.emailAddress = emailAddress;
        }

        @Override
        public String getFullName() {

            return fullName;
        }

        @Override
        public String getEmailAddress() {

            return emailAddress;
        }
    }


    @Test
    public void inviteReportsTheOrganizersName() {

        Invite invite = new Invite(new BasicPerson("Tyler Davis", "tyler-davis@example.com"));
        assertEquals("Tyler Davis", invite.getOrganizersName());
    }
}
