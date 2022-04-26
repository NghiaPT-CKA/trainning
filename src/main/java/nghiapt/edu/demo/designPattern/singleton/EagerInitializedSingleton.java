package nghiapt.edu.demo.designPattern.singleton;

/**
 * Đảm bảo chỉ tồn tại 1 instance duy nhất bằng cách khởi tạo đối tượng private stactic final
 * Cung cấp một method static để trả về instance
 * @author ptnghia4
 *
 */
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton(){}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
