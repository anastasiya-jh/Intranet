package com.example.application.ui.horizontal.bibliothek;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "Wiki", layout = MainView.class)
@PageTitle("Wiki")
public class WikiView extends Div {

    public WikiView() {
        setId("bibliothek-view");
        add(new Text("Wiki"));
    }

}
