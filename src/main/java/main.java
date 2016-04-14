import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by IIS on 14.04.2016.
 */
public class main {
    public static void main(String[] args) throws Exception {
        Server saerver = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        saerver.setHandler(handler);
        handler.addServlet(Servlet.class,"/");
        saerver.start();
    }
}
