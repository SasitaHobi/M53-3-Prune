package main;

public class LetterItem extends Item{
    public boolean isSolved;

    public LetterItem(String name, String descr, boolean isSolved) {
        super(name, descr);
        isSolved=this.isSolved;
    }
    
}
