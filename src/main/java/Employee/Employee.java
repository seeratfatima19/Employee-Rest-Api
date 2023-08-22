package Employee;

public class Employee {
    // write attributes for employee class
        private String name;
        private int age;
        private String city;
        private String id;
        private String department;
        private String position;

        public Employee(String name, int age, String city, String id, String department, String position) {
            this.name = name;
            this.age = age;
            this.city = city;
            this.id = id;
            this.department = department;
            this.position = position;
        }
        // write getters for all attributes
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getCity() {
            return city;
        }
        public String getId() {
            return id;
        }
        public String getDepartment() {
            return department;
        }
        public String getPosition() {
            return position;
        }
        // write setters for all attributes
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            if (age > 0 && age < 100) {
                this.age = age;
            }
        }
        public void setCity(String city) {
            this.city = city;
        }
        public void setId(String id) {
            this.id = id;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        public void setPosition(String position) {
            this.position = position;
        }
        // write a method to display the employee details
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Position: " + position);
        }
}


