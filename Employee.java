package com.Question8;

public class Employee {
	  int id;
	   public int getId() {
	        return id;
	    }
	   public void setId(int id) {
	        this.id = id;
	    }
	   @Override
	    public String toString() {
	        return "Employee [id=" + id + "]";
	    }
	   public Employee(int id) {
	        super();
	        this.id = id;
	    }

	   public Employee() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	   @Override
	    protected void finalize() throws Throwable {
	        System.out.println("id= " + this.id);
	    }
}
