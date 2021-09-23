package ru.dburdin.jaspertemplates.dto.camel;

public class DocumentRequest {
	private String name;
	private Integer age;

	public DocumentRequest() {
	}

	public DocumentRequest(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DocumentRequest{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
