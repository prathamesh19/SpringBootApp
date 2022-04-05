package com.prathamesh.model;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGen implements IdentifierGenerator{
@Override
public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

	String prefix ="ST";
	String suffix ="CHD";
	
	int num = new Random().nextInt(1000);
	
	
	return prefix+"-"+num+"-"+suffix;
}
}
