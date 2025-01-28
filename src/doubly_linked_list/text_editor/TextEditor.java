package doubly_linked_list.text_editor;

import java.util.Scanner;

class TextEditor {
    private TextState currentState;
    private TextState head;
    private TextState tail;
    private int historySize;
    private int currentHistorySize;

    public TextEditor(int historySize) {
        this.historySize = historySize;
        this.currentHistorySize = 0;
        this.head = null;
        this.tail = null;
        this.currentState = null;
    }

    public void addState(String content) {
        TextState newState = new TextState(content);

        if (currentState == null) {
            head = newState;
            tail = newState;
            currentState = newState;
        } else {
            if (currentState.next != null) {
                currentState.next = null;
            }
            currentState.next = newState;
            newState.prev = currentState;
            currentState = newState;
            tail = currentState;
        }

        if (currentHistorySize < historySize) {
            currentHistorySize++;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Current content: " + content);
    }

    public void undo() {
        if (currentState == null || currentState.prev == null) {
            System.out.println("No previous state available.");
        } else {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.content);
        }
    }

    public void redo() {
        if (currentState == null || currentState.next == null) {
            System.out.println("No next state available.");
        } else {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.content);
        }
    }

    public void displayCurrentState() {
        if (currentState == null) {
            System.out.println("No content.");
        } else {
            System.out.println("Current state: " + currentState.content);
        }
    }
}
