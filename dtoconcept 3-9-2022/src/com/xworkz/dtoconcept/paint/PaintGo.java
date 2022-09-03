package com.xworkz.dtoconcept.paint;

public class PaintGo {

	public static void main(String[] args) {
		System.out.println("First Instance Of PaintGo");
		PaintDTO paint = new PaintDTO();
		paint.setColor("Blue");
		paint.setName("Asian Paint");
		paint.getType();
		paint.setPrice(450);
		paint.setColorcode(02154);
		paint.setDistumper(false);
		paint.setUseOfWater(true);
		paint.setUseOfTinner(false);
		System.out.println("Second Instance Of PaintGo");
		PaintDTO paint1 = new PaintDTO();
		paint1.setColor("green");
		paint1.setName("Asian Paint");
		int code = paint.hashCode();
		System.out.println(code);
		System.out.println(System.identityHashCode(paint)+" "+System.identityHashCode(paint1));
		if (paint.hashCode() == paint1.hashCode()) {
			System.out.println(paint.equals(paint1));
		} else {
			System.err.println(false);
		}

	}

}
