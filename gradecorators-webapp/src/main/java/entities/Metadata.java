package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Metadata {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MetaDataId",length = 10)
	private int id;
	
	@Column(name="Metadata")
	private String metadata;
	
	@Column(name="ImagePath")
	private String imagepath;
	
	@Column(name="VideoPath")
	private String videopath;
	
	@OneToOne(mappedBy = "metaData")
	private Product product;
	
	@OneToOne(mappedBy = "metaData")
	private Category category;

	public Metadata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metadata(String metadata, String imagepath, String videopath, Product product, Category category) {
		super();
		this.metadata = metadata;
		this.imagepath = imagepath;
		this.videopath = videopath;
		this.product = product;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getVideopath() {
		return videopath;
	}

	public void setVideopath(String videopath) {
		this.videopath = videopath;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "MetaData [id=" + id + ", metadata=" + metadata + ", imagepath=" + imagepath + ", videopath=" + videopath
				+ ", product=" + product + ", category=" + category + "]";
	}

	

	
	
}