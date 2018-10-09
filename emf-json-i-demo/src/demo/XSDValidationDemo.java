package demo;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.junit.Test;
import org.xml.sax.SAXException;

public class XSDValidationDemo {

	@Test
	public void xmlValidation() {
		File schemaFile = new File("../emf-json-i/model/task.xsd"); // etc.
		Source xmlFile = new StreamSource(new File("data/UserGroup.xml"));
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			Schema schema = schemaFactory.newSchema(schemaFile);
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
			System.out.println(xmlFile.getSystemId() + " is valid");
		} catch (SAXException e) {
			System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
			fail(e.getMessage());
		} catch (IOException e) {
		}
	}

}
