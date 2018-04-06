package XPath; /**
 * Created by yaxudai on 2/10/18.
 */
import java.io.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Dom4j {
    public Document parse(String filename) throws DocumentException {
        SAXReader reader = new SAXReader();
        File inputFile = new File(filename);
        Document document = reader.read(inputFile);
        return document;
    }
}
