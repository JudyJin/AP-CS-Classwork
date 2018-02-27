 
import java.util.*;

class Card
{
  String suit;
  String name;
  int value;
  
  public Card(String suit, String name, int value)
  {
    this.suit = suit;
    this.name = name;
    this.value = value;
  }
  
  public String toString(){
      return "suits: "+this.suit+ "  name: "+ this.name + "  value: "+ this.value;
  }
}
