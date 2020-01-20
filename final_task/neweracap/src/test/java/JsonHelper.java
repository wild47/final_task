import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JsonHelper {

    private static final String JSON = "JSON";
    private static final String PATH_TO_JSON = "src/test/resources/jsonData.json";

    @DataProvider(name = JSON)
    public static Object[][] createDataFromJSON(final ITestContext context, final Method method) {
        String dataKey = method.getName();
        String[] columns = Objects.requireNonNull(new DefaultParameterNameDiscoverer().getParameterNames(method));
        JSONObject obj = new JSONObject();
        List<Object[]> testData = new ArrayList<>();
        List<Object> testDataRow;
        List<String> hashes = new ArrayList<>();
        JSONArray rows;

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(PATH_TO_JSON));
            obj = new JSONObject(new String(encoded, Charset.forName(UTF_8.name())));
        } catch (JSONException | IOException e) {
            System.out.println("Entry has a problem - " + e);
        }

        assertTrue(obj.has(dataKey));
        rows = (JSONArray) obj.get(dataKey);
        for (int i = 0; i < rows.length(); i++) {
            String entry = rows.get(i).toString();
            hashes.add(entry);
        }
        assertFalse(hashes.isEmpty());

        for (String entry : hashes) {
            JSONObject entryObj = new JSONObject();
            testDataRow = new LinkedList<>();
            try {
                entryObj = new JSONObject(entry);
            } catch (JSONException e) {
                System.out.println("Entry has a problem - " + e + "\n ==============ENTRY================" + entry);
            }
            for (String column : columns) {
                testDataRow.add(entryObj.get(column).toString());
            }
            testData.add(testDataRow.toArray());
        }

        Object[][] testDataArray = new Object[testData.size()][];
        testData.toArray(testDataArray);
        return testDataArray;
    }
}
