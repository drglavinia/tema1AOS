
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	// properties
	@Id
	@GeneratedValue
	@Column(name = "personId")
	private Integer id;
	private String name;
	private String email;
		

	// constructors
	public Person() {
		this.name=null;
		this.email=null;
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
		
	}

	// getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
