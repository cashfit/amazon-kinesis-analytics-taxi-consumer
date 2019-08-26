package com.amazonaws.samples.kaja.taxi.consumer.events.es;

public class TripAmount extends Document {
	  public final double amount  ;

	  public TripAmount(double amount, long timestamp) {
	    super(timestamp);

	    this.amount = amount;
	  }
}