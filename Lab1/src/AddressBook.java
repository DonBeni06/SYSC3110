import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>(); //collection of BuddyInfo objects

    public void addBuddy(BuddyInfo bud) {
        if (bud != null) {
            buddies.add(bud);
        }
    }
    public void removeBuddy(BuddyInfo bud) {
        buddies.remove(bud);
    }

    public BuddyInfo newBuddy(String name, int age) {
        return new BuddyInfo(name, age);
    }

   public AddressBook() {
   }

   public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jason", 25);
        BuddyInfo buddy2 = new BuddyInfo("Rick", 19);
        AddressBook addy = new AddressBook();
        addy.addBuddy(buddy); // main is static - belongs to class not an object - must create an object to run a method on it
        addy.addBuddy(buddy2);
        addy.removeBuddy(buddy);
//text edit on browser
    }
}
