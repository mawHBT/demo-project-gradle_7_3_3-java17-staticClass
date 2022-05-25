package demo.project.gradle;

import java.io.Serializable;
import java.util.ArrayList;

public class ClazzWithStaticClazz {

   public static class StaticClazz implements StaticInterface, Serializable {

      private ArrayList<StaticInterface> staticInterfaceList;

      public StaticClazz() {
         staticInterfaceList = new ArrayList<StaticInterface>();
      }

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
