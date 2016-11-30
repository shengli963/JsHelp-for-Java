package JsHelp;
import JsHelp.JArray;
public class JMap {
	private JArray key = new JArray();
	private JArray value = new JArray();
	private int item = 0;
	private boolean stop = false;
	private JArray forEachs = new JArray();
	public Object[] next(){
		if(stop){
			this.item=0;
			this.stop = false;
		}
		return this.forEachs.toArray();
	}
	public <K,V> String set(K a,V b){
		this.key.push(a);
		this.value.push(b);
		return b.toString();
	}
	public <K> Object get(K a){
		int indexs = this.key.indexOf(a);
		return indexs == -1 ? null : this.value.get(indexs);
	}
	public <K> boolean remove (K a){
		int indexs = this.key.indexOf(a);
		if(indexs != -1){
			this.key.remove(indexs);
			this.value.remove(indexs);
		}
		return indexs == -1 ? false : true;
	}
	public Object[] forEach(){
		this.forEachs.clear();
		if(this.item < this.key.length){
			
			this.forEachs.push(key.get(this.item));
			this.forEachs.push(value.get(this.item));
			this.item++;
			
		}else{
			this.stop = true;
		}
		return this.forEachs.toArray();
	}
	public void setStart(){
		this.item = 0;
	}
}
