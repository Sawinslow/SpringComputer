package dmacc.computer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class computers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String type;
	private String cpuType;
	@Autowired
	private Memory memory;

	@Override
	public String toString() {
		return "computers [id=" + id + ", brand=" + brand + ", type=" + type + ", cpuType=" + cpuType + ", memory="
				+ memory + "]";
	}

	public computers(long id, String brand, String type, String cpuType, Memory memory) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.cpuType = cpuType;
		this.memory = memory;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public computers(long id, String brand, String type, String cpuType) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.cpuType = cpuType;
	}

	public computers(String brand, String type, String cpuType) {
		super();
		this.brand = brand;
		this.type = type;
		this.cpuType = cpuType;
	}

	public computers(String brand) {
		super();
		this.brand = brand;
	}
	public computers() {
		super();
		this.cpuType = "Intel";
	}

}
