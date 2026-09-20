import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>(); //collection of BuddyInfo objects

    //BuddyInfo buddy1 = new BuddyInfo("Jason", 25);
    //BuddyInfo buddy2 = new BuddyInfo("Karl", 22);

    public void addBuddy(BuddyInfo bud) {
        buddies.add(bud);
    }
    public void removeBuddy(BuddyInfo bud) {
        buddies.remove(bud);
    }

   public static void main(String[] args) {
        System.out.println("Address Book");
   }
}
