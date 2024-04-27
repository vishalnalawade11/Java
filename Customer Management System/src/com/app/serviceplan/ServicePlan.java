package com.app.serviceplan;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double planCharge;

	ServicePlan(double planCharge) {
		this.planCharge = planCharge;
	}

	public double getPlanCharge() {
		return planCharge;
	}

	public void setPlanCharge(double planCharge) {
		this.planCharge = planCharge;
	}

}
