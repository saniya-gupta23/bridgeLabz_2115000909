class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

class TextEditor {
    private TextState current;
    private int maxSize;
    private int size;

    public TextEditor(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
    }

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            newState.prev = current;
            current.next = newState;
        }
        current = newState;
        size++;
        if (size > maxSize) {
            TextState temp = current;
            while (temp.prev != null && size > maxSize) {
                temp = temp.prev;
                size--;
            }
            temp.prev = null;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayState() {
        System.out.println(current != null ? current.content : "No content");
    }
}

public class UndoRedo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.displayState();
        editor.undo();
        editor.displayState();
        editor.redo();
        editor.displayState();
    }
}
