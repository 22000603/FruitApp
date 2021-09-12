package com.example.week2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import com.example.week2.Fruit.FruitComparator;
import com.example.week2.Fruit.FruitComparatorDesc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Fruit> list = new ArrayList<Fruit>();
			
		list.add(new Fruit(1, "사과", 1000));
		list.add(new Fruit(2, "포도", 3000));
		list.add(new Fruit(3, "복숭아", 3000));
		list.add(new Fruit(4, "수박", 4000));
		list.add(new Fruit(5, "자두", 2000));
		list.add(new Fruit(6, "레몬", 2000));
		list.add(new Fruit(7, "블루베리", 3000));
		list.add(new Fruit(8, "자몽", 3000));
		list.add(new Fruit(9, "귤", 4000));
		list.add(new Fruit(10, "바나", 2000));
		
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(list, new FruitComparator());
		for(Fruit obj : list ) {
			System.out.println(obj.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(list, new FruitComparatorDesc());
		for(Fruit obj : list ) {
			System.out.println(obj.toString());
		}

	}
}