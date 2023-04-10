package chap98_homework;

public class HistoricPerson {
	private String name;
	private String achievement;
	private String country;
	
	public HistoricPerson(String name, String achievement, String country) {
		this.name = name;
		this.achievement = achievement;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "HistoricPerson [name=" + name + ", achievement=" + achievement + ", country=" + country + "]";
	}

	public void getPersonInfo(String achievement) {
		if(this.achievement.equals(achievement)) {
			System.out.println(this.name + " " + this.achievement + " " + this.country);
		}
	}
	
	public boolean getSameCountryPerson(String country) {
		boolean sameCountry = false;
		if(this.country == country) {
			sameCountry = true;
		}
		return sameCountry;
	}
	
}
