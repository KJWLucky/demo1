package test;

public class Demo1 {
	private Integer a;
	private Integer b;
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Demo1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void Add() {
		System.out.println(a + b);
	}
}
