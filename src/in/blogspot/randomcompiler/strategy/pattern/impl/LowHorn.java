package in.blogspot.randomcompiler.strategy.pattern.impl;

import in.blogspot.randomcompiler.strategy.pattern.api.Horn;

public class LowHorn implements Horn {
	public void honk() {
		System.out.println("Honking low");
	}
}