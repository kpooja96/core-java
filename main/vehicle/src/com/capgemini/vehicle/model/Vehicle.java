package com.capgemini.vehicle.model;

public class Vehicle {
	
	
	    
		public static final String TURN_LEFT = null;
		private double currentSpeed;
	    private double currentDirections;
	    private String ownerName;
	    private double vehicleId;
	    private static int highestVehicleId;
		public static String TURN_LEFT1;
		public static String TURN_RIGHT;
		
		
	    
	    public Vehicle() {
			super();
			
		}


		


		public Vehicle(double currentSpeed, double currentDirections, String ownerName, double vehicleId) {
			super();
			this.currentSpeed = currentSpeed;
			this.currentDirections = currentDirections;
			this.ownerName = ownerName;
			this.vehicleId = vehicleId;
		}

		

		

		public double getCurrentSpeed() {
			return currentSpeed;
		}





		public void setCurrentSpeed(double currentSpeed) {
			this.currentSpeed = currentSpeed;
		}





		public double getCurrentDirections() {
			return currentDirections;
		}





		public void setCurrentDirections(double currentDirections) {
			this.currentDirections = currentDirections;
		}





		public String getOwnerName() {
			return ownerName;
		}





		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}





		public double getVehicleId() {
			return vehicleId;
		}





		public void setVehicleId(double vehicleId) {
			this.vehicleId = vehicleId;
		}





		public static int getHighestVehicleId() {
			return highestVehicleId;
		}





		public static void setHighestVehicleId(int highestVehicleId) {
			Vehicle.highestVehicleId = highestVehicleId;
		}





		public Object changeSpeed1(int i) {
			// TODO Auto-generated method stub
			return null;
		}





		public Object changeSpeed(int i) {
			// TODO Auto-generated method stub
			return null;
		}





		public Object getTurnOption() {
			
			return null;
		}





		public Object ChangeDirection1(int i, int j) {
			
			return null;
		}





		public Object ChangeDirection(int i, int j) {
			
			return null;
		}





		public Object stop() {
			
			return null;
		}





		

		
	    
	    
	    
	    

}
