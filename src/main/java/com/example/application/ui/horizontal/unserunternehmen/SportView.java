package com.example.application.ui.horizontal.unserunternehmen;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "SportUndFreizeit", layout = MainView.class)
@PageTitle("Sport&Freizeit")
public class SportView extends Div {

    public SportView() {
        setId("sport-view");
        add(new Text("Sport&Freizeit"));
    }

}
