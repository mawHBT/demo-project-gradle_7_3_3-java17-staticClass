package demo.project.gradle;

import java.io.Serializable;
import java.util.ArrayList;

public class OpeningHoursParser {

   public static class OpeningHours implements Serializable {

      private ArrayList<OpeningHoursRule> rules;

      public OpeningHours(ArrayList<OpeningHoursRule> rules) {
         this.rules = rules;
      }

      public OpeningHours() {
         rules = new ArrayList<OpeningHoursRule>();
      }

      public ArrayList<OpeningHoursRule> getRules() {
         return rules;
      }

   }

   public static interface OpeningHoursRule {

   }

   public static OpeningHours parseOpenedHours(String format) {
      OpeningHours rs = new OpeningHours();
      return rs;
   }

}

