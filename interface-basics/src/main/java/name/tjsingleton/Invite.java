package name.tjsingleton;

public class Invite {

    private final AddressablePerson organizer;

    public Invite(AddressablePerson organizer) {
        this.organizer = organizer;
    }

    public String getOrganizersName() {
        return organizer.getFullName();
    }
}
