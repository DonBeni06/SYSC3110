import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>(); //collection of BuddyInfo objects

    public void addBuddy(BuddyInfo bud) {
        buddies.add(bud);
    }
    public void removeBuddy(BuddyInfo bud) {
        buddies.remove(bud);
    }
   public AddressBook() {
   }

   public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jason", 25);
        AddressBook addy = new AddressBook();
        addy.addBuddy(buddy); // main is static - belongs to class not an object - must create an object to run a method on it
        addy.removeBuddy(buddy);


    }
}
