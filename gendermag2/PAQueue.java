package gendermag2;

import java.util.Collection;

public interface PAQueue<T>  {
	 
    public void addSong(T Song);
 
    public void clearall();
 
    public boolean isEmpty();
 
    public T peekSong();
 
    public void pushSong(T Song);
 
    public T removeSong();
 
    public int year();
}
