 
import java.util.*;

class Deck
{
  Card[] cards;
  int size;
  
  public Deck()
  {
    cards = new Card[52];
    size = 0;
  }
  
  public void add(String suit, String name, int value)
  {
    Card temp = new Card(suit, name, value);
    cards[size] = temp;
    size ++;
  }
  
  public void shuffle()
  {
    int t1, t2;
    int i;
    Card temp;
    for (i = 0; i < 100; i ++)
    {
      t1 = (int)(Math.random() * size);
      t2 = (int)(Math.random() * size);
      temp = cards[t1];
      cards[t1] = cards[t2];
      cards[t2] = temp;
    }
  }
  
  public void sort()
  {
    int i, j;
    Card temp;
    for(i = 0; i <size - 1; i ++)
      for (j = i + 1; j < size; j ++)
        if (cards[i].suit.compareTo(cards[j].suit) > 0 || cards[i].suit.compareTo(cards[j].suit) == 0 && cards[i].value < cards[j].value)
        {
          temp = cards[i];
          cards[i] = cards[j];
          cards[j] = temp;
        }
  }
  
  public String toString(){
      String a=new String();
      for(int i=0; i<size-1;i++){
          a+="cards: "+cards[i].toString()+"\n";
      }
      return a;
  }
  
}