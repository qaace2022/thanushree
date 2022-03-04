package bankproject;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customers {
	int id;
	String name;
	List<Dcards> cards;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Dcards> getCards() {
		return cards;
	}
	public void setCards(List<Dcards> cards) {
		this.cards = cards;
	}
}
