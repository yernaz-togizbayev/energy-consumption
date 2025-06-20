package eddie.energy.transformer;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import schemas.eu.MyEnergyDataMarketDocument;

public class Main {

	public static void main(String[] args) throws JAXBException, IOException, ParseException, ParserConfigurationException, SAXException, java.text.ParseException, DatatypeConfigurationException {
		EETransformer myTransformer = new EETransformer();
		MyEnergyDataMarketDocument doc = myTransformer.getMappedMarketDocumentFromTimezone(new File("./EE/EE_Test-Data_QH.xml"), OriginTimeZone.WET);
		
		System.out.println(AbstractVhcdTransformer.getDocAsString(doc));
	}

}
