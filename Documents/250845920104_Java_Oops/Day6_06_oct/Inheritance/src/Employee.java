import java.util.*;
import java.util.Date;
public class Employee extends Person {
		
		private String dept;
		private String desgn;
		
		
		
		public Employee() {
			super();
		}



		public Employee(String name, Date bdt, String dept, String desgn) {
			super(name,bdt);
			this.dept = dept;
			this.desgn = desgn;
		}



		public String getDept() {
			return dept;
		}



		public void setDept(String dept) {
			this.dept = dept;
		}



		public String getDesgn() {
			return desgn;
		}



		public void setDesgn(String desgn) {
			this.desgn = desgn;
		}



		@Override
		public String toString() {
			return "Employee [dept=" + dept + ", desgn=" + desgn + ", toString()=" + super.toString() + "]";
		}



		

		
				
}
