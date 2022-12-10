package business.DB4OUtil;




import business.ConfigASystem;
import business1.Ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;
import com.sun.org.apache.xml.internal.security.signature.ObjectContainer;



/**
*
* @author revat
*/
public class DB4OUtil {



   private static final String FILENAME = "C://Users//shiba//OneDrive//Desktop//DataBank.db4o"; // path to the data store
    private static DB4OUtil dB4OUtil;



   public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }



   protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }



   private ObjectContainer createConnection() {
        try {



           EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);



           //Register your top most Class here
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true); // Change to the object you want to save
            return Db4oEmbedded.openFile(config, FILENAME);
        } catch (DatabaseFileLockedException | DatabaseReadOnlyException | Db4oIOException | IncompatibleFileFormatException | OldFormatException ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }



   public synchronized void storeSystem(Ecosystem system) {
        ObjectContainer conn = createConnection();
        deleteOldSystem(conn);
        conn.store(system);
        conn.commit();
        conn.close();
    }



   public void deleteOldSystem(ObjectContainer conn) {
        ObjectSet<Ecosystem> systems = conn.query(new Predicate<Ecosystem>() {
            @Override
            public boolean match(Ecosystem et) {
                return true;
            }
        });
        for (Ecosystem Ecosystem : systems) {
            conn.delete(Ecosystem);
        }
    }



   public Ecosystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class); // Change to the object you want to save
        Ecosystem system;
        if (systems.isEmpty()) {
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
   }}