package org.app.utils;

import org.app.controller.AppController;
import org.app.model.AppModel;
import org.app.view.AppView;

public class AppStarter    {

    public static void startApp() {
        AppModel appModel = new AppModel();
        AppView appView = new AppView();
        AppController controller = new AppController(appModel, appView);
        controller.runApp();
    }
}
