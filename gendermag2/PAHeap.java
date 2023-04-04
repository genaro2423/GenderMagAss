package gendermag2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PAHeap implements PAQueue<Song> {
	 
	    public Song[] heap;
	    public static int year;
	 
	    public PAHeap() {
	        heap = new Song[20];
	        year = 0;
	    }
	    
	   
	    public void addSong(Song Song) {
	        if (year >= heap.length) {
	            heap = Arrays.copyOf(heap, 2 * heap.length);
	        }
	        heap[year] = Song;
	        year++;
	        int index = year - 1;
	 
	        while (index > 0) {
	            int parent = (index - 1) / 2;
	            if (heap[parent].compareTo(heap[index]) < 0) {
	                Song temp = heap[parent];
	                heap[parent] = heap[index];
	                heap[index] = temp;
	                index = parent;
	            } else {
	                return;
	            }
	        }
	    }
	 
	    @Override
		public String toString() {
			return "MyHeap [heap=" + Arrays.toString(heap) ;
		}


		public void clearall() {
	        for (int i = 0; i < year; i++) {
	            heap[i] = null;
	        }
	        year = 0;
	    }
	 
	    public boolean isEmpty() {
	        if (year == 0) {
	            return true;
	        }
	        return false;
	    }
	 
	    public Song peekSong() {
	        if (this.isEmpty()) {
	        	throw new NoSuchElementException();
	        }
	        return heap[0];
	    }
	 
	    public void pushSong(Song Song) {
	        if (year >= heap.length) {
	            heap = Arrays.copyOf(heap, 2 * heap.length);
	        }
	        heap[year] = Song;
	        year++;
	        int index = year - 1;
	 
	        while (index > 0) {
	            int parent = (index - 1) / 2;
	            if (heap[parent].compareTo(heap[index]) < 0) {
	                Song temp = heap[parent];
	                heap[parent] = heap[index];
	                heap[index] = temp;
	                index = parent;
	            } else {
	                return;
	            }
	        }
	    }
	 
	    public Song removeSong() {
	        if (this.isEmpty()) {
	            throw new NoSuchElementException();
	        }
	        Song ret = heap[0];
	        heap[0] = heap[year - 1];
	        year--;
	        heapSort(0);
	        return ret;
	    }
	 
	    public int year() {
	        return year;
	    }
	 
	   public void heapSort(int index) {
	        int left = 2 * index + 1;
	        int right = 2 * index + 2;
	        int largest = index;
	        if (left < year && heap[left].compareTo(heap[largest]) > 0) {
	            largest = left;
	        }
	        if (right < year && heap[right].compareTo(heap[largest]) > 0) {
	            largest = right;
	        }
	        if (largest != index) {
	            Song temp = heap[index];
	            heap[index] = heap[largest];
	            heap[largest] = temp;
	            heapSort(largest);
	        }
	    }
	   
	 
	    // A utility function to print the array
	    // representation of Heap
	   public static void printHeap(int arr[], int N)
	    {
	        System.out.println(
	            "Array representation of Heap is:");
	 
	        for (int i = 0; i < N; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }

	    


		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}


		public Iterator<Song> iterator() {
			// TODO Auto-generated method stub
			return null;
		}


		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}


		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}


		public boolean add(Song e) {
			// TODO Auto-generated method stub
			return false;
		}


		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}


		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}


		public boolean addAll(Collection<? extends Song> c) {
			// TODO Auto-generated method stub
			return false;
		}


		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		public static void main(String[] args) {
	        PAHeap heap = new PAHeap();
	        heap.addSong(new Song("Jailhouse Rock", 2002));
	        heap.addSong(new Song("Hotel California", 2013));
	        heap.addSong(new Song("Take on me", 2004));
	        heap.addSong(new Song("Billie Jean", 1999));
	        heap.addSong(new Song("Let it be", 2001));
	        heap.addSong(new Song("Africa", 1998));
	        heap.addSong(new Song("More than a feeling", 1995));
	        heap.addSong(new Song("Smells like teen spirit", 2002));
	        heap.addSong(new Song("Stand by me", 2000));
	        heap.addSong(new Song("Satisfaction", 2012));
	        heap.addSong(new Song("Nothing Compares 2 u", 1995));
	        heap.addSong(new Song("Don't stop believin", 1990));
	        heap.addSong(new Song("Imagine", 1985));
	        heap.addSong(new Song("Beat it", 1987));
	        heap.addSong(new Song("Under the bridge", 2009));
	        heap.addSong(new Song("Fast Car", 1994));
	        heap.addSong(new Song("Purple Rain", 1991));
	        heap.addSong(new Song("Houng Dog", 1982));
	        heap.addSong(new Song("Hey Jude", 1980));
	        heap.addSong(new Song("Sweet Caroline", 1984));
	 
	        
	        System.out.println(heap.toString());
	        
	        heap.removeSong();
	        System.out.println(heap.toString());
	        
		}
	      
	}
	 
	
	 
	

