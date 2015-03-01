
public class IngFilter implements Iterator{

	private Iterator iter;
	private String ingString, backUpString;
	
	IngFilter(Iterator iter){
		
		this.iter = iter;
		
	}
	
	public boolean hasNext() {
		
		backUpString="";
		while(iter.hasNext()){
			backUpString= (String) iter.next();
			
			if( backUpString.toLowerCase().contains("ing")){
				ingString =backUpString;
				break;
			}
			else{
				backUpString ="";
			}
		}
		
		if(backUpString == ""){
			return false;
		}
		else{
			return true;
		}
			
     }

	public Object next() {
		
		return ingString;
		
    }

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
