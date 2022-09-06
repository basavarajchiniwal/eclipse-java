package com.xworkz.interfaceconcept;

public class ITRuleFollower implements HrRules, ManagerRules, SecurityRules {

	@Override
	public boolean swipeCard() {
		System.out.println("Swipe card is available in company");
		return false;
	}

	@Override
	public boolean parkingAproval() {
		System.out.println("Parking approval is needed");
		return false;
	}

	@Override
	public boolean informLeave() {
		System.out.println("Without inform apllying leave is not allowed");
		return false;
	}

	@Override
	public boolean wfh() {
		System.out.println("Work from home is allowed only in covid pandemic");
		return false;
	}

	@Override
	public boolean applyLeaves() {
		System.out.println("Only Emergency leaves are available ");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("Harrasment is crime");
		return false;
	}

	public static void main(String[] args) {
		ITRuleFollower itrules = new ITRuleFollower();
		itrules.swipeCard();
		itrules.parkingAproval();
		itrules.informLeave();
		itrules.applyLeaves();
		itrules.harrasment();
		System.out.println("object created for HrRules Interface");
		HrRules hr = new ITRuleFollower();
		hr.applyLeaves();
		hr.harrasment();
		System.out.println("Object created for ManagerRules ");
		ManagerRules manage = new ITRuleFollower();
		manage.informLeave();
		manage.wfh();
		System.out.println("Object created for SecurityRules");
		SecurityRules security = new ITRuleFollower();
		security.parkingAproval();
		security.swipeCard();

	}

}
