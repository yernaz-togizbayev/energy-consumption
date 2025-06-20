package eddie.energy.transformer;

import schemas.eu.MyEnergyDataMarketDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.text.SimpleDateFormat;

public abstract class AbstractVhcdTransformer implements IVhcdTransformer {
    final static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZZ");
    static JAXBContext ctx;

    static {
        try {
            ctx = JAXBContext.newInstance(MyEnergyDataMarketDocument.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    static Marshaller ms;

    static {
        try {
            ms = ctx.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    protected AbstractVhcdTransformer() throws JAXBException {
        ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    }

    public static String getDocAsString(MyEnergyDataMarketDocument doc) throws JAXBException {
        StringWriter writer = new StringWriter();
        ms.marshal(doc, writer);
        return writer.toString();
    }
}
