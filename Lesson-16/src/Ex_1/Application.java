package Ex_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<Car> car = Car.class;
		
		System.out.println("Ім'я класу: " + car.getName());
		System.out.println("Ім'я цього класу: " + car.getSimpleName());
		System.out.println("Ім'я Текі класу: " + car.getPackageName());
		System.out.println("Ім'я модифікатора класу: " + Modifier.toString(car.getModifiers()));
		System.out.println("Ім'я Батьківського класу: " + car.getSuperclass());
		System.out.println("Поля класу: ");
		Field[] carFields = car.getDeclaredFields();
		for (int i = 0; i < carFields.length; i++) {
			Field field = carFields[i];
			System.out.println(field);
		}
		System.out.println();
		
		Constructor[] carConstructors=car.getConstructors();
		for (int i = 0; i < carConstructors.length; i++) {
			Constructor constructor = carConstructors[i];
			System.out.println(constructor);
		}
		System.out.println();
		
		Method[] carMethods = car.getDeclaredMethods();
		for (int i = 0; i < carMethods.length; i++) {
			Method method = carMethods[i];
			System.out.println(method);
		}
		System.out.println();
		
		Constructor<Car>constructor = car.getConstructor(String.class, int.class);
		Car newInstanse = constructor.newInstance("Ford", 1988);
		
		System.out.println(newInstanse);
		
		System.out.println();
		
		Field fieldName = car.getField("modelCar");
		fieldName.set(newInstanse, "Pontiac");
		
		System.out.println(newInstanse);
		System.out.println();
		
		Field fieldName2 = car.getField("year");
		fieldName2.set(newInstanse, 2000);
		
		System.out.println(newInstanse);
		System.out.println();
		
		Method carMethod = car.getMethod("getModelCar", null);
		carMethod = car.getMethod("speed", String.class);
		carMethod.invoke(newInstanse, "Gavryluk");
		
		Method carMethod2 = car.getMethod("getYear", null);
		carMethod2 = car.getMethod("oilType", int.class);
		carMethod2.invoke(newInstanse, 1040);
		
		

	}

}
