package nghiapt.edu.demo.designPattern.singleton;

/**
 * Thêm toán tử synchronized để đồng bộ hóa: để chỉ một luồng có thể thực thi
 * phương thức này tại một thời điểm.
 * 
 * @author ptnghia4
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
//		if (instance == null) {
//			instance = new ThreadSafeSingleton();
//		}
//		return instance;
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
