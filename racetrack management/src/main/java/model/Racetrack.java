package model;

public class Racetrack {
	Long trackId;
	String trackType;
	int trackCapacity;
	int trackCostPerHour;
	
	public Racetrack() {}
	
	
	public Racetrack(String trackType, int trackCapacity, int trackCostPerHour) {
		super();
		this.trackType = trackType;
		this.trackCapacity = trackCapacity;
		this.trackCostPerHour = trackCostPerHour;
	}


	public Long getTrackId() {
		return trackId;
	}


	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}


	public String getTrackType() {
		return trackType;
	}


	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}


	public int getTrackCapacity() {
		return trackCapacity;
	}


	public void setTrackCapacity(int trackCapacity) {
		this.trackCapacity = trackCapacity;
	}


	public int getTrackCostPerHour() {
		return trackCostPerHour;
	}


	public void setTrackCostPerHour(int trackCostPerHour) {
		this.trackCostPerHour = trackCostPerHour;
	}


	@Override
	public String toString() {
		return "Racetrack [trackId=" + trackId + ", trackType=" + trackType + ", trackCapacity=" + trackCapacity
				+ ", trackCostPerHour=" + trackCostPerHour + "]";
	}
	
	
	
	
}
