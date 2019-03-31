public class Main {
class Person {
    int number;
    public Person (int number){
        this.number = number;
    }

}
class LinkedList {
int key;
Person person;
LinkedList next;
public LinkedList(Person person ){
    this.person = person;
    this.next=null;
}

}
class LinkedHash {
LinkedList [] ll = new LinkedList[100];
public LinkedList[] hash (Person pers){
 ll[pers.number%100] = new LinkedList(pers);
 ll[pers.number%100].person = pers;
 return ll;
}
}
}
