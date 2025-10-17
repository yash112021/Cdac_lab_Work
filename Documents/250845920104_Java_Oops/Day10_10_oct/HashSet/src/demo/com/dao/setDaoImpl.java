package demo.com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import demo.com.beans.EmployeeSet;

public class setDaoImpl implements setDao {
	
	static Set <EmployeeSet> eset;
	
	static {
		eset = new HashSet<>();
		eset.add(new EmployeeSet(100, "Jyoti", 45090, LocalDate.of(2024, 02, 06)));
		eset.add(new EmployeeSet(102, "Swati", 42090, LocalDate.of(2023, 06, 02)));
		eset.add(new EmployeeSet(103, "Kirti", 33090, LocalDate.of(2025, 04, 05)));
	}

	@Override
	//adding employee
	public boolean save(EmployeeSet e) {
		
		return eset.add(e);
	}

	@Override
	public Set<EmployeeSet> displayAll() {
		return eset;
	}

	// finding the employee by the id
	@Override
	public EmployeeSet searchById(int id) {
//		for(EmployeeSet x:eset) {
//				if(x.getId()==id) {
//					return x;
//				}
//			
//		}
		
		// now by using the stream and filter
		Optional<EmployeeSet> ob= eset.stream().filter(e->e.getId()==id).findFirst();
		 if(ob.isPresent()) {
			 return ob.get();
		 }
//	
//		Optional <EmployeeSet> e1 =eset.stream().filter(e->e.getId()==id).findFirst();
//		if(e1.isPresent()) {
//			return e1.get();
//		}
		 return null;

	}

	
	// writing whose one whose name is same
	@Override
	public Set<EmployeeSet> serachByName(String nm) {
		
		// using the stream and filter
//		Set<Employee> es = eset.stream().filter(e->e.getEname().equals(nm)).collect(Collectors.toSet());
	    
		Set<EmployeeSet> abc=eset.stream().filter(e->e.getName().equals(nm)).collect(Collectors.toSet());
		
	
		if(abc.size()>0) {
			return abc;
		}
	
		
		return null;
	}

	// update sal by id 
	@Override
	public boolean uptSalById(int a, double sal) {
		EmployeeSet e=searchById(a);
		
		if(e!=null) {
			e.setSal(sal);
			return true;
		}
		
		
		return false;
	}

	
	//delete by id 
	@Override
	public boolean deleteById(int id) {
	return eset.remove(searchById(id));
	}

	@Override
	public boolean deleteBySal(double sal) {
		
		return eset.removeIf(e -> e.getSal() > sal);
	}

	//search by salary
	@Override
	public Set<EmployeeSet> searchBySal(double sal) {
		
		Set<EmployeeSet> es = eset.stream().filter(e ->(e.getSal() > sal)).collect(Collectors.toSet());
		return es;
	}

	@Override
	public List<EmployeeSet> sortBySal() {
	
		
		
		Comparator <EmployeeSet> abg = (o1,o2) -> {
		 return (int) (o1.getSal() - o2.getSal());
		} ;
		
		// first creating the array list
		List<EmployeeSet> abgh= new ArrayList<>();
		
		// using for loop to copy the dat
		for(EmployeeSet x:eset) {
			abgh.add(x);
		}
		
		abgh.sort(abg);
		
		return abgh;
	}

		@Override
		public List<EmployeeSet> sortbyName() {
			// comparator
			Comparator<EmployeeSet> c=(o1,o2)->{
				return o1.getName().compareTo(o2.getName());
			};
		
		// first creating the array list
		List<EmployeeSet> abgh= new ArrayList<>();
		
		// using for loop to copy the dat
		for(EmployeeSet x:eset) {
			abgh.add(x);
		}
		
		abgh.sort(c);
		
		return abgh;
	}

	

}
