package name.tjsingleton;

// I'm a complex object that talks directly to the database.
// You don't want to have to instantiate me in your tests.
public class User implements AddressablePerson {

    @Override
    public String getFullName() {

        return null;
    }

    @Override
    public String getEmailAddress() {

        return null;
    }
}
