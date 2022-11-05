public class Test {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Mail bench = new Mail("John", "Romania Street", "Foden and Halaand are on the bench");
        Mail start = new Mail("Chris", "Grenoble Alpes", "But Bernando Silva starts");

        postOffice.subscribe(chris);
        postOffice.subscribe(john);
        postOffice.addMail(bench);
        // postOffice.unsubscribe(chris);
        postOffice.addMail(start);
    }
}