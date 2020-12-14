package com.example.application.ui.horizontal.bibliothek;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.ui.MainView;

@Route(value = "ArchiveView", layout = MainView.class)
@PageTitle("Archive")
public class ArchiveView extends Div {

    public ArchiveView() {
        setId("archive-view");
        add(new Text("Archive"));
    }

}
