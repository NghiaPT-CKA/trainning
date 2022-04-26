package nghiapt.edu.demo.designPattern.factory;

import nghiapt.edu.demo.designPattern.factory.model.Animal;
import nghiapt.edu.demo.designPattern.factory.model.Cat;
import nghiapt.edu.demo.designPattern.factory.model.Dog;
import nghiapt.edu.demo.designPattern.factory.model.Pig;

/**
 * khởi tạo các object mà không cần tiếp xúc trực tiếp với các object.
 * 
 * @author ptnghia4
 *
 */
public class AnimalFactory {
	public Animal getAnimal(String animal) {
		if (animal.equals(null))
			return null;

		if (animal.equalsIgnoreCase("Con chó")) {
			return new Dog();
		} else if (animal.equalsIgnoreCase("Con mèo")) {
			return new Cat();
		} else if (animal.equalsIgnoreCase("Con lợn")) {
			return new Pig();
		}
		return null;
	}
}
