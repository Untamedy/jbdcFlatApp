package homework.commonInit;

import homework.flats.services.FilterService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YBolshakova
 */
public class Init {

    private static ConnectionService connectionService;
    private PropertyReader propertyReader;
    private InputData inputData;
    private static FilterService filterService;
    //private  String path = "src\\main\\resources\\prop.properties";
    private String path = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\jdbcFlatApp\\src\\main\\resources\\propmysql.properties";

    private static final Init init = new Init();

    private Init() {
        PropertyReader reader = new PropertyReader(path);
        connectionService = new ConnectionService(reader);
        inputData = new InputData(connectionService);
        try {
            inputData.populateDB();
        } catch (SQLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public static Init getInit(){
        return init;
             
    }

    public static FilterService getService() {
        filterService = new FilterService(connectionService);
        return filterService;
    }

}
