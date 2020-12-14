package com.example.application.ui.horizontal.unserunternehmen;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "Nachrichten", layout = MainView.class)
@PageTitle("Nachrichten")
public class NewsView extends Div {

    public NewsView() {
        setId("news-view");
        add(new Text("Nachrichten"));
    }

}
