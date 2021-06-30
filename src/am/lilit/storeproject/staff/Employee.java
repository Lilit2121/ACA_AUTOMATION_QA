package am.lilit.storeproject.staff;

import am.lilit.storeproject.staff.base.Person;
import am.lilit.storeproject.store.Store;

public class Employee extends Person {

     private Store workplace;
     private long salary;
     private Profession profession;

     public Employee(String name, String lastName, short age, Store workplace, long salary, Profession profession) {
          super(name, lastName, age);
          this.workplace = workplace;
          this.salary = salary;
          this.profession = profession;
     }

     public Store getWorkplace() {
          return workplace;
     }

     public void setWorkplace(Store workplace) {
          this.workplace = workplace;
     }

     public long getSalary() {
          return salary;
     }

     public void setSalary(long salary) {
          this.salary = salary;
     }

     public Profession getProfession() {
          return profession;
     }

     public void setProfession(Profession profession) {
          this.profession = profession;
     }
}
