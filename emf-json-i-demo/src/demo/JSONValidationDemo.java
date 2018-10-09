package demo;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

public class JSONValidationDemo {

	@Test
	public void jsonValidation() throws IOException {
		try (
//				InputStream schemaStream = Files.newInputStream(Paths.get("../emf-json-i/model/task.json"));
				InputStream schemaStream = Files.newInputStream(Paths.get("../emf-json-i/model/taskWithEClass.json"));
				InputStream dataStream = Files.newInputStream(Paths.get("data/UserGroup.json"))) {
			JSONObject rawSchema = new JSONObject(new JSONTokener(schemaStream));
			Schema schema = SchemaLoader.load(rawSchema);
			try {
				schema.validate(new JSONObject(new JSONTokener(dataStream)));
			} catch (ValidationException e) {
				fail(e.getMessage());
			}
		}
	}

}
