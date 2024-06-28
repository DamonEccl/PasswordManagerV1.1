package org.example;

public enum View {
    LOGIN("/login.fxml"),
    SIGNUP("/signup.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
