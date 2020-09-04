package edu.htu.upskilling.jdbc;

import java.io.Serializable;

public class University implements Serializable {
	private Integer id;
	private String name;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	private String field7;

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}

	public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}

	public void setField2(String field2){
	  this.field2=field2;
	}
	
	public String getField2(){
	 return this.field2;
	}

	public void setField3(String field3){
	  this.field3=field3;
	}
	
	public String getField3(){
	 return this.field3;
	}

	public void setField4(String field4){
	  this.field4=field4;
	}
	
	public String getField4(){
	 return this.field4;
	}

	public void setField5(String field5){
	  this.field5=field5;
	}
	
	public String getField5(){
	 return this.field5;
	}

	public void setField6(String field6){
	  this.field6=field6;
	}
	
	public String getField6(){
	 return this.field6;
	}

	public void setField7(String field7){
	  this.field7=field7;
	}
	
	public String getField7(){
	 return this.field7;
	}


	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId() == ((University) obj).getId();
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.name).append(",");
	  buf.append(this.field2).append(",");
	  buf.append(this.field3).append(",");
	  buf.append(this.field4).append(",");
	  buf.append(this.field5).append(",");
	  buf.append(this.field6).append(",");
	  buf.append(this.field7).append(",");
	  return buf.toString();
	}
}