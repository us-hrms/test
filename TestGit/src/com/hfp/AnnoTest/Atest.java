package com.hfp.AnnoTest;

import java.lang.reflect.Field;

import org.junit.Test;

import com.hfp.anno.Column;
import com.hfp.anno.Table;
import com.hfp.entity.Demo;

public class Atest {
	
	@Test
	public void a(){
		Demo demo = new Demo("aaa","bbb");
		Field [] demoFields = Demo.class.getDeclaredFields();
		System.out.println(Demo.class.getAnnotation(Table.class));
		for (Field field : demoFields) {
			Column anno = field.getAnnotation(Column.class);
			System.out.println(anno.value());
		}
	}
}
