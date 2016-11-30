package JsHelp;
import java.util.ArrayList;
public class JArray {
	private ArrayList mainData = new ArrayList();
	public int length;
	private void upDataLength(){
		this.length = this.mainData.size();
	}
	public <A> A push(A a){
		this.mainData.add(a);
		this.upDataLength();
		return a;
	}
	public String pop(){
		String lst = this.mainData.remove(this.mainData.size()-1).toString();
		this.upDataLength();
		return lst;
	}
	public String shift(){
		String lst = this.mainData.remove(0).toString();
		this.upDataLength();
		return lst;
	}
	public <B> B unshift(B a){
		this.mainData.add(a);
		this.upDataLength();
		return a;
	}
	public String get(int index){
		return this.mainData.get(index).toString();
	}
	public <C> String set(int index,C a){
		return this.mainData.set(index,a).toString();
	}
	public <D> Object slice(int n,int m){
		return this.mainData.subList(n,m);
	}
	public String remove(int n){
		return this.mainData.remove(n).toString();
	}
	public void clear(){
		this.mainData.clear();
	}
	public Object[] toArray(){
		return this.mainData.toArray();
	}
	public Object clone(){
		return this.mainData.clone();
	}
	public <F> int indexOf(F a){
		int g = -1;
		for(int i = 0; i<this.length; i++){
			if(this.mainData.get(i) == a){
				g = i;
			}
		}
		return g;
	}
}
