package com.example.application.ui.horizontal.unserunternehmen;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "UeberUns", layout = MainView.class)
@PageTitle("Über Uns")
public class AboutUsView extends Div {

    public AboutUsView() {
        setId("aboutUs-view");
        add(new Text("Über Uns"));
    }

}
