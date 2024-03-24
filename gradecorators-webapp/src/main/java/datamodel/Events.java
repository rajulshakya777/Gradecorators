package datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EventTable")
public class Events {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") // specify the column name. Without it, it will use method name
	private Integer id;
	
	@Column(name = "EventType")
	private String eventType;
	
	@Column(name = "EventName")
	private String EventName;
	
	@Column(name = "Price")
	private int Price;
	
	@Column(name = "TextDescription")
	private String TextDescription;
	
	@Column(name = "ImagePath")
	private String ImagePath;

	
	
	public Events(String eventType, String eventName, int price, String textDescription, String imagePath) {
		super();
		this.eventType = eventType;
		this.EventName = eventName;
		this.Price = price;
		this.TextDescription = textDescription;
		this.ImagePath = imagePath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getTextDescription() {
		return TextDescription;
	}

	public void setTextDescription(String textDescription) {
		TextDescription = textDescription;
	}

	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}
	
	@Override
	public String toString() {
		return "Event:" + this.EventName+" "+ this.EventName + " (" + this.Price + ")";
	}
}
