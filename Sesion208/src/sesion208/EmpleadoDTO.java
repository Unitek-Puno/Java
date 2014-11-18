/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion208;

import java.sql.Date;

/**
 *
 * @author fr3dy
 */
public class EmpleadoDTO {
    private int empno;
    private String ename;
    private Date hiredate;
    private int deptno;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    
    
    
    public String toString()
    {
        return empno + "" + ename + "" + hiredate + "" + deptno;
    }
}
