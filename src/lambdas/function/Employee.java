package lambdas.function;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Employee {
	Integer id;
	String name;
	Double salary;
	String country;
	LocalDate birth;
	String email;
	public Employee(String name, Double salary, String country, LocalDate birth) {
		super();
		this.name = name;
		this.salary = salary;
		this.birth = birth;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setEmail(Supplier<String> email) {
		this.email = email.get();
	}
	public void setId(Supplier<Integer> s) {
		this.id = s.get();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + ", birth="
				+ birth + ", email=" + email + "]";
	}

	

}
