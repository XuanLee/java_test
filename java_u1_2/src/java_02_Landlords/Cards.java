package java_02_Landlords;

public class Cards implements Comparable{
	private int[] cardArray=new int[56];
	private int card;
	private int index=0;
	public int[] getCardArray() {
		return cardArray;
	}
	public void setCardArray(int[] cardArray) {
		this.cardArray = cardArray;
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.cardArray[index++] = card;
	}
	
	
	
	public int compareTo(Object o) {
		
		Cards s=(Cards)o;
		for(int i=0;i<cardArray.length;i++){
		if(this.cardArray[i]>s.cardArray[i])
			return 1;
			else 
			return -1;	
		}
		return -1;
		
	}

	
}
