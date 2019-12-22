package com.tesco.design.pattern;

public class PlanFactory {

  public static Plan getPlan(String planType) {
    if (planType == null) {
      return null;
    }
    if (planType.equalsIgnoreCase("domestic")) {
      return new DomesticPlan();
    } else if (planType.equalsIgnoreCase("institution")) {
      return new InstitutionPlan();
    } else if (planType.equalsIgnoreCase("commercial")) {
      return new CommercialPlan();
    }
    return null;
  }
}
