package com.crm.ass3;

import java.util.HashMap;

public class AgentVO extends VOBase{
	protected final String[] default_facet = {"ID", "Name", "Email", "PhoneNo", "CustomerList"};
	
	public IDVO retrieveID(){
		return (IDVO)this.retrieveFacet(default_facet[0]);
	}
	
	public NameVO retrieveName(){
		return (NameVO)this.retrieveFacet(default_facet[1]);
	}
	
	public EmailVO retrieveEmail(){
		return (EmailVO)this.retrieveFacet(default_facet[2]);
	}
	
	public PhoneVO retrievePhone(){
		return (PhoneVO)this.retrieveFacet(default_facet[3]);
	}
	
	
	
	public AgentVO(String id, String name, String email, String phone){
		this.myFacets = new HashMap<String , VOBase>();
		
		IDVO iv = new IDVO(id);
		NameVO nv = new NameVO(name);
		EmailVO ev = new EmailVO(email);
		PhoneVO pv = new PhoneVO(phone);
		
		this.createFacet(default_facet[0], (VOBase)iv);
		this.createFacet(default_facet[1], (VOBase)nv);
		this.createFacet(default_facet[2], (VOBase)ev);
		this.createFacet(default_facet[3], (VOBase)pv);
	}
}
