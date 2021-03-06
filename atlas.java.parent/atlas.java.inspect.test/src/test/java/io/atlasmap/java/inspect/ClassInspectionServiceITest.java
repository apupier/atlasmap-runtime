package io.atlasmap.java.inspect;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.atlasmap.core.DefaultAtlasConversionService;
import io.atlasmap.java.inspect.ClassInspectionService;
import io.atlasmap.java.inspect.InspectionException;
import io.atlasmap.java.v2.JavaClass;

public class ClassInspectionServiceITest {

	private ClassInspectionService classInspectionService = null;
	
	@Before
	public void setUp() throws Exception {
		classInspectionService = new ClassInspectionService();
		classInspectionService.setConversionService(DefaultAtlasConversionService.getRegistry());
	}
	
	@After
	public void tearDown() throws Exception {
		classInspectionService = null;
	}

	@Test
	public void testInspectClassClassNameClassPath() throws InspectionException {
		JavaClass javaClazz = classInspectionService.inspectClass("io.atlasmap.java.test.v2.FlatPrimitiveClass", "target/reference-jars/atlas.java.test.model-1.10.0-SNAPSHOT.jar");
		assertNotNull(javaClazz);	
	}

}
