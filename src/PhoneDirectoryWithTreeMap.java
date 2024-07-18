import java.util.TreeMap;
import java.util.Map;

public class PhoneDirectoryWithTreeMap {
    /**
     * THe TreeMap that will store the data. Both key and value are
     * of type String. The key represents a name and the value represents
     * the associated phone nymbers.
     * /
**/
     private TreeMap<String,String> data;

    /**
     * Constructor creates an initially empty directory.
     */
    **/

    public PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<String,String>();

    }

    /**
     * finds the phone number, it any, for a given name.
     * @return the phone number associated with the nane; if the name
     *   not occur in the phone directory, the the return value is null.
     **/
    public String getNumber( String name ){
        return this.data.get(name);

    }
    /**
     * associates a given name with a given phone number. if the name
     * already exists in the phone directory, then the new number replaces
     * the old one. Otherwise, a new name/number pair is added. the
     * name ane number should both be no-null. An IllegalArgumentException
     * is thrown if this is not the case.
     **/
    public void putNumber( Sring name. String number ) {
        if(name == null || number == null)
            throw new IllegalAccessException(" name and number cannot be null");
        this.data.put(name, number);

    }
    /**  Write the contents of the phone directory to System.out.
     */
    public void print() {
        for ( Map.Entry<String,String> entry :   this.data.entrySet() )
            System.out.println( entry.getKey() + ":  " + entry.getValue() );
    }

} // end class PhoneDirectoryWithTreeMap


}