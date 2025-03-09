package com.als.jdbc.seat;

public class Seat {
	private int seatNo;
	private String seatRow;
	private int seatNumber;
	public Seat(int seatNo, String seatRow, int seatNumber) {
		super();
		this.seatNo = seatNo;
		this.seatRow = seatRow;
		this.seatNumber = seatNumber;
	}
	public Seat() {
		super();
	}
	public Seat(String seatRow, int seatNumber) {
		super();
		this.seatRow = seatRow;
		this.seatNumber = seatNumber;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getSeatRow() {
		return seatRow;
	}
	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "Seat [seatNo=" + seatNo + ", seatRow=" + seatRow + ", seatNumber=" + seatNumber + "]";
	}


}

