package energy.eddie.transformer;

import eddie.energy.transformer.AbstractVhcdTransformer;
import eddie.energy.transformer.EETransformer;
import eddie.energy.transformer.OriginTimeZone;
import eddie.energy.validation.XMLValidation;
import schemas.eu.MyEnergyDataMarketDocument;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.File;
import java.nio.file.Files;


public class TestTransformer {
	private static final String SCHEMA_PATH = "src/main/resources/xsd/eu/iec62325-451-10-myenergydata_v1_0.xsd";
	private static final String INPUT_PATH = "EE/EE_Test-Data_QH.xml";
	private static final String OUTPUT_PATH = "EE/EE-Transformer-Output.xml";
	private static final String OUTPUT_PATH_WET = "EE/EE-Transformer-Output-WET.xml";
	private static final String OUTPUT_PATH_CET = "EE/EE-Transformer-Output-CET.xml";
	private static final String OUTPUT_PATH_EET = "EE/EE-Transformer-Output-EET.xml";
	
	@Test
	public void testEETransformer() throws Exception {
	    EETransformer transformer = new EETransformer();

	    MyEnergyDataMarketDocument doc = transformer.getMappedMarketDocument(new File(INPUT_PATH));
	    
	    File outputFile = new File(OUTPUT_PATH);
	    String xml = AbstractVhcdTransformer.getDocAsString(doc);
	    Files.writeString(outputFile.toPath(), xml);
	    
	    assertDoesNotThrow(() -> XMLValidation.validateXML(SCHEMA_PATH, OUTPUT_PATH));
	}
	
	@Test
	public void testEETransformerTimeZoneWET() throws Exception {
	    EETransformer transformer = new EETransformer();

	    MyEnergyDataMarketDocument doc = transformer.getMappedMarketDocumentFromTimezone(new File(INPUT_PATH), OriginTimeZone.WET);
	    
	    File outputFile = new File(OUTPUT_PATH_WET);
	    String xml = AbstractVhcdTransformer.getDocAsString(doc);
	    Files.writeString(outputFile.toPath(), xml);
	    
	    assertDoesNotThrow(() -> XMLValidation.validateXML(SCHEMA_PATH, OUTPUT_PATH_WET));
	}
	
	@Test
	public void testEETransformerTimeZoneCET() throws Exception {
	    EETransformer transformer = new EETransformer();

	    MyEnergyDataMarketDocument doc = transformer.getMappedMarketDocumentFromTimezone(new File(INPUT_PATH), OriginTimeZone.CET);
	    
	    File outputFile = new File(OUTPUT_PATH_CET);
	    String xml = AbstractVhcdTransformer.getDocAsString(doc);
	    Files.writeString(outputFile.toPath(), xml);
	    
	    assertDoesNotThrow(() -> XMLValidation.validateXML(SCHEMA_PATH, OUTPUT_PATH_CET));
	}
	
	@Test
	public void testEETransformerTimeZoneEET() throws Exception {
	    EETransformer transformer = new EETransformer();

	    MyEnergyDataMarketDocument doc = transformer.getMappedMarketDocumentFromTimezone(new File(INPUT_PATH), OriginTimeZone.EET);
	    
	    File outputFile = new File(OUTPUT_PATH_EET);
	    String xml = AbstractVhcdTransformer.getDocAsString(doc);
	    Files.writeString(outputFile.toPath(), xml);
	    
	    assertDoesNotThrow(() -> XMLValidation.validateXML(SCHEMA_PATH, OUTPUT_PATH_EET));
	}
}