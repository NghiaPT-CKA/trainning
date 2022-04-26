package nghiapt.edu.demo.designPattern.singleton;

/**
 * instance chỉ được khởi tạo khi được sử dụng.
 * Không tốt khi chạy đa luồng
 * 
 * @author ptnghia4
 *
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
