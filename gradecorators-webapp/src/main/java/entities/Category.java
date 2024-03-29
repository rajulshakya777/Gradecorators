package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CategoryId",length = 10)
	private int id;
	
	@Column(name = "CategoryName", nullable = false)
	private String categoryName;
	
	@OneToOne
	private Metadata metaData;
	
	@OneToMany(mappedBy = "category")
	private List<Product> productList = new ArrayList<Product>();
	

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, Metadata metaData, List<Product> productList) {
		super();
		this.categoryName = categoryName;
		this.metaData = metaData;
		this.productList = productList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Metadata getMetaData() {
		return metaData;
	}

	public void setMetaData(Metadata metaData) {
		this.metaData = metaData;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", metaData=" + metaData + ", productList="
				+ productList + "]";
	}

	
}
