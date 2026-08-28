package com.polymorphism;



public class RideBookingSystem
{

	public static void main(String[] args) {
		Ride r;
		r = new BikeRide(10);
		System.out.println(r.calculateFare());
		r = new AutoRide(10);
		System.out.println(r.calculateFare());
		r = new CabRide(10);
		System.out.println(r.calculateFare());
		CabRide c = new CabRide(10);
		System.out.println(c.calculateFare(1.5));
	}

}

class Ride{
	protected double distance;
	Ride(double distance){
		this.distance=distance;
	}
	public double calculateFare() {
		return 0.0;
	}
	public double calculateFare(double surgeMultiplier) {
		return 0.0* surgeMultiplier;
	}
}
class BikeRide extends Ride{
	BikeRide(double distance) {
		super(distance);
		
	}
	public double calculateFare() {
		return (distance*5);
	}

	@Override
	public double calculateFare(double surgeMultiplier) {
		return calculateFare()*surgeMultiplier;
	}
}
class AutoRide extends Ride{
	AutoRide(double distance) {
		super(distance);
		
	}
	public double calculateFare() {
		return (distance*10 );
	}

	@Override
	public double calculateFare(double surgeMultiplier) {
		return calculateFare()*surgeMultiplier;
	}
}
class CabRide extends Ride{
	CabRide(double distance) {
		super(distance);
		
	}
	public double calculateFare() {
		return (distance*15 + 50 );
	}
	@Override
	public double calculateFare(double surgeMultiplier) {
		return calculateFare()*surgeMultiplier;
	}
}