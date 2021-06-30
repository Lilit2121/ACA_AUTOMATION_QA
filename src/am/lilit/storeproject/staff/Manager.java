package am.lilit.storeproject.staff;

import am.lilit.storeproject.store.Store;
import am.lilit.storeproject.util.ProfessionException;

public class Manager extends Employee{


   private Employee[] reporters;

   public Manager(String name, String lastName, short age, Store workplace, long salary, Profession profession, Employee[] reporters) {
      super(name, lastName, age, workplace, salary, profession);



      if(!profession.HasFinancialAccess()){

       throw new ProfessionException("Manager should have financial access");

      }

      this.reporters = reporters;
   }

   public Employee[] getReporters() {
      return reporters;
   }

   public void setReporters(Employee[] reporters) {
      this.reporters = reporters;
   }
}
