public class TestPhoneDirectoryWithTreeMap {
    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds serveral entries. It then prints the contents of");
        System.out.println("directory and does a few lookups. ");
        System.out.println();
        directory.putNumber("Fred", "555-1234");
        directory.putNumber("Barney", "555-2345");
        directory.putNumber("Wilma", "555-3456");
        directory.putNumber("wilma", "555-3456");
        directory.putNumber("wilma", "555-2563");
        // directory.putNumber("James",null);
        //directory.putNumber(null,"555-2853");

        System.out.println("Contents are");
        System.out.println();
        directory.print();
        System.out.println("Number for Fred is " + directory.getNumber("Fred"));
        System.out.println("Number for wilma is" + directory.getNumber("Wilma"));
        System.out.println("Number for tom is " + directory.getNumber("tom"));
        System.out.println("Number for tome is " + directory.getNumber("Alex"));
        // the output from the last line should be null.
      }
}

