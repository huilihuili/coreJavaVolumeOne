package cn.leagle.ch13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	/**   
	 * @Title: MapTest   
	 * @Description: 
	 * @param args    
	 */
	public static void main(String[] args) {
		Map<String, Employee> staff = new HashMap<String, Employee>();
		staff.put("144-25-5464", new Employee("Lee"));
		staff.put("144-24-5464", new Employee("Leagle"));
		staff.put("144-23-5464", new Employee("Sun"));
		
		System.out.println(staff);
		staff.remove("144-25-5464");
		staff.put("144-23-5464", new Employee("Sunshine"));
		System.out.println(staff.get("144-23-5464"));
		
		for (Map.Entry<String, Employee> entry: staff.entrySet()) {
			String key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}
	}


}


class Employee {

	public Employee(String n) {
		name = n;
		salary = 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	private String name;
	private double salary;
}
