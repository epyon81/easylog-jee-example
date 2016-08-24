package easylog.jee.example;

import easylog.core.Log;
import easylog.core.LogPosition;
import easylog.jee.Easylog;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Random;

@Path("test")
public class TestResource {

    @Inject
    private TestBean testBean;

    @Easylog
    @Log(position = {LogPosition.BEFORE, LogPosition.AFTER}, detailed = true)
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, World!!</body></h1><br/>" +
                testBean.makeString(new Random(System.currentTimeMillis()).nextInt()) +
                "</html>";
    }
}
