package java_vulkanizerskaRadnja.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VulkanizerskaRadnjaTest extends RadnjaTest {

	@BeforeEach
	void setUp() throws Exception {
		r = new VulkanizerskaRadnja();
	}

	@AfterEach
	void tearDown() throws Exception {
		r = null;
	}

}
