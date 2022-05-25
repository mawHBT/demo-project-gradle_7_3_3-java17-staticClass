package demo.project.gradle;

import java.io.Serializable;

public class ClazzWithStaticClazz {

   public static class StaticClazz implements Serializable {
      protected int x = 5;
   }

   public static StaticClazz returnStaticClazz() {
      return new StaticClazz();
   }

}
