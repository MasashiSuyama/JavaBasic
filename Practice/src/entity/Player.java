package entity;

public class Player {
	private String position;
	private String name;
	private String country;
	private String team;
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return position;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}

	public String toString() {
		return this.position +","+ this.name +","+ this.country +","+ this.team;
	}
}
