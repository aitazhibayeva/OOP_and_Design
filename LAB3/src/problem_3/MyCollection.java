package problem_3;

public interface MyCollection {
	
	  int size();
	  boolean isEmpty();
	  void clear();
	  void add(Object obj);
	  void remove(Object o);
	  String toString();
	  Object[] toArray();
	  boolean equals(Object anotherObject);
	  int hashCode();
	  Object get(int index);
	  int[] sort(int[] arr);
	  int[] duplicate(int[] arr);
	  boolean contains(Object o);

}