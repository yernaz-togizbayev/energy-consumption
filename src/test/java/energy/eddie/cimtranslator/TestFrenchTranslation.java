package energy.eddie.cimtranslator;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.EnedisTransformer;
import org.junit.jupiter.api.Test;
import schemas.eu.MyEnergyDataMarketDocument;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class TestFrenchTranslation {

    @Test
    public void testHourlyValues() throws JAXBException, ParseException, IOException, org.json.simple.parser.ParseException {
        EnedisTransformer enedisTransformer = new EnedisTransformer();

        MyEnergyDataMarketDocument doc = enedisTransformer.getMappedMarketDocument(new File("./src/test/resources/FR/MeterReadingHalfHourly.json"));

        System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
    }
}
