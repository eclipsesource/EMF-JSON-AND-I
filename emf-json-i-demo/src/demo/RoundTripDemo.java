package demo;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import eclipse.org.emf.ecp.makeithappen.model.task.Task;
import eclipse.org.emf.ecp.makeithappen.model.task.TaskFactory;
import eclipse.org.emf.ecp.makeithappen.model.task.User;
import eclipse.org.emf.ecp.makeithappen.model.task.UserGroup;

public class RoundTripDemo {

	private UserGroup exampleData() {
		UserGroup ug = TaskFactory.eINSTANCE.createUserGroup();
		User max = TaskFactory.eINSTANCE.createUser();
		max.setEmail("mkoegel@eclipsesource.com");
		max.setFirstName("Maximilian");
		max.setLastName("Koegel");
		Task prepareTalk = TaskFactory.eINSTANCE.createTask();
		prepareTalk.setDone(true);
		prepareTalk.setName("Prepare EMF, JSON & I Talk");

		Task holdTalk = TaskFactory.eINSTANCE.createTask();
		holdTalk.setName("Hold EMF, JSON & I Talk");

		max.getTasks().add(prepareTalk);
		max.getTasks().add(holdTalk);

		ug.getUsers().add(max);
		return ug;
	}

	@Test
	public void xmlRoundTrip() throws IOException {
		Files.deleteIfExists(Paths.get("data/UserGroup.xml"));

		UserGroup userGroup = exampleData();

		ResourceSet rs = getXMLResourceSet();
		Resource resource = rs.createResource(URI.createURI("data/UserGroup.xml"));
		resource.getContents().add(userGroup);
		resource.save(null);

		ResourceSet loadRs = getXMLResourceSet();
		Resource loadResource = loadRs.createResource(URI.createURI("data/UserGroup.xml"));
		loadResource.load(null);
		UserGroup loadedGroup = (UserGroup) loadResource.getContents().get(0);

		assertTrue(EcoreUtil.equals(userGroup, loadedGroup));
	}

	private ResourceSet getXMLResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		return rs;
	}

	@Test
	public void jsonRoundTrip() throws IOException {
		Files.deleteIfExists(Paths.get("data/UserGroup.json"));

		UserGroup userGroup = exampleData();

		ResourceSet rsSave = getJSONResourceSet();
		Resource resource = rsSave.createResource(URI.createURI("data/UserGroup.json"));
		resource.getContents().add(userGroup);
		resource.save(null);

		ResourceSet loadRs = getJSONResourceSet();
		Resource loadResource = loadRs.createResource(URI.createURI("data/UserGroup.json"));
		loadResource.load(null);
		UserGroup loadedGroup = (UserGroup) loadResource.getContents().get(0);

		assertTrue(EcoreUtil.equals(userGroup, loadedGroup));
	}

	private ResourceSet getJSONResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		ObjectMapper mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		mapper.registerModule(module);
		JsonResourceFactory factory = new JsonResourceFactory(mapper);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", factory);
		return rs;
	}

}
