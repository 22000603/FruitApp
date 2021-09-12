package com.example.week2;

import java.util.Comparator;

public class Fruit {

	int no;
	String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public void setNo(int no) {
		// TODO Auto-generated method stub
		this.no = no;
	}
	public int getNo() {
		return no;}
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	public String getName() {
		return name;}
	
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	static class FruitComparator implements Comparator<Fruit>{
		
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	static class FruitComparatorDesc implements Comparator<Fruit>{
		
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
	}

}