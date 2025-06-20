package eddie.energy.transformer;

import schemas.eu.MyEnergyDataMarketDocument;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public interface IVhcdTransformer {

    public void loadFromFile(File file) throws IOException, JAXBException, org.json.simple.parser.ParseException, ParserConfigurationException, SAXException;

    public void loadReceivedData(String receivedData) throws JAXBException, org.json.simple.parser.ParseException, ParserConfigurationException, SAXException, IOException;

    public MyEnergyDataMarketDocument getMappedMarketDocument(File file) throws JAXBException, IOException, ParseException, org.json.simple.parser.ParseException, ParserConfigurationException, SAXException, DatatypeConfigurationException;

    public MyEnergyDataMarketDocument getMappedMarketDocument(String receivedData) throws JAXBException, ParseException, org.json.simple.parser.ParseException, ParserConfigurationException, SAXException, IOException, DatatypeConfigurationException;

    public MyEnergyDataMarketDocument getMappedMarketDocument() throws ParseException, DatatypeConfigurationException;

}
