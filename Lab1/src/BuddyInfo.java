public class BuddyInfo {
    private final String name;
    private final int age;

    public BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        BuddyInfo n = new BuddyInfo("Homer", 12);
        System.out.println("Hello, my name is " + n.getName() + " and I'm " + n.getAge());
    }
}
