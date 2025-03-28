# Path Variable
## class MainAPIpoint with @SpringBootApplication
### main method 
    - SpringApplication.run(MainAPIPoint.class,arg);
## inner class student is an POJO 
   - String name,city and Integer age, section
   - getter and setter
## After that create an list<Student> for create an list
   - private static List<Student> student;
## static block inside add 4 student on that list
```
    static {
        student = new ArrayList<>();
     student.add(new Student("raj",21,"hyderabad",11));
     student.add(new Student("raja",34,"hyderabad",13));
     student.add(new Student("mohan",55,"hyderabad",12));
     student.add(new Student("tom",65,"hyderabad",16));
    }
```	
## @RestController above class MainAPIPoint then @GetMapping("api")
   - @GetMapping("api")
   -	public List<Student> getStudent() { 
   -		return student;
   -	}
