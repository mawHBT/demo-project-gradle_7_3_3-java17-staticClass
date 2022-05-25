package demo.project.gradle;

import java.io.Serializable;

public class ClazzWithStaticClazz {

   public static class StaticClazz implements StaticInterface, Serializable {

      @Override public boolean staticInterfaceMethod(boolean someBoolean) {
         return !someBoolean;
      }

   }

   public static StaticClazz returnStaticClazz() {
      return new StaticClazz();
   }

   public static interface StaticInterface {
      public boolean staticInterfaceMethod(boolean someBoolean);
   }

}
