package energy.eddie.cimtranslator;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.EdaCcmTransformer;
import org.junit.jupiter.api.Test;
import schemas.eu.MyEnergyDataMarketDocument;

import java.io.File;

public class TestAustrianTranslation {

    @Test
    public void testDailyValues() throws Exception {
        EdaCcmTransformer edaCcmTransformer = new EdaCcmTransformer();

        MyEnergyDataMarketDocument doc = edaCcmTransformer.getMappedMarketDocument(new File("./src/test/resources/AT/DATEN_CRMSG.xml"));

        System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
    }
}
