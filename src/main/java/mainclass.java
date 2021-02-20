import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "mainclass", urlPatterns = "/mainclass")
public class mainclass extends HttpServlet {


    public mainclass() throws IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String json = "{\n" +
                "   \"command\":\"DailyRapprt\",\n" +
                "   \"response\":\"ok\",\n" +
                "   \"ReportBody\":[\n" +
                "      {\n" +
                "         \"param0\":\"value0\",\n" +
                "         \"param1\":\"value1\",\n" +
                "         \"param2\":\"value2\",\n" +
                "         \"param3\":\"value3\",\n" +
                "         \"param4\":\"value4\",\n" +
                "         \"param5\":\"value5\",\n" +
                "         \"param6\":\"value6\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"param0\":\"value0\",\n" +
                "         \"param1\":\"value1\",\n" +
                "         \"param2\":\"value2\",\n" +
                "         \"param3\":\"value3\",\n" +
                "         \"param4\":\"value4\",\n" +
                "         \"param5\":\"value5\",\n" +
                "         \"param6\":\"value6\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        PrintWriter pw = res.getWriter();
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        pw.write(String.valueOf(jsonObject));
        pw.close();

    }
}
