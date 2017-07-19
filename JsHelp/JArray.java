package JsHelp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class JArray<T> {
	private List<T> mainData = new ArrayList<T>();
	public int length;

	private void upDataLength() {
		this.length = this.mainData.size();
	}

	public JArray() {

	}

	public JArray(T[] arr) {
		mainData = new ArrayList<T>();
		for (int i = 0; i < arr.length; i++) {
			this.push(arr[i]);
		}
	}

	public JArray(List<T> list) {
		this.mainData = list;
		this.upDataLength();
	}

	public int push(T a) {
		this.mainData.add(a);
		this.upDataLength();
		return this.length;
	}

	public T pop() {
		T lst = this.mainData.remove(this.mainData.size() - 1);
		this.upDataLength();
		return lst;
	}

	public T shift() {
		T lst = this.mainData.remove(0);
		this.upDataLength();
		return lst;
	}

	public int unshift(T a) {
		this.mainData.add(0, a);
		this.upDataLength();
		return this.length;
	}

	public T get(int index) {
		return this.mainData.get(index);
	}

	public T set(int index, T a) {
		return this.mainData.set(index, a);
	}

	public JArray<T> slice(int n) {
		return this.slice(n, this.length);
	}

	public JArray<T> slice(int n, int m) {
		return new JArray<T>(this.mainData.subList(n, m));
	}

	public T remove(int n) {
		return this.mainData.remove(n);
	}

	public void clear() {
		this.mainData.clear();
	}

	public T[] toArray() {
		if(this.length > 0) {
			Class<?> aClass = this.mainData.get(0).getClass();
			return this.mainData.toArray((T[]) Array.newInstance(aClass, 0));
		}
		return null;
	}

	public int indexOf(T a) {
		int g = -1;
		for (int i = 0; i < this.length; i++) {
			if (this.mainData.get(i) == a) {
				g = i;
			}
		}
		return g;
	}
}
