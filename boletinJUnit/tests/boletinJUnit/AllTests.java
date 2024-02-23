package boletinJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AccountTest.class, BoaTest.class, TestFridge.class, TestOperadorAritmetico.class, TestPila.class,
		TestSubscripcion.class })
public class AllTests {

}
