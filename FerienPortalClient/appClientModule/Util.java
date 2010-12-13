import java.util.Properties;	
public class Util {	
    public static Properties getInitProperties() {	
        Properties result = new Properties();	
        // Glassfish-spezifische Daten	
        result.setProperty("java.naming.factory.initial",	
                "com.sun.enterprise.naming.SerialInitContextFactory");	
        result.setProperty("java.naming.factory.url.pkgs",	
                "com.sun.enterprise.naming");	
        result.setProperty("java.naming.factory.state",	
         "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");	
        // Daten für den Zugriff auf einen Container	
        result.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");	
        result.setProperty("org.omg.CORBA.ORBInitialPort", "3700");	
        return result;	
    }	
} 