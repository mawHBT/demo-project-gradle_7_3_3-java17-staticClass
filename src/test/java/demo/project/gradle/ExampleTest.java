package demo.project.gradle;

import org.junit.jupiter.api.Test;

public class ExampleTest {

   @Test
   public void test() {
      OpeningHoursParser.OpeningHours hours = OpeningHoursParser.parseOpenedHours("Mo-Fr 08:30-14:40"); //$NON-NLS-1$
   }

}
