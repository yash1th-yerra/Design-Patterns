package com.designpatterns.creation;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if(planType==null) {
			return null;
		}
		else if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new DomesticPlan();
		}
		return null;
	}

}
