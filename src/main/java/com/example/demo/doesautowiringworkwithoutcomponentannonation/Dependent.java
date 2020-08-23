package com.example.demo.doesautowiringworkwithoutcomponentannonation;

public class Dependent {

	private Dependency dependency;

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}
}
