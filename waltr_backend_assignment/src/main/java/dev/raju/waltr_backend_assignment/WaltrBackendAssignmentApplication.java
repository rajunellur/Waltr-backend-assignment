package dev.raju.waltr_backend_assignment;

import dev.raju.waltr_backend_assignment.model.Employee;
import dev.raju.waltr_backend_assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaltrBackendAssignmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WaltrBackendAssignmentApplication.class, args);
	}

	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Raju");
		employee.setLastName("jk");
		employee.setEmailId("rajujk@gmail.com");

		Employee employee1 = new Employee();
		employee1.setFirstName("Ramesh");
		employee1.setLastName("HN");
		employee1.setEmailId("rameshhn@gmail.com");

		Employee employee2 = new Employee();
		employee2.setFirstName("John");
		employee2.setLastName("Cena");
		employee2.setEmailId("johncena@gmail.com");

	}
}
