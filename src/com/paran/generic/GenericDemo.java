package com.paran.generic;

public class GenericDemo {
	public static void main(String[] args){
		System.out.println(GenericArithmetic.add(1, 2));
		System.out.println(GenericArithmetic.add(1.1, 2.3));
		System.out.println(GenericArithmetic.subtract(3, 2));
		System.out.println(GenericArithmetic.subtract(3.1, 2.3));
		
		FruitBox<BlueBerry> fruitBox = new FruitBox<BlueBerry>();
		fruitBox.showInfo();
	}
}

class GenericArithmetic{
	public static <T extends Number> T add(T x, T y){
		Number result = null;
		if(x instanceof Integer){// x.getClass() == Interger.class
			result = (Integer)x+(Integer)y;
		}else if(x instanceof Double){
			result = (Double)x+(Double)y;
		}
		return (T)result;
	}
	public static <T extends Number> Number subtract (T x, T y){
		Number result = null;
		if(x instanceof Integer){// x.getClass() == Interger.class
			result = (Integer)x-(Integer)y;
		}else if(x instanceof Double){
			result = (Double)x-(Double)y;
		}
		return result;
	}
}

class FruitBox<T>{
	private T item;
	public void fruitBox(T item){
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public void showInfo(){
		if(item instanceof Banana){
			((Banana)item).showInfo();			
		}
	}
}
class Banana{
	public void showInfo(){
		System.out.println("I'm banana");
	}
}
class BlueBerry{
	
}