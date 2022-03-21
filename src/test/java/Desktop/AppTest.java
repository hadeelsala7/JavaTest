/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Desktop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    
    
    @Test void appAdd() {
        App classTest = new App();
        assertEquals(12, classTest.add(6,6), "PASS");
    }
    
    @Test void appAdd2() {
        String string5=null;					
        assertNull(string5);			

    }
    
    @Test
    @Disabled("Not implemented yet")
    void shouldShowSimpleAssertion() {
        assertEquals(2, 2);
    }
@ParameterizedTest(name = "{0} + {1} = {2}")
@CsvSource({
	"0,1,1",
	"1,1,2",
	"9,2,11"})
void add(int first, int second, int expected) {
    App classTest2 = new App();
	assertEquals(expected, classTest2.add(first, second), ()-> first +"+" + second + "should equals"+ expected);
}
 
}
