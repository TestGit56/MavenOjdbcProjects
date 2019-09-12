package com.datageeks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RegularEmployee regemp = new RegularEmployee(1421, "Shiva",15000f, 700f);
        
        ContractEmployee conemp = new ContractEmployee(1532, "SaiKumar",500f, "Two-year");
        
        Employee emp = new Employee(1242, "srinu");
        
        EmployeeDAO dao = new EmployeeDAO();
        
        dao.saveOrUpdate(emp);
        dao.saveOrUpdate(regemp);
        dao.saveOrUpdate(conemp);
        
        
        //dao.delete(1421);
    }
}
