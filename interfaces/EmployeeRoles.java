package com.interfaces;

public interface EmployeeRoles {

	interface Trainer {
	    void teach();
	}

	interface Developer {
	    void developProject();
	}

	class TechLead implements Trainer, Developer {

		public void teach() {
	        System.out.println("TechLead: Teaching team members...");
	    }

	    public void developProject() {
	        System.out.println("TechLead: Developing the project...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        TechLead lead = new TechLead();
	        lead.teach();
	        lead.developProject();
	    }
	}

}
