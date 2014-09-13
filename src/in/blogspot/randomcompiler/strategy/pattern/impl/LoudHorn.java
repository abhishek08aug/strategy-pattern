package in.blogspot.randomcompiler.strategy.pattern.impl;

import in.blogspot.randomcompiler.strategy.pattern.api.Horn;

public class LoudHorn implements Horn {
	public void honk() {
		System.out.println("Honking loud");
	}
}