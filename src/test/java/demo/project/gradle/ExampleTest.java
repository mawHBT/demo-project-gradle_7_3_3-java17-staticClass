package demo.project.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

   @Test
   public void test() {
      ClazzWithStaticClazz.StaticClazz staticClazz = ClazzWithStaticClazz.returnStaticClazz();
      Assertions.assertEquals(false, staticClazz.staticInterfaceMethod(true));
   }

}
