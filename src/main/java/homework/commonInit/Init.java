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

    private  ConnectionService connectionService;
    private  PropertyReader propertyReader;
    private  InputData inputData;
    private  FilterService filterService;
   //private  String path = "src\\main\\resources\\prop.properties";
    private String path = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\jdbcFlatApp\\src\\main\\resources\\propmysql.properties";
    public Init() {        

    }

     public FilterService getConnection() {
        PropertyReader reader = new PropertyReader(path);
        connectionService = new ConnectionService(reader);
        filterService = new FilterService(connectionService);   
        inputData = new InputData(connectionService);
        try {
            inputData.populateDB();
        } catch (SQLException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
        return filterService;
    }
    
    

}
