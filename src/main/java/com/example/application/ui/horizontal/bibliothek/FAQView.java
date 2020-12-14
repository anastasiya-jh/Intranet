package com.example.application.ui.horizontal.bibliothek;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "FAQ", layout = MainView.class)
@PageTitle("FAQ")
public class FAQView extends Div {

    public FAQView() {
        setId("FAQ-view");
        add(new Text("FAQ"));
    }

}
