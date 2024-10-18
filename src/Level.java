class Note {
    private int note;
    private int length;

    public Note(int inputNote, int inputLength) {
        note = inputNote;
        length = inputLength;
    }

    public int getNote() {
        return note;
    }

    public int getLength() {
        return note;
    }
}


public class Level {
    private Note[] notes;
    private float playerHealth; // player health will be a value between -1 and 1, where -1 means theyre losing, 0 is neutral, and 1 means theyre winning against the enemy
    public static void main(String[] args) {

    }

    public Level(String[] levelFilePath) {
        // set notes
    }
}
