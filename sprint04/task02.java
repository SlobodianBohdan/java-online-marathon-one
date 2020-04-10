Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.fullName = "Tania";
        emp1.salary = 1000;
        emp2.fullName = "Taras";
        emp2.salary =1100;

        Employee[] employees = {emp1,emp2};

        String employeesInfo = "";
        int count = 0;
        for (Employee employee : employees) {
            if (count == 0){
                employeesInfo += "[";
            }
            employeesInfo += "{fullName: \"" +employee.fullName + "\", salary: " + employee.salary + "}";
            count++;
            if (count != employees.length){
                employeesInfo += ", ";
            }else {
                employeesInfo += "]";
            }
        }
