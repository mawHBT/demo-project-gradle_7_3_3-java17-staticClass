package demo.project.gradle;

public class ClazzWithStaticClazz {

   public static class StaticClazz {
      protected int x = 5;
   }

   public static StaticClazz returnStaticClazz() {
      return new StaticClazz();
   }

}
