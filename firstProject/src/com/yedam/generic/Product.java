package com.yedam.generic;

public class Product<T, M> {
	
	M model;
	T type;

	public void setModel(M model) {
		// TODO Auto-generated method stub
		this.model=model;
		
	}

	public void setType(T type) {
		// TODO Auto-generated method stub
		this.type= type;
	}

	public T getType() {
		
		return type;
	}

	public M getModel() {
		
		return model;
	}


}
