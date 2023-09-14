package org.app.controller;

import org.app.model.AppModel;
import org.app.view.AppView;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        filterChoice(view.chooseOption());
    }
     private void filterChoice(String choice) {
        switch (choice) {
            case "1" -> model.readPost();
            case "2" -> model.readPostById();
            case "0" -> view.getOutput(" App closed");
            default -> view.getOutput("Unexpected value: " + choice);
        }

    }
}