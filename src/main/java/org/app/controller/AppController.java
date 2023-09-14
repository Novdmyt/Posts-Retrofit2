package org.app.controller;

import org.app.model.AppModel;
import org.app.view.AppView;

public class AppController {
    public class AppController {

        AppModel model;
        AppView view;

        public AppController(AppModel model, AppView view) {
            this.model = model;
            this.view = view;
        }
}
